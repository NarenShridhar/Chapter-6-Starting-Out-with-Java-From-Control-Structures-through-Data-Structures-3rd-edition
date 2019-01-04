import java.util.Scanner;

public class Chapter6Problem15
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int userPocketNumber = 0;
		char repeat = 'y';

		while(repeat == 'y')
		{
			System.out.println("User, please enter a pocket number in the range of 0 - 36");
			userPocketNumber = keyboard.nextInt();

			while(userPocketNumber < 0 || userPocketNumber > 36)
			{
				System.out.println("Error, you have entered a number less than 0 or greater than 36");
				System.out.println("User, please enter a pocket number in the range of 0 - 36");
				userPocketNumber = keyboard.nextInt();
			}

			RoulettePocket userEntry = new RoulettePocket(userPocketNumber);

			System.out.println("User you entered: " + userPocketNumber);
			System.out.println("Roulette wheel is spinning...");
			System.out.println("Your color was: " + userEntry.getPocketColor());
			System.out.println("Do you want to play again? Type y to play again or anything else to quit.");
			keyboard.nextLine();
			repeat = keyboard.nextLine().charAt(0);
		}
		keyboard.close();
	}
}