import java.util.Scanner;

public class Chapter6Problem12
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		double startingBalance;
		double userAnnualInterestRate;
		double numberOfMonthsPassed;
		double amountDeposited;
		double amountWithdrawn;
		double totalDeposits = 0;
		double totalWithdrawals = 0;
		double totalInterestEarned = 0;



		System.out.println("What is your starting balance?");
		startingBalance = keyboard.nextDouble();

		SavingsAccount savingsAccountObject = new SavingsAccount(startingBalance);

		System.out.println("What is your annual interest rate as a percent?");
		userAnnualInterestRate = keyboard.nextDouble();

		savingsAccountObject.setAnnualInterestRate(userAnnualInterestRate);

		System.out.println("How many months have passed?");
		numberOfMonthsPassed = keyboard.nextDouble();

		for(int currentMonth = 1; currentMonth <= numberOfMonthsPassed; currentMonth++)
		{
			System.out.println("For month " + currentMonth + " how much did you deposit into your account?");
			amountDeposited = keyboard.nextDouble();
			savingsAccountObject.deposit(amountDeposited);
			totalDeposits += amountDeposited;

			System.out.println("For month " + currentMonth + " how much did you withdraw from your account?");
			amountWithdrawn = keyboard.nextDouble();
			savingsAccountObject.withdrawal(amountWithdrawn);
			totalWithdrawals += amountWithdrawn;

			totalInterestEarned = savingsAccountObject.calculateMonthlyInterest();
		}

		System.out.println("The final balance at the end of " + numberOfMonthsPassed + " months is: $" + savingsAccountObject.getBalance());
		System.out.println("The total amount of deposits was: $" + totalDeposits);
		System.out.println("The totoal amount of withdrawals made was: $" + totalWithdrawals);
		System.out.println("The total interest earned was: $" + totalInterestEarned);

	}
}