import java.io.*;
import java.util.Scanner;

public class Chapter6Problem13
{
	public static void main (String[] args) throws IOException
	{
		SavingsAccount account1 = new SavingsAccount(500.00);
		account1.setAnnualInterestRate(6);
		double totalInterestEarned = 0;


		File depositFile = new File ("/Users/NarenShridhar/Documents/JavaPrograms/ChapterSixProgrammingChallenges/Deposits.txt");
		File withdrawalFile = new File ("/Users/NarenShridhar/Documents/JavaPrograms/ChapterSixProgrammingChallenges/Withdrawals.txt");

		Scanner inputFile = new Scanner(depositFile);

		while(inputFile.hasNext())
		{
			account1.deposit(inputFile.nextDouble());
		}

		inputFile.close();

		inputFile = new Scanner(withdrawalFile);

		while(inputFile.hasNext())
		{
			account1.withdrawal(inputFile.nextDouble());
		}

		inputFile.close();

		totalInterestEarned = account1.addMonthlyInterest();

		System.out.printf("Ending balance: $%,.2f\nTotal Interest Earned: %f", account1.getBalance(), totalInterestEarned);

	}
}