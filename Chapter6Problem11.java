import java.util.Scanner;

public class Chapter6Problem11
{
	public static void main (String[] args)
	{
		FreezingAndBoilingPoints userTemperature = new FreezingAndBoilingPoints();

		Scanner keyboard = new Scanner(System.in);

		double temperature;

		System.out.println("Enter a temperature: ");
		temperature = keyboard.nextDouble();

		userTemperature.setTemperature(temperature);

		if(userTemperature.isEthylFreezing())
		{
			System.out.println("Ethyl will freeze");
		}

		if(userTemperature.isEthylBoiling())
		{
			System.out.println("Ethyl will boil");
		}

		if(userTemperature.isOxygenFreezing())
		{
			System.out.println("Oxygen will freeze");
		}

		if(userTemperature.isOxygenBoiling())
		{
			System.out.println("Oxygen will boil");
		}

		if(userTemperature.isWaterFreezing())
		{
			System.out.println("Water will freeze");
		}

		if (userTemperature.isWaterBoiling()) 
		{
			System.out.println("Water will boil");
		}
	}
}