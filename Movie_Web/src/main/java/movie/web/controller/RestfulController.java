package main.java.movie.web.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import main.java.movie.bo.bo.IMovieBo;
import main.java.movie.common.file.lister.IFileLister;
import main.java.movie.common.file.model.Movie;
import main.java.movie.common.file.reader.IFileReader;
import main.java.movie.dao.dao.IMovieDao;
import main.java.movie.dao.model.MovieGrossType;

@RestController
@RequestMapping(value="Rest/V1")
@CrossOrigin
public class RestfulController {

	@Autowired
	IMovieBo movieBo;
	
	@Autowired
	@Qualifier("csvFileLister")
	IFileLister<File> fileLister;
	
	@Autowired
	@Qualifier("csvFileReaderImp")
	IFileReader<File, List<Movie>> csvMovieReader;
	
	@Autowired
	IMovieDao movieDao;
	
	@RequestMapping(value="MovieGrossType", method=RequestMethod.GET)
	public Object getMovieGrossType(){
		Map<String, Object> ret = new HashMap<>();
		ret.put("name", "GrossType");
		List<Object> data = new ArrayList<>();
		List<MovieGrossType> movieGrossTypes = movieBo.getMovieGrossType();
		for(MovieGrossType movieGrossType : movieGrossTypes) {
			Map<String, Object> dataChildren = new HashMap<>();
			dataChildren.put("children", new MovieGrossType[] { movieGrossType });
			dataChildren.put("name", movieGrossType.getName());
			data.add(dataChildren);
		}
		ret.put("children", data);
		return ret;
	}
	
	@RequestMapping(value="InitData", method=RequestMethod.GET)
	public Object initData() throws IOException {
		List<File> files = fileLister.listFilesInFolder("/Users/wenshi/Documents/Movie");
		for(File file : files) {
			List<Movie> movies = csvMovieReader.readFile(file);
			movieDao.saveMovies(movies);
		}
		return true;
	}
}
