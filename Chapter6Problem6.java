import java.util.Scanner;

public class Chapter6Problem6
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		double testScore1;
		double testScore2;
		double testScore3;

		System.out.println("Enter a score for test 1: ");
		testScore1 = keyboard.nextDouble();

		System.out.println("Enter a score for test 2: ");
		testScore2 = keyboard.nextDouble();

		System.out.println("Enter a score for test 3: ");
		testScore3 = keyboard.nextDouble();

		TestScores userScores = new TestScores(testScore1, testScore2, testScore3);

		System.out.println("The average of 3 tests whose scores are " + testScore1 + ", " + testScore2 + ", and " + testScore3 + 
			" is: " + userScores.getAverage(testScore1, testScore2, testScore3));
	}
}