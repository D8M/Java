public class LessonThree {

    public static void main(String[] args){

        int randomNum = (int) (Math.random() * 100);

        if (randomNum < 52)
        {
            System.out.print("The random number " + randomNum + " is less than 52");
        }
        else if (randomNum != 40)
        {
            System.out.print("The random number " + randomNum + " is greater than 40");
        }
        else
        {
            System.out.print("Some random stuff printed here ;)");
        }

        if(!(false))
        {
            System.out.println("\nI turned false into true");
        }

        if((false) | (true))
        {
            System.out.println("One is true...");
        }

         int valueOne = randomNum;

         int valueTwo = randomNum;

         int biggestValue = (valueOne > valueTwo) ? valueOne : valueTwo;
            System.out.println(biggestValue + "+" + valueOne + "+" + valueTwo);



    }

}