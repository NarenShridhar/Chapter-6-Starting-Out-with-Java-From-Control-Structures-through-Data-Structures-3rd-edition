public class Car
{
	private int yearModel;
	private String make;
	private int speed;

	public Car(int yearModelGiven, String makeGiven)
	{
		yearModel = yearModelGiven;
		make = makeGiven;
		speed = 0;
	}

	public int getYearModel(int yearModelGiven)
	{
		return yearModel;
	}

	public String getMake(String makeGiven)
	{
		return make;
	}

	public int getSpeed()
	{
		return speed;
	}

	public void accelerate()
	{
		speed = speed + 5;
	}

	public void brake()
	{
		speed = speed - 5;
	}
}