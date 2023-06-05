package com.moviebs.model;

import javax.persistence.*;
import java.util.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="booking")
public class Booking
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
  	
  	@OneToOne(cascade = CascadeType.ALL)
  	private Customer customer;
  	
  	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, targetEntity = Ticket.class)
  	@JoinColumn(name = "booking_id", referencedColumnName = "id")
  	private List<Ticket> booking;

	public Booking(Customer customer, List<Ticket> booking) 
	{
		super();
		this.customer = customer;
		this.booking = booking;
	}			

}
