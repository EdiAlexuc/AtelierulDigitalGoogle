package Generics.CodeChallenge2;

public class Pair<T extends Shoe> {
    private T first;
    private T second;

    public Pair(T firstElement, T secondElement) throws Exception {
        first = firstElement;
        second = secondElement;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }


}
