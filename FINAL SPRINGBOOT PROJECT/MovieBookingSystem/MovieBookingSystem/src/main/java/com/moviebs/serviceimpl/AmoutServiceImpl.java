package com.moviebs.serviceimpl;
import com.moviebs.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

import com.moviebs.model.*;
import com.moviebs.repos.*;
import org.springframework.stereotype.Service;



@Service
public class AmoutServiceImpl implements AmountService
{
	
		
		@Autowired
		private MovieRepository movieRepository;
		
		@Override
		public float getTicketAmount(List<Ticket> TicketList)
		{
		
			float totalTicketAmount = 0f;
	        float singleTicketAmount = 0f;
	        int seatsAvailable = 0;
		
	        for(Ticket t : TicketList)
	        {
	        	int movieId= t.getMovieId();
	        	Optional<Movie> movie= movieRepository.findById(movieId);
	        	if(movie.isPresent())
	        	{
	        		Movie movie1= movie.get();
	        		if(movie1.getSeatAvailable() < t.getSeats())
	        		{
	        			singleTicketAmount= movie1.getPrice() * movie1.getSeatAvailable();
	        			t.setSeats(movie1.getSeatAvailable());
	        		}
	        		else
	        		{
	        			singleTicketAmount= t.getSeats() * movie1.getPrice();
	        			seatsAvailable=movie1.getSeatAvailable() - t.getSeats();
	        		}
	        		totalTicketAmount= totalTicketAmount + singleTicketAmount;
	        		movie1.setSeatAvailable(seatsAvailable);
	        		seatsAvailable=0;
	        		t.setMovieName(movie1.getMovieName());
	        		t.setTotalAmount(singleTicketAmount);
	        		movieRepository.save(movie1);
	        	}
	        }
	        return totalTicketAmount;
		}

}
