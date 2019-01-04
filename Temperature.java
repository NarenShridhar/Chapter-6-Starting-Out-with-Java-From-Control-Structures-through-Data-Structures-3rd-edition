public class Temperature
{
	private double ftemp;

	public Temperature(double ftempGiven)
	{
		ftemp = ftempGiven;
	}

	public void setFahrenheit(double fahrenheitGiven)
	{
		ftemp = fahrenheitGiven;
	}

	public double getFahrenheit()
	{
		return ftemp;
	}

	public double getCelsius()
	{
		return ((double)5/9) * (ftemp - 32);
	}

	public double getKelvin()
	{
		return getCelsius() + 273;
	}
}