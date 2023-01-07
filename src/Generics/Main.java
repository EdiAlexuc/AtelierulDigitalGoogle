package Generics;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void stringsExample(){
        List strings = new ArrayList<>();
        strings.add("Hello");
        strings.add(LocalDate.now().toString());

        for(Object o: strings){
            String s= (String) o;
            System.out.println(s + " " + s.length());
        }
    }

    public static void main(String[] args) {
        stringsExample();
    }
}

