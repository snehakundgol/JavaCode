package com.xworkz.project_online.things;

public class Person 
{

    private String name;
    private int age;
    private String gender;
    private String address;
    private String contactNumber;
    
    public Person(String name, int age, String gender, String address, String contactNumber) 
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Person {" +
                "Name='" + name + '\'' +
                ", Age=" + age +
                ", Gender='" + gender + '\'' +
                ", Address='" + address + '\'' +
                ", Contact Number='" + contactNumber + '\'' +
                '}';
    }

    
}
