package ex45;

import java.util.Scanner;
import java.io.*;

public class ReadandWrite {
    public static void main(String[] args) throws IOException {
        //pull file
        String filePath = "src/main/exercise45_input.txt";
        //read file
        Scanner sc = new Scanner(new File(filePath));
        //use stringbuffer to read each line
        StringBuilder buffer = new StringBuilder();

        while (sc.hasNextLine()) {
            buffer.append(sc.nextLine()).append(System.lineSeparator());
        }
        String fileContents = buffer.toString();
        System.out.println(fileContents);

        sc.close();
        //declare word to replaced and what with
        String oldLine = "utilize";
        String newLine = "use";
        //Replacing the old word with new
        fileContents = fileContents.replaceAll(oldLine, newLine);
        //write new file
        FileWriter writer = new FileWriter(filePath);
        System.out.println("");
        //print out new paragraph
        System.out.println(fileContents);
        writer.append(fileContents);
        writer.flush();
    }
}