package Practice1;

import java.util.Comparator;

//Tính kế thừa: ComparatorById kế thừa lớp Comparator
//Tính trừu tượng: Comparator là 1 lớp trừu tượng
public class ComparatorById implements Comparator<Employee> {

    //Tính đa hình: Lớp ComparatorById ghi đè phương thức compare của lớp Comparator
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getId() > o2.getId()) {
            return 1;
        } else if (o1.getId() == o2.getId()) {
            return 0;
        } else {
            return -1;
        }
    }
}
