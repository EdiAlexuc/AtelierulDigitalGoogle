package Concurrency.CodeChallenge1;

import Concurrency.CodeChallenge1.RabbitRunnable;
import Concurrency.CodeChallenge1.RabbitThread;

public class Main {

    public static void main(String[] args){

        for(int i = 0; i < 10; i++){
            if(i % 2 != 0){
                Thread rabbitRunnable = new Thread(new RabbitRunnable(i));
                rabbitRunnable.start();
            } else {
                RabbitThread rabbitThread = new RabbitThread(i);
                rabbitThread.start();
            }
        }

    }
}
