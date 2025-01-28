public class Array
{
	public static void main(String[] args)
	{
		byte[] temperature = {40, 30, 50, 60, 75, 88, 22, 34, 44, 75};
		System.out.println(temperature[0]);
		System.out.println(temperature[1]);
		System.out.println(temperature[2]);
		System.out.println(temperature[3]);
		System.out.println(temperature[4]);
		System.out.println(temperature[5]);
		System.out.println(temperature[6]);
		System.out.println(temperature[7]);
		System.out.println(temperature[8]);
		System.out.println(temperature[9]);


		temperature[0]=100;

		System.out.println(temperature[0]);

		long[] bankAccountNumber = {7832423847l, 8237239728l, 1257612588l, 8237482368l, 7217841279l, 6527462357l, 
									51351765656l, 7125354153l, 2157651767l, 6251745665l};
		System.out.println(bankAccountNumber[0]);
		System.out.println(bankAccountNumber[1]);
		System.out.println(bankAccountNumber[2]);
		System.out.println(bankAccountNumber[3]);
		System.out.println(bankAccountNumber[4]);
		System.out.println(bankAccountNumber[5]);
		System.out.println(bankAccountNumber[6]);
		System.out.println(bankAccountNumber[7]);
		System.out.println(bankAccountNumber[8]);
		System.out.println(bankAccountNumber[9]);

		bankAccountNumber[4]= 7632887878l;

		System.out.println(bankAccountNumber[4]);

		char[] multipleChoices = {'A', 'B', 'C', 'D', 'G', 'K', 'M',
		'N','O', 'N'};
		System.out.println(multipleChoices[0]);
		System.out.println(multipleChoices[1]);
		System.out.println(multipleChoices[2]);
		System.out.println(multipleChoices[3]);
		System.out.println(multipleChoices[4]);	
		System.out.println(multipleChoices[5]);	
		System.out.println(multipleChoices[6]);	
		System.out.println(multipleChoices[7]);	
		System.out.println(multipleChoices[8]);	
		System.out.println(multipleChoices[9]);	

		multipleChoices[2]='Z';

		System.out.println(multipleChoices[2]);	

		float[] temperatures = {22.3f, 11.4f, 22.0f, 12.5f, 31.3f, 66.0f, 77.2f, 88.2f, 45.4f, 88.2f};
		System.out.println(temperatures[0]);
		System.out.println(temperatures[1]);
		System.out.println(temperatures[2]);
		System.out.println(temperatures[3]);
		System.out.println(temperatures[4]);
		System.out.println(temperatures[5]);
		System.out.println(temperatures[6]);
		System.out.println(temperatures[7]);
		System.out.println(temperatures[8]);
		System.out.println(temperatures[9]);

		temperatures[6]=22.2f;

		System.out.println(temperatures[6]);

		short[] monthOfTheYear = {2, 4, 7, 8, 12, 1, 3,5,9,11};
		System.out.println(monthOfTheYear[0]);
		System.out.println(monthOfTheYear[1]);
		System.out.println(monthOfTheYear[2]);
		System.out.println(monthOfTheYear[3]);
		System.out.println(monthOfTheYear[4]);
		System.out.println(monthOfTheYear[5]);
		System.out.println(monthOfTheYear[6]);
		System.out.println(monthOfTheYear[7]);
		System.out.println(monthOfTheYear[8]);
		System.out.println(monthOfTheYear[9]);

		monthOfTheYear[1]=6;

		System.out.println(monthOfTheYear[1]);

		String[] cityNames = {"Hubli", "Dharwad", "Banglore", "Mysore","Davangere", "Gadag", "Banashankari", "BTM", "Rajajinagar", "Electronic City"};
		System.out.println(cityNames[0]);
		System.out.println(cityNames[1]);
		System.out.println(cityNames[2]);
		System.out.println(cityNames[3]);
		System.out.println(cityNames[4]);
		System.out.println(cityNames[5]);
		System.out.println(cityNames[6]);
		System.out.println(cityNames[7]);
		System.out.println(cityNames[8]);
		System.out.println(cityNames[9]);

		cityNames[9]= "XYZ";

		System.out.println(cityNames[9]);


		int[] items = {20, 25, 40, 30, 50, 22, 34, 45, 68, 100, 32};
		System.out.println(items[0]);
		System.out.println(items[1]);
		System.out.println(items[2]);
		System.out.println(items[3]);
		System.out.println(items[4]);
		System.out.println(items[5]);
		System.out.println(items[6]);
		System.out.println(items[7]);
		System.out.println(items[8]);
		System.out.println(items[9]);

		items[6]= 200;

		System.out.println(items[6]);

		double[] percentages = {88.2d, 54.2d, 89.2d, 22.4d, 44,2d, 77.2d, 45,6d, 88.8d, 22.3d, 44.2d};
		System.out.println(percentages[0]);
		System.out.println(percentages[1]);
		System.out.println(percentages[2]);
		System.out.println(percentages[3]);
		System.out.println(percentages[4]);
		System.out.println(percentages[5]);
		System.out.println(percentages[6]);
		System.out.println(percentages[7]);
		System.out.println(percentages[8]);
		System.out.println(percentages[9]);

		percentages[9]= 22.0d;

		System.out.println(percentages[9]);


}
}
