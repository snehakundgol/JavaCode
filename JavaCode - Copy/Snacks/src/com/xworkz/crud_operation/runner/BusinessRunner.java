package com.xworkz.crud_operation.runner;

public class BusinessRunner 
{
		public static void main(String[] args) 
		{
		Business.staticMethod1();
        Business.staticMethod2();
        Business.staticMethod3();
        Business.staticMethod4();

        RetailBusiness retail = new RetailBusiness("SuperMart", "Alice Johnson", "New York City", 2005, 2_500_000.00);

        retail.instanceMethod1();
        retail.instanceMethod2();
        retail.instanceMethod3();
        retail.instanceMethod4();

        retail.abstractMethod1();
        retail.abstractMethod2();
        retail.abstractMethod3();
        retail.abstractMethod4();

        retail.displayBusinessDetails();
    }

}
