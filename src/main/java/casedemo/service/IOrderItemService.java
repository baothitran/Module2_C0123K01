package casedemo.service;

import casedemo.model.OrderItem;

import java.util.List;

public interface IOrderItemService {
    List<OrderItem> getOrderItemByOrderId(long idOrder);
    List<OrderItem> getAll();
    void addOrderItems(List<OrderItem> orderItems);
}
