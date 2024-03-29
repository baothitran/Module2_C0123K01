package Practice;
import java.util.Comparator;
public class ComparatorByCreateDate implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getCreateAt().compareTo(o2.getCreateAt());
    }
}