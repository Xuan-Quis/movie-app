package com.nxq.movie.controller;

import com.nxq.movie.entity.Movie;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/api/v1/movie")
public class MovieController {
    @GetMapping
    public List<Movie> getAllMovies() {
        return null;
    }
    @GetMapping("/{id}")
    public Movie getMoviesById(@PathVariable int id) {
        return null;
    }
    @PostMapping
    public Movie addMovie(@RequestBody Movie movie) {
        return null;
    }
    @PutMapping("{id}")
    public Movie updateMovie(@PathVariable int id, @RequestBody Movie movie) {
        return null;
    }
}
