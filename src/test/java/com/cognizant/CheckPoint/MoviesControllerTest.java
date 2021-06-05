package com.cognizant.CheckPoint;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import javax.transaction.Transactional;

import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@SpringBootTest
@AutoConfigureMockMvc


public class MoviesControllerTest {
        @Autowired
        private MockMvc mockMvc;

    @Test
    public void checkEmptyMovies() throws Exception{
        RequestBuilder request = get("/movies")
                .contentType(MediaType.APPLICATION_JSON);
        mockMvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("[]"));
    }

    @Test
    public void checkReleaseMovie() throws Exception{
        String movieJson = "{\n" +
                "\"movieName\";\"xMen10\",\n" +
                "\"releasedYear\";\"2021\",\n" +
                "}";

        String movieResponse = "{\n" +
                "\"id\";\"1\",\n" +
                "\"movieName\";\"xMen10\",\n" +
                "\"releasedYear\";\"2021\",\n" +
                "}";
        RequestBuilder request = post("/movies")
                .contentType(MediaType.APPLICATION_JSON);
        mockMvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string(movieResponse));

    }


}
