package com.xworkz.collage.things;

import java.util.Objects;

public class CollageDetails {
	
	private int noOfStudents;
	private String name;
	private int roomNumber;
	private int totalstudents;
	private String teacherName;
	public int getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public int getTotalstudents() {
		return totalstudents;
	}
	public void setTotalstudents(int totalstudents) {
		this.totalstudents = totalstudents;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, noOfStudents, roomNumber, teacherName, totalstudents);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CollageDetails other = (CollageDetails) obj;
		return Objects.equals(name, other.name) && noOfStudents == other.noOfStudents && roomNumber == other.roomNumber
				&& Objects.equals(teacherName, other.teacherName) && totalstudents == other.totalstudents;
	}
	@Override
	public String toString() {
		return "CollageDetails [noOfStudents=" + noOfStudents + ", name=" + name + ", roomNumber=" + roomNumber
				+ ", totalstudents=" + totalstudents + ", teacherName=" + teacherName + "]";
	}
}
