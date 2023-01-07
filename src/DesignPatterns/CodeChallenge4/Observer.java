package DesignPatterns.CodeChallenge4;

public interface Observer {
    void update(String message);
    void listenTo(ObservedSubject subject);
}
