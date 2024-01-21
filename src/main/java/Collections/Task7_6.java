package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task7_6 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6));

        Iterator<Integer> iterator1 = list1.iterator();
        Iterator<Integer> iterator2 = list2.iterator();

        TwoIterators<Integer> twoIterators = new TwoIterators<>(iterator1, iterator2);

        while (twoIterators.hasNext()) {
            System.out.println(twoIterators.next());
        }
    }
}

class TwoIterators<T> implements Iterator<T> {
    private Iterator<T> iterator1;
    private Iterator<T> iterator2;
    private boolean useIterator1;

    public TwoIterators(Iterator<T> iterator1, Iterator<T> iterator2) {
        this.iterator1 = iterator1;
        this.iterator2 = iterator2;
        this.useIterator1 = true;
    }

    public boolean hasNext() {
        if (useIterator1) {
            if (iterator1.hasNext()) {
                return true;
            } else {
                useIterator1 = false;
            }
        }
        return iterator2.hasNext();
    }

    public T next() {
        if (useIterator1) {
            if (iterator1.hasNext()) {
                return iterator1.next();
            } else {
                useIterator1 = false;
            }
        }
        return iterator2.next();
    }
}
