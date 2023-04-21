package casedemo.service;

import casedemo.model.OrderItem;
import casedemo.utils.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class OrderItemServiceWithFile implements IOrderItemService {
    private final String pathOrderItem = "F:\\BaoThi\\C0123K1_Module2\\src\\main\\java\\casedemo\\data\\orderitem.csv";

    @Override
    public List<OrderItem> getOrderItemByOrderId(long idOrder) {
        List<OrderItem> orderItems = FileUtils.readDataFromFile("F:\\BaoThi\\C0123K1_Module2\\src\\main\\java\\casedemo\\data\\orderitem.csv",FileUtils.CLASS_ORDER_ITEM);
        List<OrderItem> results = new ArrayList<>();
        for (int i=0; i<orderItems.size();i++) {
            if (orderItems.get(i).getIdOrder() == idOrder) {
                results.add(orderItems.get(i));
            }
        }

        return null;
    }

    @Override
    public List<OrderItem> getAll() {
        return FileUtils.readDataFromFile(pathOrderItem, FileUtils.CLASS_ORDER_ITEM );
    }

    @Override
    public void addOrderItems(List<OrderItem> orderItems) {
        List<OrderItem> datas = getAll();
        datas.addAll(orderItems);
        FileUtils.writeDataToFile(pathOrderItem, datas);
    }
}
