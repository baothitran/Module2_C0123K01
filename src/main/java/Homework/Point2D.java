package Homework;

import java.util.Arrays;

public class Point2D {
    // Biến x này là gì:    ???
    // Thuộc tính
    private float x;          // 0.0f
    private float y;

    // Hàm khởi tạo để làm gì: ???
    // Để khởi tạo đối tượng mà trong đó ta có thể cập nhật được giá trị thộc tính của nó
    // đặc điểm hàm khởi tạo là trùng tên lớp, không có giá trị trả về
    public Point2D() {

    }
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    // Getter, setter để làm gì: ???
    // Là các phương thức được sử dụng để lấy và cập nhật giá trị thuộc tính
    public float getX() {
        return this.x;
    }
    public float getY() {
        return this.y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float [] getXY() {
        float[] xy = new float[2];
        xy[0] = x;
        xy[1] = y;
        return xy;
    }

    public static void main(String[] args) {
        //----------Ra cái gì
        String toado = "(2,3)"; // toado: "(2,3)"

        int indexLast = toado.lastIndexOf(")");         // số 4
        String data = toado.substring(1, indexLast ); // data: "2,3"

        String[] items = data.split(","); // ["2","3"]

        System.out.println(Arrays.toString(items)); // [2,3]
    }

    // phương thức toString() từ đâu ra và nó để làm gì         ???
    // Tại sao phải ghi đè phương thức này                      ???
     // phương thức toString() từ lớp Object ra và để trả về 1 chuỗi hiển thị thông tin của đối tượng
    //Vì phương thức này không muốn sử dụng phương thức toString thừa hưởng của lớp Object nên phải ghi đè lên để hiển thị theo cách khác
    @Override
    public String toString() {
        // (2,3)
        return String.format("(%s,%s)", this.x, this.y);
    }



}