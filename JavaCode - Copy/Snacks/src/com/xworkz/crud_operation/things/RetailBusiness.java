package com.xworkz.crud_operation.things;

class RetailBusiness extends Business 
{
	public RetailBusiness(String businessName, String ownerName, String location, int establishedYear, double annualRevenue) 
	{
        super(businessName, ownerName, location, establishedYear, annualRevenue);
    }

    @Override
    public void abstractMethod1() 
    {
        System.out.println("Abstract Method 1: Expanding business by opening new stores in urban areas.");
    }

    @Override
    public void abstractMethod2() 
    {
        System.out.println("Abstract Method 2: Engaging customers through loyalty programs and events.");
    }

    @Override
    public void abstractMethod3() 
    {
        System.out.println("Abstract Method 3: Increasing revenue through e-commerce and online sales.");
    }

    @Override
    public void abstractMethod4() 
    {
        System.out.println("Abstract Method 4: Implementing a risk management strategy to handle market fluctuations.");
    }
}

