package com.stackroute.movieservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.stackroute.movieservice.domain.Movie;

@Repository
public interface MovieRepository extends CrudRepository<Movie,Integer>{
	
}