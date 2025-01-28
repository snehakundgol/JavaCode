public class Main
{
	public static void demo(String name)
	{
		System.out.println("Hello: " +name + "");
	}

	public static void demo(String name, int age)
	{
		System.out.println("Hello: " + name + " " + age + "years old");
	}

	public static void demo(int age)
	{
		System.out.println("Hello: " + age + " years old");
	}

	public static void main(String[] args)
	{
		demo("Sneha");
		demo("Ashwini", 26);
		demo(28);
	}
}

