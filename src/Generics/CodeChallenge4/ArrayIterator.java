package Generics.CodeChallenge4;

import java.util.NoSuchElementException;

public class ArrayIterator<T> implements IArrayIterator {
    private T[] array;
    private int currentIndex;

    public ArrayIterator(T[] array) {
        this.array = array;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext(){
        return currentIndex < array.length;
    }

    @Override
    public T next(){
        if(hasNext()){
            return array[currentIndex++];
        }
        throw new NoSuchElementException();
    }
}
