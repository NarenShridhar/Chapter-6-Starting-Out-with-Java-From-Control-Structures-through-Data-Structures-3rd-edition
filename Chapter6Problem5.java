import java.util.Scanner;

public class Chapter6Problem5
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		String employeeName;
		int idNumber;
		double hourlyPayRate;
		double numberOfHoursWorked;

		System.out.println("Enter the employee hourly pay rate: ");
		hourlyPayRate = keyboard.nextDouble();

		System.out.println("Enter the number of hours worked: ");
		numberOfHoursWorked = keyboard.nextDouble();

		Payroll employeeEntered = new Payroll("Jin", 9258);

		System.out.println("An employee named " + employeeEntered.getEmployeeName()  + " with an ID number of " + employeeEntered.getIdNumber() +
		" who worked " + numberOfHoursWorked + " hours and was paid $" + hourlyPayRate + 
			" per hour has a gross pay of $" + employeeEntered.grossPay(hourlyPayRate, numberOfHoursWorked));
	}
}