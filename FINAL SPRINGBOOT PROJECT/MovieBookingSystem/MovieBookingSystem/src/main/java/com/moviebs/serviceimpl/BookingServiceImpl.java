package com.moviebs.serviceimpl;

import java.util.Optional;
import java.util.Random;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.moviebs.exception.ResourceNotFoundException;
import com.moviebs.model.*;
import com.moviebs.repos.*;
import com.moviebs.service.*;
import com.moviebs.util.DateUtil;
import com.moviebs.dto.*;

@Service
public class BookingServiceImpl implements BookingService
{
	@Autowired
	private BookingRepository bookingRepository;
	
	@Autowired
	private AmountService amountService;
	
	@Autowired
	private CustomerService customerService;
	
	
	@Override
	public Booking getBookingDetailById(int bookingId) {
		Optional<Booking> booking= Optional.ofNullable(bookingRepository.findById(bookingId).orElseThrow(()->
		new ResourceNotFoundException("Booking", "ID", bookingId)));
		return booking.isPresent() ? booking.get() : null;
	}


	@Override
	public TicketDTO bookTicket(BookingDTO bookingDTO) {
		TicketDTO ticketDTO= new TicketDTO();
		float amount= amountService.getTicketAmount(bookingDTO.getTicket());
		if(amount!=0f)
			
		{
			Customer customer= new Customer(bookingDTO.getCustomerName(), bookingDTO.getCustomerEmail());
			Integer customerIdFromDb = customerService.isCustomerPresent(customer);
			if(customerIdFromDb!=null)
			{
				customer.setId(customerIdFromDb);
			}
			else
			{
				customer= customerService.saveCustomer(customer);
			}
			Booking booking=  new Booking(customer,bookingDTO.getTicket());
			booking= bookingRepository.save(booking);
			
			ticketDTO.setAmount(amount);
			ticketDTO.setDate(DateUtil.getCurrentDateTime());
			ticketDTO.setInvoiceNumber(new Random().nextInt(1000));
			ticketDTO.setBookingId(booking.getId());
			ticketDTO.setNotes("Thank you for booking, enjoy the show");
		}
		else
		{
			ticketDTO.setNotes("Error - "+"Something went wrong.");
		}
		return ticketDTO;
	}


	@Override
	public String cancelTicket(int id) {
		String message=null;
		Booking booking= bookingRepository.findById(id).get();
		if(booking!=null)
		{
			bookingRepository.deleteById(id);
			message="Ticket Deleted";
		}
		else
		{
			message="Ticket Id not found";
		}
		return message;
	}
}
