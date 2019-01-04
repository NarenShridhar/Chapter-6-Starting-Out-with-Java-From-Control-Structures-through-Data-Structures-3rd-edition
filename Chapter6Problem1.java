public class Chapter6Problem1
{
	public static void main (String[] args)
	{
		Employee employee1 = new Employee();
		Employee employee2 = new Employee("Mark Jones", 39119);
		Employee employee3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");

		display();

		employee1.setName("Susan Myers");
		employee1.setIdNumber(47899);
		employee1.setDepartment("Accounting");
		employee1.setPosition("Vice President");

		employee2.setDepartment("IT");
		employee2.setPosition("Programmer");

		System.out.println(employee1.getName() + "\t\t" + employee1.getIdNumber() + "\t\t\t\t" + employee1.getDepartment() + "\t\t\t" 
			+ employee1.getPosition());

		System.out.println(employee2.getName() + "\t\t" + employee2.getIdNumber() + "\t\t\t\t" + employee2.getDepartment() + "\t\t\t\t" 
			+ employee2.getPosition());

		System.out.println(employee3.getName() + "\t\t" + employee3.getIdNumber() + "\t\t\t\t" + employee3.getDepartment() + "\t\t\t" 
			+ employee3.getPosition());
	}

	public static void display()
	{
		System.out.println("Name\t\t\tID Number\t\t\tDepartment\t\t\tPosition");
		System.out.println();
	}
}