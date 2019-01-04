public class PersonalInformationClass
{
	private String name;
	private String address;
	private int age;
	private String phoneNumber;

	public PersonalInformationClass(String nameGiven, String addressGiven, int ageGiven, String phoneNumberGiven)
	{
		name = nameGiven;
		address = addressGiven;
		age = ageGiven;
		phoneNumber = phoneNumberGiven;
	}

	public String getName()
	{
		return name;
	}

	public String getAddress()
	{
		return address;
	}

	public int getAge()
	{
		return age;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}
}