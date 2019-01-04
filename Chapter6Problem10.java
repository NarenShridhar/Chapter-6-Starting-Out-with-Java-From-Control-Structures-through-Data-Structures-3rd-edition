import java.util.Scanner;

public class Chapter6Problem10
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		char playAgain = 'y';

		Player player1 = new Player();
		Player computer = new Player();

		while(playAgain == 'y' && (player1.getTotalDieValue() <= 21 && computer.getTotalDieValue() <= 21))
		{
			computer.rollDice();
			System.out.println("The computer just rolled");
			System.out.println("The computer's total is " + computer.getTotalDieValue());
			player1.rollDice();
			System.out.println("You just rolled as well and your total is " + player1.getTotalDieValue());
			System.out.println("Do you want to roll again to accumulate more points? Type y to roll or anything else to stop.");
			playAgain = keyboard.nextLine().charAt(0);
		}

		if(((player1.getTotalDieValue() > computer.getTotalDieValue()) && (player1.getTotalDieValue() <= 21)) 
			|| ((player1.getTotalDieValue() < computer.getTotalDieValue()) && (computer.getTotalDieValue() > 21)))
		{
			System.out.println("Player 1 won with a total of " + player1.getTotalDieValue() + " and the computer lost with a total of " + 
				computer.getTotalDieValue());
		}

		else if(((computer.getTotalDieValue() > player1.getTotalDieValue()) && (computer.getTotalDieValue() <= 21)) 
			|| ((computer.getTotalDieValue() < player1.getTotalDieValue()) && (player1.getTotalDieValue() > 21)))
		{
			System.out.println("The computer won with a total of " + computer.getTotalDieValue() + " and Player 1 lost with a total of " + 
				player1.getTotalDieValue());
		}

		else if(player1.getTotalDieValue() == computer.getTotalDieValue())
		{
			System.out.println("It was a tie with Player 1 having a total of " + player1.getTotalDieValue() + " and the computer having a total of " + 
				computer.getTotalDieValue());
		}
	}
}