package Projects.DesignPatterns.SecondExample;

public class CharacterFlyweight {
    private final char character;
    private final int fontSize;
    private final String fontFace;

    public CharacterFlyweight(char character, int fontSize, String fontFace) {
        this.character = character;
        this.fontSize = fontSize;
        this.fontFace = fontFace;
    }

    public void display(int pointSize){
        System.out.println(character + " (point size " + pointSize + ")");
    }
}
