public class TestScores
{
	private double testScore1;
	private double testScore2;
	private double testScore3;

	public TestScores(double testScore1Given, double testScore2Given, double testScore3Given)
	{
		testScore1 = testScore1Given;
		testScore2 = testScore2Given;
		testScore3 = testScore3Given;
	}

	public void setTestScore1(double testScore1Given)
	{
		testScore1 = testScore1Given;
	}

	public double getTestScore1()
	{
		return testScore1;
	}

	public void setTestScore2(double testScore2Given)
	{
		testScore2 = testScore2Given;
	}

	public double getTestScore2()
	{
		return testScore2;
	}

	public void setTestScore3(double testScore3Given)
	{
		testScore3 = testScore3Given;
	}

	public double getTestScore3()
	{
		return testScore3;
	}

	public double getAverage(double testScore1, double testScore2, double testScore3)
	{
		return (testScore1 + testScore2 + testScore3)/3.0;
	}
}