package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest {
    @Test
    public void givenHotelNameShouldBePassed() {
        HotelReservation hotelReservation = new HotelReservation();

        boolean lakewoodHotel = hotelReservation.checkHotelDetails(new Hotel("LakeWoods", 110,80,90, 80));
        Assert.assertTrue(lakewoodHotel);
        boolean bridgewoodHotel = hotelReservation.checkHotelDetails(new Hotel("Bridgewood", 160,110,60, 50));
        Assert.assertTrue(bridgewoodHotel);
        boolean ridgewoodhotel = hotelReservation.checkHotelDetails(new Hotel("Ridgewood", 220,110, 150, 40));
        Assert.assertTrue(ridgewoodhotel);
    }
}
