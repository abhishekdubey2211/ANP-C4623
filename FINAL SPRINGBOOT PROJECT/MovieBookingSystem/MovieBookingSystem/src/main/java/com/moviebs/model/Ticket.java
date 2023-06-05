package com.moviebs.model;
import lombok.*;
import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="booked_ticket")
public class Ticket
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ticketId;
	
	@Column(name="movie_id")
	private int movieId;
	
	@Column(name="movie_name")
	private String movieName;
	
	@Column(name="booked_seats")
	private int seats;
	
	@Column(name="total_amaount")
	private float totalAmount;


	public Ticket(int movieId, int seats) {
		super();
		this.movieId = movieId;
		this.seats = seats;
	}

	public Ticket(int movieId, String movieName, int seats, float totalAmount) 
	{
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.seats = seats;
		this.totalAmount = totalAmount;
	}

}
