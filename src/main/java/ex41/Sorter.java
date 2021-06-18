package ex41;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
public class Sorter {

    public static void main(String[] args) {
        //call readFile class
        readFile fileObject = new readFile();
        fileObject.getData();
        String newString = fileObject.getData();


        char newArray[] = newString.toCharArray();
        Arrays.sort(newArray);

        System.out.println(newArray);


    }
}


