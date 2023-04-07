package JavaIO;
//import java.io.File;
//public class demo {
//        public static void main(String[ ] args) {
//            File x = new File("F:\\BaoThi\\C0123K1_Module2\\module2_5.txt ");
//
//            System.out.println("Tên file: " + x.getName());
//            System.out.println("Thư mục: " + x.getParent());
//            System.out.println("Thư mục: " + x.getPath());
//
//
//            if(x.exists()) {
//                System.out.println(x.getName() +  "exists!");
//            }
//            else {
//                System.out.println("The file does not exist");
//            }
//        }
//    }
//
import java.io.File;
import java.util.Formatter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class demo {
    public static void main(String[ ] args) {

        //Tạo thư mục
        File d = new File("F:\\xuanthulab.net");
        if (!d.exists())
            d.mkdir();

        //Tạo mới và viết nội dung vào file
        try {
            Formatter f = new Formatter("F:\\xuanthulab.net\\test.txt");
            f.format("Đây là file Vidu\r\n", null);
            f.format("%s %s %s", "1","John", "Smith \r\n");
            f.format("%s %s %s", "2","Amy", "Brown");

            f.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }

        //Đọc nội dung file
        try {
            File x = new File("F:\\xuanthulab.net\\test.txt");
            Scanner sc = new Scanner(x);
            String content = "";
            while(sc.hasNextLine()) {
                content += sc.nextLine()+"\r\n";
            }
            System.out.println(content);

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }
    }
}