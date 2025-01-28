package com.xworkz.project_online.runner;

import com.xworkz.project_online.things.Mobile;

public class MobileRunner {
	
    public static void main(String[] args) {
        Mobile mobile = new Mobile("Samsung", "Galaxy S23", 999.99, 256, 4500);
        System.out.println(mobile); 
    }
}
