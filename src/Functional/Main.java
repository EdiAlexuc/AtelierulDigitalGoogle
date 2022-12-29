package Functional;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("G:\\AtelierulDigitalGoogle\\src\\Functional\\input.txt"));
        long characterCount = reader
                .lines()
                .flatMap(line -> {
                    return Stream.of(line.split(""));
                })
                .count();
        System.out.println("Number of characters: " + characterCount);
        reader.close();
    }

}
