package Collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Task7_4 {
    public static void main(String[] args) {
        Integer[][] nums = new Integer[][]{{1,2,3}, {4,5,6}};
        TwoDimensionalArrayIterator<Integer> iterator = new TwoDimensionalArrayIterator<>(nums);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

class TwoDimensionalArrayIterator<T> implements Iterator<T> {
    private final T[][] array;
    private int row = 0;
    private int col = 0;

    TwoDimensionalArrayIterator(T[][] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return row < array.length && col < array[row].length;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T result = array[row][col];
        col++;
        if (col >= array[row].length) {
            col = 0;
            row++;
        }
        return result;
    }
}
