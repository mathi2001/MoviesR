package com.example.MoviesR;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoviesService {
    @Autowired
    private MovieRepository moviesRepository;
    public List<Movie> allMovies(){
        return moviesRepository.findAll();
    }
}
