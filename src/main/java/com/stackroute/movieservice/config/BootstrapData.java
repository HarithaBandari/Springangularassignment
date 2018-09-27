package com.stackroute.movieservice.config;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.boot.CommandLineRunner;
	import org.springframework.context.annotation.Configuration;
	import com.stackroute.movieservice.domain.Movie;
	import com.stackroute.movieservice.repository.MovieRepository;

	@Configuration
	public class BootstrapData implements CommandLineRunner {
		MovieRepository movieRepository;

		@Autowired
		public BootstrapData(MovieRepository movieRepository) {
			this.movieRepository = movieRepository;
		}

		@Override
		public void run(String... args) throws Exception {

			Movie movie = new Movie();
			movie.setMovieId(1);
			movie.setMovieTitle("batman");
			movieRepository.save(movie);
		}
	}

