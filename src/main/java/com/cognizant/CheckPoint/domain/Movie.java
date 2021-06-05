package com.cognizant.CheckPoint.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

//@JsonIgnoreProperties
@Entity

public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;


    public String name;


    public int releaseYear;

    public Movie(String name, Long id,int releaseYear ) {
        this.name = name;
        this.id = id;
        this.releaseYear = releaseYear;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Movie() {
    }
}
