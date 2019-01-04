public class Circle
{
	private double radius;
	private final double pi = 3.14159;

	public Circle(double radiusGiven)
	{
		radius = radiusGiven;
	}

	public Circle()
	{
		radius = 0.0;
	}

	public void setRadius(double radiusGiven)
	{
		radius = radiusGiven;
	}

	public double getRadius()
	{
		return radius;
	}

	public double getArea()
	{
		return pi * (Math.pow(radius, 2));
	}

	public double getDiameter()
	{
		return radius * 2;
	}

	public double getCircumference()
	{
		return 2 * pi * radius;
	}
}