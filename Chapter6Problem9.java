import java.util.Scanner;

public class Chapter6Problem9
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int userMonth;
		int userYear;

		System.out.println("Enter a month from 1-12: ");
		userMonth = keyboard.nextInt();

		while(userMonth < 1 || userMonth > 12)
		{
			System.out.println("Hello, the year has 12 months... not more or less, enter a month from 1-12 please: ");
			System.out.println("Enter a month from 1-12: ");
			userMonth = keyboard.nextInt();
		}

		System.out.println("Enter a year: ");
		userYear = keyboard.nextInt();

		MonthDays monthDaysObject = new MonthDays(userMonth, userYear);

		System.out.println("The month you entered " + userMonth + " in year " + userYear + " has " + monthDaysObject.getNumberOfDays() + " days");
	}
}