import java.util.Scanner;

public class Chapter6Problem7
{	
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		Circle circleObject = new Circle();

		double radius;
		//final double pi = 3.14159;

		System.out.println("Enter the radius of a circle please: ");
		radius = keyboard.nextDouble();

		circleObject.setRadius(radius);

		System.out.println("A circle with a radius of " + radius + " has an area of " + circleObject.getArea());
		System.out.println("A circle with a radius of " + radius + " has a diameter of " + circleObject.getDiameter());
		System.out.println("A circle with a radius of " + radius + " has a circumference of " + circleObject.getCircumference());

		System.exit(0);
	}

}