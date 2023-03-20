package Homework;

public class Point3D extends Point2D{
    private float z;

    public Point3D(float x, float y, float z) {
        // Cách 1: ???
        // super để làm gì
        // Từ khóa super được sử dụng để tham chiếu trực tiếp đến biến instance của lớp cha
        super(x,y);
        this.z = z;

        // Cách 2: ???
//        this.setX(x);
//        this.setY(y);
//
//        this.z = z;

        // Cách 3:  ???
        // Từ khóa super được sử dụng để gọi trực tiếp phương thức của lớp cha.
//        super.setX(x);
//        super.setY(y);
//
//        this.z = z;
    }
    public Point3D() {
        // Chỗ này có ý nghia gì: ???
//        super();
        // super() được sử dụng để gọi trực tiếp Constructor của lớp cha.
    }

    public float getZ() {
        // Chỗ này: this có ý nghĩa gì: ???
        // Từ khóa this được sử dụng để tham chiếu tới đối tượng của lớp hiện tại.
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float [] getXYZ() {
        float[] xyz = new float[3];
        // Chỗ này là sao: ???
        // Vì sao getX() cũng được, mà this.getX() cũng được, super.getX() cũng được
        // Vì Point3D kế thừa từ lớp Point2D phuwong thức getX, getY, setX, setY
        xyz[0] = getX();            //???
        xyz[1] = super.getY();      //???
        xyz[2] = this.getZ();       //???

        return xyz;
    }

    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        this.z = z;
    }
    public String toString() {
        return String.format("(%s, %s, %s)", this.getX(), this.getY(), this.z);
    }


}