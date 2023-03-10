package org.example;
import java.util.Scanner;
public class Currency {
    public static void main(String[] args) {
//        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập số tiền usd: ");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.print("Giá trị VND: " + quydoi);
    }
}
