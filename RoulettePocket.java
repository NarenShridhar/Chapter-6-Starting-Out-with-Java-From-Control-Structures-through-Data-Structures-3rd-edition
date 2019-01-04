public class RoulettePocket
{
	private int pocketNumber;
	private String green = "Green";
	private String red = "Red";
	private String black = "Black";

	public RoulettePocket(int pocketNumberGiven)
	{
		pocketNumber = pocketNumberGiven;
	}

	public String getPocketColor()
	{
		if(pocketNumber == 0)
		{
			return green;
		}

		else if(pocketNumber >= 1 && pocketNumber <= 10)
		{
			if(pocketNumber % 2 == 0)
			{
				return black;
			}

			else
			{
				return red;
			}
		}

		else if(pocketNumber >= 11 && pocketNumber <= 18)
		{
			if(pocketNumber % 2 == 0)
			{
				return red;
			}

			else
			{
				return black;
			}
		}

		else if(pocketNumber >= 19 && pocketNumber <= 28)
		{
			if(pocketNumber % 2 == 0)
			{
				return black;
			}

			else
			{
				return red;
			}
		}

		else if(pocketNumber >= 29 && pocketNumber <= 36)
		{
			if(pocketNumber % 2 == 0)
			{
				return red;
			}

			else
			{
				return black;
			}
		}
	return "";
	}
}