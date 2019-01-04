import java.util.Scanner;

public class Chapter6Problem8
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		double ftemp;

		System.out.println("Enter a temperature in fahrenheit: ");
		ftemp = keyboard.nextDouble();

		Temperature temperatureObject = new Temperature(ftemp);

		temperatureObject.setFahrenheit(ftemp);

		System.out.println("With the temperature you entered...");
		display();
		System.out.println(temperatureObject.getFahrenheit() + "\t\t\t" + temperatureObject.getCelsius() + "\t" + 
			temperatureObject.getKelvin());
	}

	public static void display()
	{
		System.out.println("Fahrenheit\t\tCelsius\t\t\tKelvin");
	}
}