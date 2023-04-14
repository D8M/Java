import java.util.Scanner;
public class JavaLessonFiveMethods {

    //static double myPI = 3.14159; // Class variable
    static int randomNumber; // Class variable

    static Scanner userInput = new Scanner(System.in);


    public static void main(String[] args) {
        //access modifier, static, returnType mtd name()-> Static used to execute a mtd not part of a class definition -> Like above var using static outside of this class

        //System.out.println(addThem(10,10));
        //int d = 5;
        //tryToChange(d);
        //System.out.println("main d = " + d);

        System.out.println(getRandomNum());
        int guessResult = 1;
        int randomGuess = 0;

        while (guessResult != -1)
        {
            System.out.print("Guess a number between 1 & 50!");

            randomGuess = userInput.nextInt();
            guessResult = checkGuess(randomGuess);
        }
    System.out.println("Yes the random number is " + randomGuess);
    }

//    public static int addThem(int a, int b)
//    {
//        //double smallPI = 3.140; // Local var
//        int c = a + b;
//
//        return c;
//
//    }

//    public static void tryToChange(int d) // New value of 'd' created here as opposed to above 'd' value, also, they are in separate methods
//    {
//        d = d +1;
//        System.out.println("tryToChange d = " + d);
//
    public static int getRandomNum()
    {
        randomNumber = (int)(Math.random() * 51);
        return randomNumber;
    }

    public static int checkGuess(int guess)
    {
        if(guess == randomNumber )
        {
            return -1;
        }
        else
        {
            return guess;
        }
    }

}
