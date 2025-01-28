package com.xworkz.person.things;

import java.util.ArrayList;

class PersonDetails {
    private ArrayList<Person> persons = new ArrayList<>();
    public void createPerson(String name, int age) {
        Person person = new Person();
        persons.add(person);
        System.out.println("Person created successfully: " + person);
    }

    public void readPersons() {
        if (persons.isEmpty()) {
            System.out.println("No persons found.");
        } else {
            for (Person person : persons) {
                System.out.println(person);
            }
        }
    }

    public void updatePerson(int id, String newName, int newAge) {
        for (Person person : persons) {
            if (person.getId() == id) {
                person.setName(newName);
                person.setAge(newAge);
                System.out.println("Person updated successfully: " + person);
                return;
            }
        }
        System.out.println("Person with ID " + id + " not found.");
    }

    public void deletePerson(int id) {
        for (Person person : persons) {
            if (person.getId() == id) {
                persons.remove(person);
                System.out.println("Person deleted successfully.");
                return;
            }
        }
        System.out.println("Person with ID " + id + " not found.");
    }
}
