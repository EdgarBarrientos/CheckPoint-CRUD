package com.cognizant.CheckPoint.controller;


import com.cognizant.CheckPoint.domain.Movie;
import com.cognizant.CheckPoint.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MoviesController {

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping("/movies")
    public List<Movie> getMovie(){
//      return moviesRepository.findAll();
        List<Movie> movieList = new ArrayList();
        return movieList;
    }

    @PostMapping("/movies")
    public Movie createReleaseMovie(Movie movie){

        this.movieRepository.save(movie);
        return this.movieRepository.findByName(movie.name);
    }

}
