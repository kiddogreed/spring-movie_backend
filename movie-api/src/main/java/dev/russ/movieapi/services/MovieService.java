package dev.russ.movieapi.services;

import dev.russ.movieapi.model.Movie;
import dev.russ.movieapi.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
   private MovieRepository movieRepository;
    public List<Movie> allMovies() {
        System.out.println( movieRepository.findAll().toString());
        return movieRepository.findAll();
    }

    public  Optional<Movie> singleMovie(ObjectId id) {
        return movieRepository.findById(id);
    }
}