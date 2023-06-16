package com.moviebs.model;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="booking")
public class Booking
{
	//specifies primary key
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
  	
	//One customer can make many booking at a time 
  	@ManyToOne(cascade = CascadeType.MERGE)
  	
  	//to prevent the customer field from being serialized to JSON
  	@JsonIgnore
  	private Customer customer;
  	
  	//One booking with multiple tickets
  	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, targetEntity = Ticket.class)
  	@JoinColumn(name = "booking_id", referencedColumnName = "id")
  	private List<Ticket> booking;
  	
  	//Parameterized constructor	
	public Booking(Customer customer, List<Ticket> booking) 
	{
		super();
		this.customer = customer;
		this.booking = booking;
	}			

}
