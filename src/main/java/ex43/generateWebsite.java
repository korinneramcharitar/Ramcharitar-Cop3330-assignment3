package ex43;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class generateWebsite {

    //Create attributes of the website to be set by the user.
    String Name;
    String author;
    String path;

    //Create function to create the website folder.
    public String createWebsite() {


        String directory = path + Name;
        File newFolder = new File(directory);


        newFolder.mkdirs();
        return directory;


    }


    public String createJSFolder() {


        String directory = path + Name + "/js";
        File newFolder = new File(directory);

//Create the folder and return the directory
        newFolder.mkdirs();
        return directory;


    }


    public String createCSSFolder() {


        String directory = path + Name + "/css";
        File newFolder = new File(directory);


        newFolder.mkdirs();
        return directory;

    }

    //Create a function to create the HTML file
    public String createHTMl() {

//Establish path
        String directory = path + Name + "/index.html";

//Create element for website to contain name and author
        String htmlContent = "<title> " + Name + " </title>\n<meta> " + author + " </meta>";

//Create the file
        File file = new File(directory);

        try {

//Write in file
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(htmlContent);
            writer.close();
            return directory;

//Exit if any exceptions are found.
        } catch(Exception ex) {

            return "File could not be created";
        }

    }

}




