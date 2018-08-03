package com.stackroute.movieservice.services;

import java.util.List;

import com.stackroute.movieservice.domain.Movie;

public interface MovieService {
	
	public Movie saveMovie(Movie movie);

	public List<Movie> getAllMovies();

	

}