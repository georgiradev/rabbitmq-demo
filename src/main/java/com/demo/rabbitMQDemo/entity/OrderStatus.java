package com.demo.rabbitMQDemo.entity;

public class OrderStatus {

    private final Order order;
    private final String process;
    private final String message;

    public OrderStatus(Order order, String process, String message) {
        this.order = order;
        this.process = process;
        this.message = message;
    }

    public Order getOrder() {
        return order;
    }

    public String getProcess() {
        return process;
    }

    public String getMessage() {
        return message;
    }
}
