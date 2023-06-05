package com.moviebs.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.moviebs.service.*;
import com.moviebs.dto.*;
import com.moviebs.model.*;
@RestController
@RequestMapping("/booking")
public class BookingTicketController 
{
	@Autowired
	private BookingService bookingService;
	
	@GetMapping("/{id}") 
	public Booking getBookingDetails(@PathVariable int bookingId)
	{
		Booking booking= bookingService.getBookingDetailById(bookingId);
		return booking;
	}
	
	@PostMapping("/bookTicket")
	public TicketDTO bookTicket(@RequestBody BookingDTO bookingDTO)
	{
		return bookingService.bookTicket(bookingDTO);
	}
	
	@DeleteMapping("/{id}")
	public String cancelTicket(@PathVariable("id") int id)
	{
		return bookingService.cancelTicket(id);
	}

}
