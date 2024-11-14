class Office
{
	public static void colleguesName(String colleguesName)
	{
		System.out.println("Printing colleguesName");
	}
	public static void colleguesName(String colleguesName,int noOfCollegues)
	{
		System.out.println("Printing colleguesName and total number of collegues");
	}


	public static void assignTask(String taskDescription, int priorityLevel, String deadline) {
        System.out.println("Task assigned: " + taskDescription + ", Priority Level: " + priorityLevel + ", Deadline: " + deadline);
    }
    public static void assignTask(String taskDescription, int priorityLevel, String deadline) {
        System.out.println("Task assigned to " + assignee + ": " + taskDescription + ", Priority Level: " + priorityLevel + ", Deadline: " + numbers);
    }


    public static void registerLocation(String city, int postalCode, String country) {
        System.out.println("Office Location: " + city + ", Postal Code: " + postalCode + ", " + country);
    }
	public static void registerLocation(int postalCode, String country, String city) {
        System.out.println("Office Location: Postal Code: " + postalCode + ", " + country + ", " + city);
    }


public static void main(String[] args) {
	
	colleguesName("Heena");
	colleguesName("Roopa",200);

	assignTask("Complete budget analysis", 1, "2024-11-13");          
    assignTask("Organize team meeting", 6, "2023-11-20", "Sneha"); 

    registerLocation("Los Angeles", 90001, "USA");       
    registerLocation(94105, "USA", "San Francisco");  

}



}