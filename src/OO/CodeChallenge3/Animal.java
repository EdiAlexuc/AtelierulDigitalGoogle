package OO.CodeChallenge3;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public abstract void eat();

    public void walk(){
        System.out.println("It walks with " + this.legs + " number of legs");
    }
}
