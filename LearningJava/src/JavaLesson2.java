import java.util.Scanner;
public class JavaLesson2 {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Your fav number: ");
        if(userInput.hasNextInt()){

            int numberedEntered = userInput.nextInt();
            System.out.println(("You entered number " + numberedEntered));

            int numberedEnteredTimes2 = numberedEntered + numberedEntered;
            System.out.print(numberedEntered + " + " + numberedEntered + " = " + numberedEnteredTimes2 + "\n" );

            int numberedEnteredMultipliedByNumberEntered = numberedEntered * numberedEntered;
            System.out.print( numberedEntered + " * " + numberedEntered + " = " + numberedEnteredMultipliedByNumberEntered);

            int numABS = Math.abs(numberedEntered);
            System.out.print( "\n" + "Absolute Value of Num entered is: " + numABS);

            double numSqurt = Math.sqrt(numberedEntered);
            System.out.print( "\n" + "Square root Value of Num entered is: " + numSqurt);

            int random_number = (int) (Math.random() * 11 );
            System.out.print( "\n" + "Random num generated is: " + random_number);

        }
        else{
            System.out.print("Enter an integer please...");


        }

    }


}