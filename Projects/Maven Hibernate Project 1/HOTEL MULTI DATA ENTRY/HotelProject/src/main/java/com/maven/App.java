package com.maven;

import java.util.*;
import com.maven.dao.*;
import com.maven.model.*;
public class App 
{
    public static void main( String[] args )
    {
    	HotelDao hotelDao = new HotelDao();
    	Scanner sc = new Scanner(System.in);
    	System.out.println("no of data = ");
    	int size = sc.nextInt();
    	
    	String[] hname = new String[size];
    	int [] roomno = new int[size];
    	String[] gname = new String[size];
    	String[] email = new String[size];
    	long[] mobile = new long[size];
    	Hotel[] data = new Hotel[size];
    	
    	
    	for(int i=0; i<size ; i++) {
    		System.out.printf("GUEST %d \n",i+1);
        	System.out.println("Enter your Hotel name = ");
        	 hname[i]=sc.next();
        	 System.out.println("Enter your room no = ");
        	 roomno[i]=sc.nextInt();
        	System.out.println("Enter your Guest name = ");
        	 gname[i]=sc.next();
        	System.out.println("Enter your Guest email = ");
        	 email[i]=sc.next();
        	System.out.println("Enter your mobile no = ");
        	 mobile[i]=sc.nextLong();
        	 System.out.println("\n*******************************************\n");
    	}
    	
    	for(int i = 0 ; i<size ; i++) 
    	{
   		  data[i] =new Hotel( hname[i],  roomno[i],  gname[i],  email[i],  mobile[i]) ;
    	}
    	
    	for(int i = 0 ; i<size ; i++) {
    		 hotelDao.saveHotel(data[i]);
       	}
       	
      	for(int i = 0 ; i<size ; i++) {
      		System.out.println(gname[i]);
      		if(gname[i]=="abhishek") 
      		{
      			data[i].setGuestname("Sachin");
      			hotelDao.updateHotel(data[i]);
      		}
      		
      	}
       		
    	
    	
   //GATHERING EMPLOYEES DATA
//        Hotel hotel =new Hotel("Royals Hotel",001,"Abhishek Dubey","abhi@gmail.com",885001499);
//        Hotel hotel1 =new Hotel("Royals Hotel",002,"SACHIN YADAV","sachin@gmail.com",74851499);
//        Hotel hotel2 =new Hotel("Royals Hotel",003,"ANJU PRAJAPATI","anju@gmail.com",775001499);
//        Hotel hotel3 =new Hotel("Royals Hotel",004,"AMIT Dubey","amit@gmail.com",885521499);
//        
//        //passing value in parameterized constructor     FOR SAVING EMPLOYEES DATA
//        hotelDao.saveHotel(hotel);
//        hotelDao.saveHotel(hotel1);
//        hotelDao.saveHotel(hotel2);
//        hotelDao.saveHotel(hotel3);
//        
//        
//        // test updateHotel
//        hotel.setGuestname("ABHISHEK");
//        hotelDao.updateHotel(hotel);
        
        // test getHotelById
//        Hotel hotel4 = hotelDao.getHotelById(hotel.getId());

        
        // test getAllHotels
        List < Hotel > hotels = hotelDao.getAllHotels();
        hotels.forEach(hotel4 -> System.out.println(hotel4.getId()));
        // -> lambda expression left side of arrow:parameter ; right:value
        
        // test deleteHotel
//        hotelDao.deleteHotel(2);

    }
 }



