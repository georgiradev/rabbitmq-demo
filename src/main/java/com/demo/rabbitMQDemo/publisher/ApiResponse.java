package com.demo.rabbitMQDemo.publisher;

import com.demo.rabbitMQDemo.entity.Order;
import com.demo.rabbitMQDemo.entity.OrderStatus;

public class ApiResponse {

    private Order order;
    private OrderStatus orderStatus;
    private String restaurantName;

    public ApiResponse(Order order, OrderStatus orderStatus, String restaurantName) {
        this.order = order;
        this.orderStatus = orderStatus;
        this.restaurantName = restaurantName;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    @Override
    public String toString() {
        return "Current Order: {" +
                "order=" + order +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
