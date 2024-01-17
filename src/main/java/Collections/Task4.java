package Collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Task4 {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        ArrayIterator<Integer> iterator = new ArrayIterator<>(array);

        while (iterator.hasNext()) {
            int element = iterator.next();
            System.out.println(element);
        }
    }
}

class ArrayIterator<T> implements Iterator<T>{
    private T[] array;
    private int index = 0;

    public ArrayIterator(T[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public T next() {
        if(!hasNext())
            throw new NoSuchElementException();
        return array[index++];
    }
}