package Projects.DesignPatterns.SecondExample;

public class Document {
    private String content;
    private CharacterFactory characterFactory;

    public Document(String content){
        this.content = content;
        this.characterFactory = new CharacterFactory();
    }

    public void display(){
        for(int i =0; i < content.length(); i++){
            characterFactory.getCharacter(content.charAt(i)).display(14);
        }
    }
}
