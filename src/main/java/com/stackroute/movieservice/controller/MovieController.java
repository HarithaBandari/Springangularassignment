package com.stackroute.movieservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.movieservice.domain.Movie;
import com.stackroute.movieservice.services.MovieService;

@RestController
@RequestMapping(value = "/api/v1/")
public class MovieController {
	
	private MovieService movieService;
@Autowired
	public MovieController(MovieService movieService) {
		
		this.movieService = movieService;
	}
	
@RequestMapping(value = "/movie", method = RequestMethod.POST)
public ResponseEntity<?>  saveMovie(@RequestBody Movie movie) {
	Movie movieObj=movieService .saveMovie(movie);
	return new ResponseEntity<Movie>(movieObj,HttpStatus.OK);

}

@RequestMapping(value = "/movies", method = RequestMethod.GET)
public ResponseEntity<?>  getAllMovies() {
	List<Movie> list=movieService .getAllMovies();
	return new ResponseEntity<List<Movie>>(list,HttpStatus.OK);

}

}