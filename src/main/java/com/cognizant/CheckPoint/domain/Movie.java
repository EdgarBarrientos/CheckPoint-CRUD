package com.cognizant.CheckPoint.Domain;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@JsonIgnoreProperties
@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty
    public Long id;

    @JsonProperty()
    public String name;



    @JsonProperty
    public String releasedYear;


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

    public String getReleasedYear() {
        return releasedYear;
    }

    public void setReleasedYear(String releasedYear) {
        this.releasedYear = releasedYear;
    }

    public Movie() {
    }
}

