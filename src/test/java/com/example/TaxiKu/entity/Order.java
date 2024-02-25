package com.example.TaxiKu.entity;

public class Order {
    private String driverName;
    private String carNumber;
    private double orderAmount;
    private String currency;
    private String orderDate;

    // Constructor
    public Order(String driverName, String carNumber, double orderAmount, String currency, String orderDate) {
        this.driverName = driverName;
        this.carNumber = carNumber;
        this.orderAmount = orderAmount;
        this.currency = currency;
        this.orderDate = orderDate;
    }

    // Getter and Setter for Driver's Name
    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    // Getter and Setter for Car Number
    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    // Getter and Setter for Order Amount
    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    // Getter and Setter for Currency
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    // Getter and Setter for Order Date
    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "driverName='" + driverName + '\'' +
                ", carNumber='" + carNumber + '\'' +
                ", orderAmount=" + orderAmount +
                ", currency='" + currency + '\'' +
                ", orderDate='" + orderDate + '\'' +
                '}';
    }
}
