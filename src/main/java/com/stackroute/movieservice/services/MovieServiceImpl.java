package com.stackroute.movieservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.movieservice.domain.Movie;
import com.stackroute.movieservice.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {

	private MovieRepository movieRepository;

	@Autowired
	public MovieServiceImpl(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}

	@Override
	public Movie saveMovie(Movie movie) {
		Movie movieObj=movieRepository.save(movie);
		// 1. save in cloud
		// 2save to db
		// 3 send to mail service
		return movieObj;
	}

	@Override
	public List<Movie> getAllMovies() {
		List<Movie> movieList=(List<Movie>) movieRepository.findAll();
		return movieList;
	}

	
}