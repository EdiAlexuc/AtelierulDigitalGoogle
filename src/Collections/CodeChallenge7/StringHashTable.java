package Collections.CodeChallenge7;

public class StringHashTable implements MyHashTable<String, String> {
    private static final int INITIAL_SIZE = 16;
    private static final double LOAD_FACTOR = 0.75;

    private int size;
    private int capacity;
    private String[] keys;
    private String[] values;

    public StringHashTable(){
        this.capacity = INITIAL_SIZE;
        this.keys = new String[capacity];
        this.values = new String[capacity];
    }

    private int hash(String key){
        int hashCode = key.hashCode();
        return hashCode % capacity;
    }

    @Override
    public String get(String key){
        int index = hash(key);
        while(keys[index] != null){
            if(keys[index].equals(key)){
                return values[index];
            }
            index = (index + 1) % capacity;
        }
        return null;
    }

    @Override
    public void put(String key, String value){
        if(size + 1 > capacity * LOAD_FACTOR){
            resize();
        }
        int index = hash(key);
        while (keys[index] != null){
            if(keys[index].equals(key)){
                values[index] = value;
                return;
            }
            index = (index + 1) % capacity;
        }
        keys[index] = key;
        values[index] = value;
        size++;
    }

    @Override
    public void remove(String key){
        int index = hash(key);
        while (keys[index] != null){
            if(keys[index].equals(key)){
                keys[index] = null;
                values[index] = null;
                size--;
                return;
            }
            index = (index + 1) % capacity;
        }
    }

    @Override
    public boolean containsKey(String key){
        int index = hash(key);
        while (keys[index] != null){
            if(keys[index].equals(key)){
                return true;
            }
            index = (index + 1) % capacity;
        }
        return false;
    }

    @Override
    public int size(){
        return size;
    }

    private void resize(){
        capacity *= 2;
        String[] oldKeys = keys;
        String[] oldValues = values;
        keys = new String[capacity];
        values = new String[capacity];
        size = 0;
        for(int i = 0; i < oldKeys.length; i++){
            if(oldKeys[i] != null){
                put(oldKeys[i], oldValues[i]);
            }
        }
    }
}
