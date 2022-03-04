package com.demo.rabbitMQDemo.consumer;

import com.demo.rabbitMQDemo.config.Constants;
import com.demo.rabbitMQDemo.entity.OrderStatus;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class User {

    @RabbitListener(queues = Constants.QUEUE )
    public void consumeMessageFromQueue(OrderStatus orderStatus) {
        System.out.println("Message Received from queue: " + orderStatus );
    }
}
