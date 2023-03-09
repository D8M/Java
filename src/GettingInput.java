import java.util.Scanner;


public class GettingInput {
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name, age and salary: ");
		
		//Scanning for String input
		String name = sc.next();
		
		//Scanning for age
		int age = sc.nextInt();
		
		//Scanning for salary
		double salary = sc.nextDouble();
					
		sc.close();
		
		System.out.print("Your name is: " + name + " and you're age is: " + age
				+ " and you earn: " + salary + " which is at least, income!");
		
	}

}
