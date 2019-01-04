public class Chapter6Problem2
{
	public static void main (String[] args)
	{
		Car car1 = new Car(2018, "Lexus");

		for(int unitsOfAcceleration = 1; unitsOfAcceleration <= 5; unitsOfAcceleration++)
		{
			System.out.println("The car is moving at a speed of: " + car1.getSpeed() + "mph");
			car1.accelerate();
		}

		for(int unitsOfDeceleration = 0; unitsOfDeceleration <= 5; unitsOfDeceleration++)
		{
			System.out.println("The car is moving at a speed of: " + car1.getSpeed() + "mph");
			car1.brake();
		}
	}
}