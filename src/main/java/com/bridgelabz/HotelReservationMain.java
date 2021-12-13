package com.bridgelabz;
public class HotelReservationMain {
    public static void main(String[] args) {
            System.out.println("Welcome to Hotel Reservation Program");
            HotelReservation hotelReservation = new HotelReservation();
            hotelReservation.addHotelDetails("Lakewood", 110, 80, 90, 80, 3);
            hotelReservation.addHotelDetails("Bridgewood", 160, 110, 60, 50, 4);
            hotelReservation.addHotelDetails("Ridgewood", 220, 110, 150, 40, 5);
            hotelReservation.viewHotels();
        }
    }