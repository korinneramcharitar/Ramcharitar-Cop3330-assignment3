package ex46;

import java.io.*;
import java.util.Scanner;

public class wordCount {



        public static void main(String[] args) throws IOException
        {
            //Read in file from Desktop
            File myObj = new File("src/main/exercise46_input.txt");
            Scanner myReader = new Scanner(myObj);
            //Declare words needed to be counted
            String word = "badger";
            String word2 = "mushroom";
            String word3 = "snake";
                //create output

            System.out.println(word+":"+ searchCount(myObj,word));
            System.out.println(word2 + ":" +searchCount(myObj,word2) );
            System.out.println(word3 + ":" + searchCount(myObj,word3));

        }

        public static String searchCount(File fileA, String fileWord) throws FileNotFoundException
        {
            String count = "";
            fileWord = fileWord.trim();
            Scanner scanner = new Scanner(fileA);
                //create loop to count words declared in main
            while (scanner.hasNext())
            {
                String nextWord = scanner.next().trim();
                if (nextWord.equals(fileWord)) {
                    count += "*";
                }
            }
            //End While
            return count;

        }



    }
