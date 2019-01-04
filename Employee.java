public class Employee
{
	private String name;
	private int idNumber;
	private String department;
	private String position;

	public Employee(String employeeName, int employeeIdNumber, String employeeDeparment, String employeePosition)
	{
		name = employeeName;
		idNumber = employeeIdNumber;
		department = employeeDeparment;
		position = employeePosition;
	}

	public Employee(String employeeName, int employeeIdNumber)
	{
		name = employeeName;
		idNumber = employeeIdNumber;
		department = "";
		position = "";
	}

	public Employee()
	{
		name = "";
		idNumber = 0;
		department = "";
		position = "";
	}

	public void setName(String nameGiven)
	{
		name = nameGiven;
	}

	public String getName()
	{
		return name;
	}

	public void setIdNumber(int idNumberGiven)
	{
		idNumber = idNumberGiven;
	}

	public int getIdNumber()
	{
		return idNumber;
	}

	public void setDepartment(String departmentGiven)
	{
		department = departmentGiven;
	}

	public String getDepartment()
	{
		return department;
	}

	public void setPosition(String positionGiven)
	{
		position = positionGiven;
	}

	public String getPosition()
	{
		return position;
	}
}
