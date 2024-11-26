class Animal
{
public static void eatFood(String foodName){
System.out.println("animal eat food1");
}
public static void eatFood(String foodName,int noOfItems){
System.out.println("animal eat food2");
}
public static void eatFood(String foodName,double wegiht){
System.out.println("animal eat food3");
}
public static void eatFood(int noOfItems,String foodName){
System.out.println("animal eat food4");
}
public static void main(String[] args) {
	
	eatFood("apple");
	eatFood("milk",2);
	eatFood("water",2.1d);
	eatFood(2,"milk");

}



}