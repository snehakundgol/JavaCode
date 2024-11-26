public class Overloading1
{
	public static void main(String[] args)
	{
		phoneCallByName("Sneha"); // line no 12 method
	}
	public static void phoneCallByNumber(int mobileNumber)
	{
		System.out.println("Function for calling with mobile number");
	    System.out.println("calling" + mobileNumber);	
	}
	public static void phoneCallByName(String name,int mobileNumber)
	{
		System.out.println("Function for calling with name");
	    System.out.println("calling" + name);	
	}
	public static void phoneCallBySiri(int mobileNumber,String name)
	{
		System.out.println("Function for calling with siri");
	    System.out.println("calling" + name);	
	}



}