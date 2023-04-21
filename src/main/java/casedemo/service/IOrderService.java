package casedemo.service;

import casedemo.model.Order;

import java.util.List;

public interface IOrderService {
    List<Order> getAll();
    Order findOrderById(long idOrer);
    void updateOrderById(long id, Order order);
    void deleteOrderById(long id);
    void addOrder(Order order);
}
