package com.moviebs;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.moviebs.model.Booking;
import com.moviebs.repos.BookingRepository;
import com.moviebs.service.*;
import com.moviebs.serviceimpl.BookingServiceImpl;


@SpringBootTest
class MovieBookingSystemApplicationTests 
{
	@Mock
	private BookingRepository bookingRepository;

	@Mock
    private AmountService amountService;

	@Mock
    private CustomerService customerService;
	
	@InjectMocks
	private BookingServiceImpl bookingService;
	
	@InjectMocks
	private Booking booking;
	
	 @Test
	    public void testCancelTicket() {
	        // Prepare test data
	        int bookingId = 1;

	        // Mock the behavior of the bookingRepository
	        when(bookingRepository.findById(anyInt())).thenReturn(Optional.of(booking));

	        // Call the method under test
	        String message = bookingService.cancelTicket(bookingId);

	        // Verify the result
	        assertEquals("Ticket Deleted", message);
	        verify(bookingRepository, times(1)).deleteById(bookingId);
	    }
	}
	
//	 @Test
//	 public void testGetBookingDetailById() 
//	 {
//	        // Mock the behavior of the bookingRepository
//	        Booking booking = new Booking();
//	       // booking.setBooking(({[1 ,2]),"John","jhon@gmail.com");
//	        when(bookingRepository.findById(anyInt())).thenReturn(Optional.of(booking));
//
//	        // Call the method under test
//	        Booking result = bookingService.getBookingDetailById(1);
//
//	        // Verify the result
//	        assertNotNull(result);
//	        assertEquals(booking, result);
//	    }
//
//	
//}
