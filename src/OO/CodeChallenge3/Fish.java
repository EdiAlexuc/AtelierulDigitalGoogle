package OO.CodeChallenge3;

public class Fish extends Animal implements Pet{

    private String fishName;

    protected Fish() {
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("Fish eats underwater plants");
    }

    @Override
    public void walk() {
        System.out.println("Fish has no legs so can't walk");
    }

    @Override
    public String getName() {
        return fishName;
    }

    @Override
    public void setName(String name) {
        this.fishName = name;
    }

    @Override
    public void play() {

    }
}
