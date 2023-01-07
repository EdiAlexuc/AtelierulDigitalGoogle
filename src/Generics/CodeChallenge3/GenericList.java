package Generics.CodeChallenge3;

public class GenericList<T> implements IGenericList<T>{
    private IGenericNode<T> head;
    private IGenericNode<T> tail;
    private int size;

    public GenericList(T rootValue) {
    }


    public void insert(T element){
        IGenericNode<T> newNode = new GenericNode<>(element);
        if( head == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;

    }
    public void println(){
        IGenericNode<T> current = head;
        while (current != null){
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
}
