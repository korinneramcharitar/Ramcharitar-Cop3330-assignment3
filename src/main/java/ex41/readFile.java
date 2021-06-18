package ex41;



import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class readFile {

    public String getData(){
        // Scan in data from file
        try {
            File myObj = new File("src/main/exercise41_input.txt");
            Scanner myReader = new Scanner(myObj);
            if (myReader.hasNextLine()) {
                do {
                    //convert file to String
                    String getData = myReader.nextLine();
                    //print out file data

                    System.out.println(getData);

                } while (myReader.hasNextLine());
            }
            myReader.close();
            //if File not found
        } catch (FileNotFoundException e) {
            //print error message
            System.out.println("An error occurred.");
            e.printStackTrace();

    }

        return getData();
    }

}

