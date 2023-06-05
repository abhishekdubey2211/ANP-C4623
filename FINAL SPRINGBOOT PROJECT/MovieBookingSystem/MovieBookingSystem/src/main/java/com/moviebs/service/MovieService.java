package com.moviebs.service;
import java.util.*;
import com.moviebs.dto.*;
import com.moviebs.model.*;

public interface MovieService 
{
 	
	String createMovie(Movie movie);
	List<Movie> getAllMovies();
	MovieDTO updateMovie(int id, Movie movie);
	String deleteMovieById(int id);
	List<MovieDTO> getMovieByName(String movieName);
	List<MovieDTO> getMovieByLocation(String movieLocation);
	List<MovieDTO> getMovieByGenre(String movieGenre);
	List<MovieDTO> getMovieByPrice(float moviePrice);
	List<MovieDTO> getMovieBYPriceBetween(float startPrice, float endPrice);
}