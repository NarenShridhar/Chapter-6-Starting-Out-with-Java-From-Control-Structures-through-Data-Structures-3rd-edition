public class SavingsAccount
{
	private double balance;
	private double annualInterestRate;
	private double monthlyInterestRate;
	private double totalDeposits;
	private double totalWithdraws;
	private double totalInterest;

	public SavingsAccount(double balanceGiven)
	{
		balance = balanceGiven;
		annualInterestRate = 0.0;
	}

	public void setAnnualInterestRate(double annualInterestRateGiven)
	{
		final double MONTHS_IN_A_YEAR = 12.0;
		annualInterestRate = annualInterestRateGiven;
		monthlyInterestRate = annualInterestRate/MONTHS_IN_A_YEAR;
	}

	public double addMonthlyInterest()
	{
		double monthlyInterestRate = ((annualInterestRate/12) * balance);
		balance += monthlyInterestRate;
		return monthlyInterestRate;
	}

	public void deposit(double depositMade)
	{
		balance += depositMade;
		totalDeposits += depositMade;
	}

	public void withdrawal(double withdrawalMade)
	{
		balance -= withdrawalMade;
		totalWithdraws -= withdrawalMade;
	}

	public double calculateMonthlyInterest()
	{
		totalInterest = totalInterest + (balance * monthlyInterestRate);
		balance = balance + (balance * monthlyInterestRate);
		return totalInterest;
	}

	public double getBalance()
	{
		return balance;
	}
}