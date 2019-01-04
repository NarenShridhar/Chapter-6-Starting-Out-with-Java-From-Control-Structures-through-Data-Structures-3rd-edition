public class FreezingAndBoilingPoints
{
	double temperature;

	public FreezingAndBoilingPoints(double temperatureGiven)
	{
		temperature = temperatureGiven;
	}

	public FreezingAndBoilingPoints()
	{
		temperature = 0;
	}

	public void setTemperature(double temperatureGiven)
	{
		temperature = temperatureGiven;
	}

	public double getTemperature()
	{
		return temperature;
	}

	public boolean isEthylFreezing()
	{
		if(temperature <= -173)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean isEthylBoiling()
	{
		if(temperature >= 172)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean isOxygenFreezing()
	{
		if(temperature <= -362)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean isOxygenBoiling()
	{
		if(temperature >= -306)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean isWaterFreezing()
	{
		if(temperature <= 32)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean isWaterBoiling()
	{
		if(temperature >= 212)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}