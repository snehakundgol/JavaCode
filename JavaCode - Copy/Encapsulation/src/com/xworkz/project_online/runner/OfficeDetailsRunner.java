package com.xworkz.project_online.runner;

import com.xworkz.project_online.things.OfficeDetails;

public class OfficeDetailsRunner {
	
    public static void main(String[] args) 
    {
        OfficeDetails o1 = new OfficeDetails("Wipro", "Electronic City", 2000, 500, 10, "Sneha",
                "Sneha@wipro.com", "1234567890", "www.wipro.com", 1_000_000,
                "IT", "Japan", "RegionA", true, true, "Innovation for Future",
                "12345", 5, true, true);

        OfficeDetails o2 = new OfficeDetails("Infosys", "BTM", 2000, 500, 10, "Varshita",
                "Varshita@infosys.com", "1234567890", "www.infosys.com", 1_000_000,
                "IT", "Germany", "RegionA", true, true, "Innovation for Future",
                "12345", 5, true, true);

        OfficeDetails o3 = new OfficeDetails("Bosch", "Silk Bpard", 2010, 300, 8, "Nandana",
                "Nandana@bosch.com", "0987654321", "www.bosch.com", 500_000,
                "Finance", "Spain", "RegionB", false, true, "Empowering Businesses",
                "54321", 3, false, true);

        OfficeDetails o4 = new OfficeDetails();
        o4.setOfficeName("NextGen");

        OfficeDetails o5 = o3; 


        System.out.println("Are o1 and o2 equal? " + o1.equals(o2));
        System.out.println("Are o1 and o3 equal? " + o1.equals(o3));
        System.out.println("Are o3 and o5 equal? " + o3.equals(o5));
    }
}


