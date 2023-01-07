package DesignPatterns.CodeChallenge4;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements ObservedSubject{
    private List<Observer> students;
    private String message;

    public Teacher(){
        this.students = new ArrayList<>();
    }
    @Override
    public void register(Observer obj){
        students.add(obj);
    }

    @Override
    public void unregister(Observer obj){
        students.remove(obj);
    }
    @Override
    public void notifyObservers(String message){
        this.message = message;
        for(Observer student : students){
            student.update(message);
        }
    }

    public void teach(String message){
        System.out.println("Teacher: " + message);
        notifyObservers(message);
    }
}
