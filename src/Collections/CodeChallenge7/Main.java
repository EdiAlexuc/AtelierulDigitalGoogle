package Collections.CodeChallenge7;

public class Main {
    public static void main(String[] args) {
        StringHashTable myStringHashTable = new StringHashTable();
        myStringHashTable.put("key1", "value1");
        myStringHashTable.put("key2", "value2");
        myStringHashTable.put("key3", "value3");
        System.out.println(myStringHashTable.size());
    }
}
