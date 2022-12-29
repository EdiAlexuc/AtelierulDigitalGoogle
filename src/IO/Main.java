package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void readAndWrite() throws IOException {
        FileInputStream input = new FileInputStream("in.txt");
        FileOutputStream output = new FileOutputStream("out.txt");
        int c;
        while((c = input.read()) != -1) {
            output.write(c);
        }
    }

    public static void main(String[] args) {
        try{
            readAndWrite();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {

        }
    }
}
