package com.xworkz.project_online.things;

public class Bus
{
    private String busNumber;
    private String driverName;
    private int seatingCapacity;
    private String route;
    private boolean isAC;
	private String ac;

  
    public Bus(String busNumber, String driverName, int seatingCapacity, String route, boolean isAC) 
    {
        this.busNumber = busNumber;
        this.driverName = driverName;
        this.seatingCapacity = seatingCapacity;
        this.route = route;
        this.isAC = isAC;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public boolean isAC() {
        return isAC;
    }

    public void setAC(boolean isAC) {
        this.isAC = isAC;
    }

    
    @Override
    public String toString() 
    {
		return "Bus Details: \n" + "Bus Number: " + busNumber + "\n" + "Driver Name: " + driverName + "\n"
				+ "Seating Capacity: " + seatingCapacity + "\n" + "Route: " + route + "\n" + "AC: " + ac;
	}

   
}
