import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please select one of the following options: ");
		System.out.println("1. My favorite song\n2. My favorite game\n3. My favorite movie\n4. My favorite food");
		int choice = keyboard.nextInt();
		
		if (choice == 1)
		{
			System.out.println("My favorite song is Dissociation by The Dillinger Escape Plan");
		}
		else if (choice == 2)
		{
			System.out.println("My favorite game right now is Marvel Rivals.");
		}
		else if(choice == 3)
		{
			System.out.println("My favorite movie is Django Unchained.");
		}
		else if(choice == 4)
		{
			System.out.println("My favorite food is sushi.");
		}
		else
		{
			System.out.println("Sorry you chose an invalid option");
		}
	}
}
