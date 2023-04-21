package collectionprograms.Q18;

import java.util.ArrayList;
import java.util.Collections;

//Q18 Write a program to sort ArrayList using Comparable and Comparator?
public class Shop {
    long productID;
    String name;
    int quantity;
    public Shop() {};

    public Shop(long productID, String name, int quantity) {
        this.productID = productID;
        this.name = name;
        this.quantity = quantity;
    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "productID=" + productID +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Shop> s = new ArrayList<>();
        s.add(new Shop(1, "Bag", 231));
        s.add(new Shop(2, "Shoes", 210));
        s.add(new Shop(3, "Perfume", 659));
        s.add(new Shop(4, "Accesories", 145));
        Collections.sort(s, new ComparatorByQuantity());
        for(Shop shop : s) {
            System.out.println(shop.productID+ " " + shop.name + " " + shop.quantity + " ");
        }

    }
}
