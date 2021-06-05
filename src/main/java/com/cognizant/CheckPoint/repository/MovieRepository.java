package com.cognizant.CheckPoint.repository;

import com.cognizant.CheckPoint.domain.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<Movie,Long> {

    public Movie findByName(String name);

}
