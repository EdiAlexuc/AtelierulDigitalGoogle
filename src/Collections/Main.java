package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static List getList(){
        List list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Empty");
        list.add("Something");
        System.out.println(list);
        return list;
    }

    public static void main(String[] args) {
        List a = getList();
        Iterator<String> it = a.iterator();
        while(it.hasNext()){
            if(it.next() == "Third") {
                it.remove();
                a.remove(2);
            }
        }
        System.out.println(a);
    }
}
