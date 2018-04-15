package main.java.movie.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import main.java.movie.bo.bo.IMovieBo;
import main.java.movie.dao.model.MovieGrossType;

@RestController
@RequestMapping(value="Rest/V1")
@CrossOrigin
public class RestfulController {

	@Autowired
	IMovieBo movieBo;
	
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
}
