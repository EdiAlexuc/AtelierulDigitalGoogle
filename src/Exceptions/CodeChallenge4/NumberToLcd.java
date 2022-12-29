package Exceptions.CodeChallenge4;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class NumberToLcd {
    public static void main(String[] args) throws IOException {
        //Open the input and output files
        try (BufferedReader input = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter output = new BufferedWriter(new FileWriter("output.txt"))){
            // Read the input number from the file
            String number = input.readLine().strip();

            //Define the LCD style number as a map
            Map<String, String[]> lcdNumbers = new HashMap<>();
            lcdNumbers.put("0", new String[] {" _ ", "| |", "|_|"});
            lcdNumbers.put("1", new String[] {"  ", " |", "  |"});
            lcdNumbers.put("2", new String[] {" _ ", " _|", "|_ "});
            lcdNumbers.put("3", new String[] {" _ ", " _|", " _|"});
            lcdNumbers.put("4", new String[] {" _ ", "|_|", "  |"});
            lcdNumbers.put("5", new String[] {" _ ", "|_ ", " _|"});
            lcdNumbers.put("6", new String[] {" _ ", "|_ ", "|_|"});
            lcdNumbers.put("7", new String[] {" _ ", "  |", "  |"});
            lcdNumbers.put("8", new String[] {" _ ", "|_|", "|_|"});
            lcdNumbers.put("9", new String[] {" _ ", "|_|", " _|"});

            //Iterate through each digit in the number
            for(char digit: number.toCharArray()){
                //Look up the LCD style representation of the digit
                String[] lcdDigit = lcdNumbers.get(Character.toString(digit));

                //Write the LCD style representation to the output file
                for(String line: lcdDigit){
                    output.write(line);
                    output.newLine();
                }
            }
        }catch (IOException e){
            System.out.println("Fisierul nu poate fi gasit");
        }
    }
}
