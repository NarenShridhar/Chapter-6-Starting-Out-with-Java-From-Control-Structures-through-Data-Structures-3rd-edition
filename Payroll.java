public class Payroll
{
	private String employeeName;
	private int idNumber;
	private double hourlyPayRate;
	private double numberOfHoursWorked;

	public Payroll(String employeeNameGiven, int idNumberGiven)
	{
		employeeName = employeeNameGiven;
		idNumber = idNumberGiven;
		hourlyPayRate = 0;
		numberOfHoursWorked = 0;
	}

	public void setEmployeeName(String employeeNameGiven)
	{
		employeeName = employeeNameGiven;
	}

	public String getEmployeeName()
	{
		return employeeName;
	}

	public void setIdNumber(int idNumberGiven)
	{
		idNumber = idNumberGiven;
	}

	public int getIdNumber()
	{
		return idNumber;
	}

	public void setHourlyPayRate(double hourlyPayRateGiven)
	{
		hourlyPayRate = hourlyPayRateGiven;
	}

	public double getHourlyPayRate()
	{
		return hourlyPayRate;
	}

	public void setNumberOfHoursWorked(double numberOfHoursWorkedGiven)
	{
		numberOfHoursWorked = numberOfHoursWorkedGiven;
	}

	public double getNumberOfHoursWorked()
	{
		return numberOfHoursWorked;
	}

	public double grossPay(double hourlyPayRate, double numberOfHoursWorked)
	{
		return hourlyPayRate * numberOfHoursWorked;
	}
}