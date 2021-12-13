package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest {
    @Test
    public void givenHotelNameShouldBePassed() {
        HotelReservation hotelReservation = new HotelReservation();

        boolean lakewoodHotel = hotelReservation.checkHotelDetails(new Hotel("LakeWoods", 110,80,90, 80, 3));
        Assert.assertTrue(lakewoodHotel);
        boolean bridgewoodHotel = hotelReservation.checkHotelDetails(new Hotel("Bridgewood", 160,110,60, 50, 4));
        Assert.assertTrue(bridgewoodHotel);
        boolean ridgewoodhotel = hotelReservation.checkHotelDetails(new Hotel("Ridgewood", 220,110, 150, 40, 5));
        Assert.assertTrue(ridgewoodhotel);
    }

    @Test
    public void toFindBestRatingHotel() {
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.getBestRatingsHotel();
    }
}
