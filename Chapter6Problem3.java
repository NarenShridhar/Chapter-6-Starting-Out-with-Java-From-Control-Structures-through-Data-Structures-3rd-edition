public class Chapter6Problem3
{
	public static void display()
	{
		System.out.println("Name\t\t\tAddress\t\t\t\tAge\t\tPhone Number");
		System.out.println();
	}

	public static void main (String[] args)
	{
		PersonalInformationClass myInformation = new PersonalInformationClass("Random Name One", "Random Address One", 18, "1111111111");
		PersonalInformationClass familyMemberOne = new PersonalInformationClass("Random Name Two", "Random Address Two", 17, "2222222222");
		PersonalInformationClass familyMemberTwo = new PersonalInformationClass("Random Name Three", "Random Address Three", 16, "3333333333");

		display();

		System.out.println(myInformation.getName() + "\t\t" + myInformation.getAddress() + "\t\t" + myInformation.getAge() + "\t\t" 
			+ myInformation.getPhoneNumber());
		System.out.println(familyMemberOne.getName() + "\t\t" + familyMemberOne.getAddress() + "\t\t" + familyMemberOne.getAge() + "\t\t" 
			+ familyMemberOne.getPhoneNumber());
		System.out.println(familyMemberTwo.getName() + "\t" + familyMemberTwo.getAddress() + "\t\t" + familyMemberTwo.getAge() + "\t\t" 
			+ familyMemberTwo.getPhoneNumber());
	}
}