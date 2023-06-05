package com.moviebs.util;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import com.moviebs.dto.MovieDTO;
import com.moviebs.model.Movie;

@Component
public class MovieConverter
{
	public Movie convertToMovieEntity(MovieDTO movieDTO)
	{
		Movie movie= new Movie();
		if(movie!=null)
		{
			BeanUtils.copyProperties(movieDTO, movie);
		}
		return movie;
	}
	
	public MovieDTO convertToMovieDTO(Movie movie)
	{
		MovieDTO movieDTO= new MovieDTO();
		if(movieDTO!=null)
		{
			BeanUtils.copyProperties(movie, movieDTO);
		}
		return movieDTO;
	}

}
