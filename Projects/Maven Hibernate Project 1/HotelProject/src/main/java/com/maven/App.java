package com.maven;

import java.util.*;
import com.maven.dao.*;
import com.maven.model.*;
public class App 
{
    public static void main( String[] args )
    {
    	HotelDao hotelDao = new HotelDao();

        // test saveHotel
    	Hotel hotel =new Hotel("MAHRANA VILLAH","ABHISHEK DUBEY","abhi@gmail.com",488659665,101);
    	Hotel hotel1 =new Hotel("HOTEL RAJPUT","SACHIN YADAV","sachin@gmail.com",548966585,102);
    	Hotel hotel2 =new Hotel("MAHRANA HOTEL","SANJAY GAIKWAD","SANJAY@gmail.com",5785464,103);
    	Hotel hotel3 =new Hotel("ROYALS HOTEL","SHIVAM YADAV","sHIVAM@gmail.com",4754985,104);
        //passing value in parameterized constructor
        hotelDao.saveHotel(hotel);
        hotelDao.saveHotel(hotel1);
        hotelDao.saveHotel(hotel2);
        hotelDao.saveHotel(hotel3);
        
        // test updateHotel
//        hotel.getGuest_name("LALIT TRIPATHI");
//        hotelDao.updateHotel(hotel2);
        
        // test getHotelById
       // Hotel hotel2 = hotelDao.getHotelById(hotel.getId());

        // test getAllHotels
        List < Hotel > hotels = hotelDao.getAllHotels();
        hotels.forEach(hotel5 -> System.out.println(hotel5.getId()));
        // -> lambda expression left side of arrow:parameter ; right:value
        
        // test deleteHotel
//        hotelDao.deleteHotel(2);

    }
    }







