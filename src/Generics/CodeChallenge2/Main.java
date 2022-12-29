package Generics.CodeChallenge2;

public class Main {
    public static void main(String[] args) throws Exception {
        Shoe.Running runningShoe1 = new Shoe.Running("RED", 41);
        Shoe.Running runningShoe2 = new Shoe.Running("RED", 41);
        Pair<Shoe.Running> pairOK = new Pair(runningShoe1, runningShoe2);

//        Shoe.Running runningShoe1 = new Shoe.Running("RED", 41);
//        Shoe.Boot bootShoe = new Shoe.Boot("BLACK", 45);
//        Pair<Shoe.Running> pairKO = new Pair<>(runningShoe1, bootShoe);
    }

}
