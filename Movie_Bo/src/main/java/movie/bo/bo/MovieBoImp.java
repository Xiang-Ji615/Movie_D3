package main.java.movie.bo.bo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import main.java.movie.common.file.model.Movie;
import main.java.movie.dao.dao.IMovieDao;
import main.java.movie.dao.model.MovieGrossType;

@Component
public class MovieBoImp implements IMovieBo {
	
	@Autowired
	IMovieDao movieDao;

	@Override
	public List<MovieGrossType> getMovieGrossType() {
		List<String> movieTypes = movieDao.getMovieType();
		List<Movie> movies = movieDao.listMovies();
		List<MovieGrossType> movieGrossTypes = new ArrayList<>();
		for(String movieType : movieTypes) {
			MovieGrossType grossType = new MovieGrossType();
			for(Movie movie : movies) {
				if(movie.getGenres1().equals(movieType) || movie.getGenres2().equals(movieType) || movie.getGenres3().equals(movieType) || movie.getGenres4().equals(movieType) || movie.getGenres5().equals(movieType) || movie.getGenres6().equals(movieType) || movie.getGenres7().equals(movieType)) {
					grossType.setType(movieType);
					grossType.setName(movieType);
					grossType.setGrossSum(grossType.getGrossSum()==null?0:grossType.getGrossSum() + movie.getGross());
				}
			}
			movieGrossTypes.add(grossType);
		}
		return movieGrossTypes;
	}



}
