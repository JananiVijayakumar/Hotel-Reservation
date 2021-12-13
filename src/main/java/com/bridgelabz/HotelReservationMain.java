package com.bridgelabz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HotelReservationMain {
    public static void main(String[] args) throws ParseException {
            System.out.println("Welcome to Hotel Reservation Program");
            HotelReservation hotelReservation = new HotelReservation();
            hotelReservation.addHotelDetails("Lakewood", 110, 80, 90, 80, 3);
            hotelReservation.addHotelDetails("Bridgewood", 160, 110, 60, 50, 4);
            hotelReservation.addHotelDetails("Ridgewood", 220, 110, 150, 40, 5);
            String startDate ="10-09-2020";
            String endingDate ="11-09-2020";
            Date sdate =new SimpleDateFormat("dd-MM-yyyy").parse(startDate);
            Date edate =new SimpleDateFormat("dd-MM-yyyy").parse(endingDate);
            System.out.println(startDate +"\t"+ sdate);
            System.out.println(endingDate +"\t"+ edate);
            hotelReservation.viewHotels();
        }
    }