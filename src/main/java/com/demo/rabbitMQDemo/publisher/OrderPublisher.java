package com.demo.rabbitMQDemo.publisher;

import com.demo.rabbitMQDemo.config.Constants;
import com.demo.rabbitMQDemo.entity.Order;
import com.demo.rabbitMQDemo.entity.OrderStatus;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/order")
public class OrderPublisher {

    private RabbitTemplate rabbitTemplate;

    public OrderPublisher(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @PostMapping("/{restaurantName}")
    public ApiResponse bookOrder(@RequestBody Order order, @PathVariable String restaurantName) {
        order.setOrderId(UUID.randomUUID().toString());
        OrderStatus orderStatus = new OrderStatus(order, "PROCESS", "Order Successfully Placed" + restaurantName);

        rabbitTemplate.convertAndSend(Constants.EXCHANGE, Constants.ROUTING_KEY, orderStatus);
        return new ApiResponse(order, orderStatus, restaurantName);
    }
}
