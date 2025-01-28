package com.xworkz.fitnesscentre.dto;

import java.util.Objects;

public class FitnessCentreDto {

	private String name;
    private String location;
    private int capacity;
    private String contactNumber;
    private String timings;
	public FitnessCentreDto(String name, String location, int capacity, String contactNumber, String timings) {
		super();
		this.name = name;
		this.location = location;
		this.capacity = capacity;
		this.contactNumber = contactNumber;
		this.timings = timings;
	}
	public FitnessCentreDto() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getTimings() {
		return timings;
	}
	public void setTimings(String timings) {
		this.timings = timings;
	}
	@Override
	public int hashCode() {
		return Objects.hash(capacity, contactNumber, location, name, timings);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FitnessCentreDto other = (FitnessCentreDto) obj;
		return capacity == other.capacity && Objects.equals(contactNumber, other.contactNumber)
				&& Objects.equals(location, other.location) && Objects.equals(name, other.name)
				&& Objects.equals(timings, other.timings);
	}
	@Override
	public String toString() {
		return "FitnessCentreDto [name=" + name + ", location=" + location + ", capacity=" + capacity
				+ ", contactNumber=" + contactNumber + ", timings=" + timings + "]";
	}
 }
