package com.stackroute.movieservice.domain;

import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Movie {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int movieId;
	private String movieTitle;
	private int movieRating;
	private int movieYear;
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}

	public Movie(int movieId, String movieTitle, int movieRating, int movieYear) {
		
		this.movieId = movieId;
		this.movieTitle = movieTitle;
		this.movieRating = movieRating;
		this.movieYear = movieYear;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public int getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(int movieRating) {
		this.movieRating = movieRating;
	}

	public int getMovieYear() {
		return movieYear;
	}

	public void setMovieYear(int movieYear) {
		this.movieYear = movieYear;
	}

}