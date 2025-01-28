package com.xworkz.project_online.things;

public class Main 
{
    public static void main(String[] args) 
    {
        
        MobileApp mobileApp = new MobileApp("MyMobileApp", "2.1", "DevCorp", true);
        Desktop desktopApp = new Desktop("MyDesktopApp", "1.5", "DevCorp", "Linux");
        Webapp webapp = new Webapp("MyWebApp", "3.0", "DevCorp", true);
        Gameapp gameapp = new Gameapp("MyGameApp", "4.2", "DevCorp", "Adventure");

        System.out.println("\nMobile App Info:");
        mobileApp.displayMobileAppInfo();

        System.out.println("\nDesktop App Info:");
        desktopApp.displayDesktopInfo();

        System.out.println("\nWeb App Info:");
        webapp.displayWebappInfo();

        System.out.println("\nGame App Info:");
        gameapp.displayGameAppInfo();
    }
}


