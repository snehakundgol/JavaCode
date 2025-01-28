public class Strings {
    public static void main(String[] args) {
        
        //concat example
        String brandname = "Laptop";
        String type = " - Gaming";
        String detail = brandname.concat(type);
        System.out.println("detail : " + detail);

        //equals example
        String food = "Masala Dosa";
        String dish = new String("Masala Dosa");
        System.out.println(food == dish); // false comparing address
        boolean result = food.equals(dish); // true comparing values
        System.out.println(result);

        //toUpperCase and toLowerCase
        String str = "Sneha Kundgol";
		System.out.println(str.toUpperCase()); 
		System.out.println(str.toLowerCase()); 

		//length() example
		String str1 = "Java class";
		System.out.println(str1.length());

		//charAt example
		String str2 = "Office";
		System.out.println(str2.charAt(1)); 

		// startsWith Examples
        String str3 = "Hello, World!";
        System.out.println(str3.startsWith("Hello")); 
        System.out.println(str3.startsWith("world")); 

        // endsWith Examples
        System.out.println(str3.endsWith("Hello")); 
        System.out.println(str3.endsWith("world!"));

        //isEmpty Example
        String emptyString = "";
        System.out.println(emptyString.isEmpty());   
    
    	//split() example
    	String str4 = " ";
		String[] parts = str4.split(",");
        System.out.println(parts.length); 
    
    }
    
    }




    



