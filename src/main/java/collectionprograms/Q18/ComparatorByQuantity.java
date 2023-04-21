package collectionprograms.Q18;

import java.util.Collections;
import java.util.Comparator;

public class ComparatorByQuantity implements Comparator<Shop> {
    @Override
    public int compare(Shop s1, Shop s2){
        if (s1.quantity == s2.quantity)
            return 0;
        else if (s1.quantity > s2.quantity) {
            return 1;
        }
        else
            return -1;
    }

}
