package basicweb;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Miniproject {
@Test
	public static void main(String[] args) {
	
		Scanner ws = new Scanner (System.in);
		int myNumber = (int)(Math.random()*100);
		int userNumber=0;
		do
		{
			System.out.println("Guess my number");
			userNumber =ws.nextInt();

			if(userNumber== myNumber)
			{
				System.out.println("WAHOHOOOOOOOOOOOOOOOOOO... The Number is Correct ");
				break;			
			}
			
			else if (userNumber > myNumber)
			{
				System.out.println("your number is too large");
			}			
			else
			{
				System.out.println("your number is too small");
			}
		}
		while(userNumber>=0);

		System.out.println("my number was");
		System.out.println(myNumber);
	}	
}


