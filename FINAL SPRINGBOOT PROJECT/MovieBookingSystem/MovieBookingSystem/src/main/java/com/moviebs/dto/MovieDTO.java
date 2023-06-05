package com.moviebs.dto;
import lombok.*;

@Data
public class MovieDTO
{
	private int movieId;

	private String movieName;
	private String movieLanguage;
	private String movieType;
	private String movieGenre;
	private String location;
	private String movieTime;
	private int seatAvailable;
	private float price;

}
