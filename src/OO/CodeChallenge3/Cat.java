package OO.CodeChallenge3;

public class Cat extends Animal implements Pet{
    private String catName;

    public Cat(String catName) {
        super(4);
        this.catName = catName;
    }

    public Cat() {
        this("");
    }

    @Override
    public void eat() {
        System.out.println("Cats eat mice");
    }

    @Override
    public String getName() {
        return catName;
    }

    @Override
    public void setName(String name) {
        this.catName = name;
    }

    @Override
    public void play() {

    }
}
