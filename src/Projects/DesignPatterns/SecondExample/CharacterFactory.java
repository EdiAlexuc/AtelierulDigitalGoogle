package Projects.DesignPatterns.SecondExample;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private Map<Character, CharacterFlyweight> characters = new HashMap<>();

    public CharacterFlyweight getCharacter(char key){
        CharacterFlyweight character = characters.get(key);
        if(character == null){
            character = new CharacterFlyweight(key, 12, "Arial");
            characters.put(key, character);
        }
        return character;
    }
}
