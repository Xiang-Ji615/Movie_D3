package main.java.movie.dao.dao;

import java.util.List;

import main.java.movie.common.file.model.Movie;

public interface IMovieDao {

	Boolean saveMovies(List<Movie> movies);
	
	Boolean deleteMovies(List<Movie> movies);
	
	List<Movie> listMovies();
	
	Object findMovie(Integer id);
	
	List<String> getMovieType();
}
