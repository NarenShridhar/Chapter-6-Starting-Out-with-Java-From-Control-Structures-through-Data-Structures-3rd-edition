public class Chapter6Problem4
{
	public static void display()
	{
		System.out.println("\t\tDescription\t\tUnits on Hand\t\t Price");
		System.out.println("----------------------------------------------------------------------");
	}

	public static void main (String[] args)
	{
		RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
		RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
		RetailItem item3 = new RetailItem("Shirt", 20, 24.95);

		display();

		System.out.println("Item #1\t\t" + item1.getDescription() + "\t\t\t" + item1.getUnitsOnHand() + "\t\t\t" + 
			item1.getPrice());
		System.out.println("Item #2\t\t" + item2.getDescription() + "\t\t" + item2.getUnitsOnHand() + "\t\t\t" + 
			item2.getPrice());
		System.out.println("Item #3\t\t" + item3.getDescription() + "\t\t\t" + item3.getUnitsOnHand() + "\t\t\t" + 
			item3.getPrice());
	}
}