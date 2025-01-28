public class Person2
{

	private String name;
	private int age;
	private Gender gender;
	private MartialStatus martialstatus;
	private String qualification;

	public Person2(String name, int age, Gender gender, MartialStatus martialstatus,String qualification)
	{
		this.name =name;
		this.age=age;
		this.gender = gender;
		this.martialstatus = martialstatus;
		this.qualification = qualification;
	}
	
	public void Person2Detail()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
		System.out.println("MartialStatus: "+martialstatus);
		System.out.println("Qualification: "+qualification);
	}

	public static void main(String[] args)
	{
		Person2 person2 = new Person2("Shruthi", 30, Gender.FEMALE, MartialStatus.MARRIED, "Engineering");

		person2.Person2Detail();
		
	}
}
