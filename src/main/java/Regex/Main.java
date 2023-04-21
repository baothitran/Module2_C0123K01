package Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//vd1: chỉ nhập 1 số ^[0-9]$
//vd2: nhập nhiều số ^[0-9]+$
//vd3: nhập hơn 6 ký tự ^[0-9]{6,}$
//vd4: nhập chính xác 6 ký tự ^[0-9]{6}$
//vd5: nhập từ 6-10 ký tự ^[0-9]{6,10}$
//vd6: nhập

        Pattern p = Pattern.compile("^[0-9](6,)$");
        while (true) {
            System.out.print("input txt: ");
            String txt = sc.nextLine();
            if (p.matcher(txt).find()) {
                System.out.println("txt ok");
                break;
            } else {
                System.err.println("txt not ok");


            }
        }

    }
}