package ex42;


import java.io.*;
public class App {

static void printTemplate(){
    System.out.println("Last     | First      | Salary      ");
    System.out.println("----------------------------------------");
}
    public static void main(String[] args)
    {

        String path = "/Users/korinneramcharitar/Desktop/exercise42_input.txt";
        String line = "";
        String temp;
        printTemplate();

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while((line = br.readLine()) != null){
              String[] values = line.split(",");

                System.out.println(values[0]+"         " + values[1]+ "        "+ values[2]);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}

