package Exceptions.CodeChallenge1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Phonebook {
    public static void main(String[] args) {
        String urlString = "https://raw.githubusercontent.com/miualinionut/java-training/master/_4_exceptions_io/_test_files/in/phonebook.txt";

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(urlString).openStream()))){
            String line;
            while((line = reader.readLine() )!= null){
                String[] parts = line.split("\\s+");
                if(parts[0].equals("Abbey")){
                    System.out.println("Phone number for Abbey: " + parts[1]);
                } else if (parts[0].equals("Abdul")) {
                    System.out.println("Phone number for Abdul: " + parts[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
