package DesignPatterns.CodeChallenge4;

public class Student implements Observer{
    private ObservedSubject teacher;
    private String name;

    public Student(String name) {
        this.teacher = teacher;
        this.name = name;
    }
    @Override
    public void listenTo(ObservedSubject subject){
        this.teacher = subject;
        teacher.register(this);
    }

    @Override
    public void update(String message){
        System.out.println(name + ": Received message from teacher: " + message);
    }
}
