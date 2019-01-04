public class RetailItem
{
	private String description;
	private int unitsOnHand;
	private double price;

	public RetailItem(String descriptionGiven, int unitsOnHandGiven, double priceGiven)
	{
		description = descriptionGiven;
		unitsOnHand = unitsOnHandGiven;
		price = priceGiven;
	}

	public void setDescription(String descriptionGiven)
	{
		description = descriptionGiven;
	}

	public String getDescription()
	{
		return description;
	}

	public void setUnitsOnHand(int unitsOnHandGiven)
	{
		unitsOnHand = unitsOnHandGiven;
	}

	public int getUnitsOnHand()
	{
		return unitsOnHand;
	}

	public void setPrice(double priceGiven)
	{
		price = priceGiven;
	}

	public double getPrice()
	{
		return price;
	}
}