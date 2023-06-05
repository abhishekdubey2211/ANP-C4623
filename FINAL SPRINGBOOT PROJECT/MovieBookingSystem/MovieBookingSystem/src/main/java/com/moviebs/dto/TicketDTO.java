package com.moviebs.dto;
import lombok.*;


@Data
public class TicketDTO 
{
	private float amount;
	private int invoiceNumber;
	private String date;
	private int bookingId;
	private String notes;
	

}
