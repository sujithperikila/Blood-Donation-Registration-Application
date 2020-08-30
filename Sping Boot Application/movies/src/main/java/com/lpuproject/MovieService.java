package com.lpuproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

	@Autowired
	private MovieRepostory movierepository;
	
	public List<Movie> getAllMovies() {
	
		List<Movie> movies = new ArrayList();
		
		movierepository.findAll().forEach(movies::add);
		
		return movies;
		
//		return movies;
	
	}
	
	public Optional<Movie> getMovie(String id) {
		return movierepository.findById(id);
		//	return movies.stream().filter(mov -> mov.getId().equals(id)).findFirst().get();
	}
	
	public void addMovie(Movie mov) {
//		movies.add(mov);
		movierepository.save(mov);
	}
	
	
	
}


