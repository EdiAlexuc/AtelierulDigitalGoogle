package Concurrency.CodeChallenge3;

import java.util.Random;

public class Player extends Thread{
    private String name;
    private String choice;

    public Player(String name){
        this.name = name;
    }

    public void run(){
        // Generate a random choice for the player
        Random rand = new Random();
        int choiceNum = rand.nextInt(3);
        if(choiceNum == 0){
            choice = "rock";
        } else if (choiceNum == 1) {
            choice = "paper";
        } else {
            choice = "scissors";
        }
    }

    public String getChoice(){
        return choice;
    }
}
