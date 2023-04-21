package casedemo.service;

import DSA.LinkedList.main;
import casedemo.model.Order;
import casedemo.model.OrderItem;
import casedemo.utils.FileUtils;

import java.util.List;



public class OrderServiceWithFile implements IOrderService {
    private final String pathOrder = "F:\\BaoThi\\C0123K1_Module2\\src\\main\\java\\casedemo\\data\\order.csv";
    private IOrderItemService iOrderItemService;
    public OrderServiceWithFile() {
        iOrderItemService = new OrderItemServiceWithFile();
    }

    @Override
    public List<Order> getAll() {
        List<Order> orders = FileUtils.readDataFromFile("./data/order.csv", FileUtils.CLASS_ORDER);
        for (int i=0;i< orders.size();i++){
            List<OrderItem> orderItemsById = iOrderItemService.getOrderItemByOrderId(orders.get(i).getId());
        }

        return orders;
    }

    @Override
    public Order findOrderById(long idOrder) {
        List<Order> orders = getAll();
        for(int i=0; i<orders.size(); i++) {
          if(orders.get(i).getId() == idOrder) {
              return orders.get(i);
          }
        }
        return null;
    }


    @Override
    public void updateOrderById(long id, Order order) {

    }

    @Override
    public void deleteOrderById(long id) {

    }

    @Override
    public void addOrder(Order order) {
      List<Order> orders = getAll();
      orders.add(order);
      FileUtils.writeDataToFile(pathOrder,orders);
    }
}
