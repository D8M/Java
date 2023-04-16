import java.util.*;
import java.io.*;
public class JavaLesson6 {

    //static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args){

//        System.out.println("How old are you?");
//        //int age = checkAgeValid();
//
//        if(age != 0){
//            System.out.println("You are " + age + " years old");
//        }

        getAFile("./somestuff.txt");

    }

//    public static void divideByZer0(int a){
//
//        try
//        {
//            System.out.println(a/0);
//        }
//
//        catch (ArithmeticException e)
//        {
//            System.out.println("You cant do that!!");
//            System.out.println((e.getMessage()));
//            System.out.println((e.toString()));
//            e.printStackTrace();
//        }
//
//    }

//    public static int checkAgeValid(){
//
//        try
//        {
//            return userInput.nextInt();
//        }
//        catch (InputMismatchException e)
//        {
//            userInput.next(); // Skips over whatever a person typed at the keyboard to the next input
//            System.out.println("That isn't a whole number...");
//            return 0;
//        }
//    }

    public static void getAFile(String fileName){

        try
        {
        FileInputStream file = new FileInputStream(fileName);
        }
        catch (FileNotFoundException e)
        {
            System.out.println(("Sorry, I cant seem to find that file..."));
        }
        catch (IOException e)
        {
            System.out.println(("Unknown IO Error..."));
        }

        catch(Exception e)
        {
            System.out.println("There was an error...");
        }

        finally{
            System.out.println("Finally is always called and ran");
        }



    }






}
