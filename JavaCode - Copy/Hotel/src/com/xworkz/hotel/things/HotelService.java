package com.xworkz.hotel.things;

import java.util.ArrayList;

class HotelService {
    private ArrayList<Hotel> hotels = new ArrayList<>();
    private int currentId = 1;

    public void createHotel(String name, String location, double pricePerNight) {
        Hotel hotel = new Hotel(currentId++, name, location, pricePerNight);
        hotels.add(hotel);
        System.out.println("Hotel created successfully: " + hotel);
    }

    public void readHotels() {
        if (hotels.isEmpty()) {
            System.out.println("No hotels found.");
        } else {
            for (Hotel hotel : hotels) {
                System.out.println(hotel);
            }
        }
    }

    public void updateHotel(int id, String newName, String newLocation, double newPricePerNight) {
        for (Hotel hotel : hotels) {
            if (hotel.getId() == id) {
                hotel.setName(newName);
                hotel.setLocation(newLocation);
                hotel.setPricePerNight(newPricePerNight);
                System.out.println("Hotel updated successfully: " + hotel);
                return;
            }
        }
        System.out.println("Hotel with ID " + id + " not found.");
    }

    public void deleteHotel(int id) {
        for (Hotel hotel : hotels) {
            if (hotel.getId() == id) {
                hotels.remove(hotel);
                System.out.println("Hotel deleted successfully.");
                return;
            }
        }
        System.out.println("Hotel with ID " + id + " not found.");
    }
}

