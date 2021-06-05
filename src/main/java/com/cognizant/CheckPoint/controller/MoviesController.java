package com.cognizant.CheckPoint.controller;


import com.cognizant.CheckPoint.domain.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MoviesController {

    @GetMapping("/movies")
    public List<Movie> getMovie(){
//      return moviesRepository.findAll();
        List<Movie> movieList = new ArrayList();
        return movieList;
    }

}
