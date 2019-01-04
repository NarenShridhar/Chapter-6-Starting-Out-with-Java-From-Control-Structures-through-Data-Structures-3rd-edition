public class Player
{
	private int die1Value;
	private int die2Value;
	private int totalDieValue;


	public Player()
	{
		die1Value = 0;
		die2Value = 0;
		totalDieValue = 0;
	}

	public void rollDice()
	{
		final int SIX_SIDES = 6;
		Die die1 = new Die(SIX_SIDES);
		Die die2 = new Die(SIX_SIDES);

		die1.roll();
		die2.roll();

		die1Value = die1.getValue();
		die2Value = die2.getValue();

		totalDieValue += (die1Value + die1Value);
	}

	public int getTotalDieValue()
	{
		return totalDieValue;
	}
}