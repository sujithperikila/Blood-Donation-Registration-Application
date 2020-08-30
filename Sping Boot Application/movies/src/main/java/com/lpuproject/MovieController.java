package com.lpuproject;

import java.awt.List;
import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lpuproject.Movie;
import com.lpuproject.MovieService;

@RestController
public class MovieController {

	//Dependency Injection
	
	@Autowired
	private MovieService movieservice;
	
	
	

	@CrossOrigin
	@RequestMapping("/movies")
	public java.util.List<Movie> getAllMovies() {
		
		return movieservice.getAllMovies();
	
	}

	@CrossOrigin
	@RequestMapping("/movies/{id}") 
	public Optional<Movie> getMovie(@PathVariable String id) {
	
		return movieservice.getMovie(id);	
	}
	@CrossOrigin
	@RequestMapping(method=RequestMethod.POST, value= "/movies")
	public void addMovie(@RequestBody Movie newmov) {
		movieservice.addMovie(newmov);
	
	}
	
	
}









