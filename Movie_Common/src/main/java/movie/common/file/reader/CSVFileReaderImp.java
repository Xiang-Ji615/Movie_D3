package main.java.movie.common.file.reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.opencsv.CSVReader;

import main.java.movie.common.file.model.Movie;

@Component(value="csvFileReaderImp")
public class CSVFileReaderImp extends AbstractFileReader implements IFileReader<File, List<Movie>>{

	@Override
	public List<Movie> readFile(File in) throws IOException {
		List<Movie> ret = new ArrayList<>();
		CSVReader fileReader = new CSVReader(new FileReader(in), ',', '"', 1);
		List<String[]> rawData = fileReader.readAll();
		for (String[] data : rawData) {
			Movie movie = new Movie();
			movie.setColor(Optional.ofNullable(data[0]).orElse(""));
			movie.setDirector_name(Optional.ofNullable(data[1]).orElse(""));
			movie.setNum_critic_for_reviews(Integer.valueOf(Optional.ofNullable(data[3]).orElse("0").equals("")?"0":Optional.ofNullable(data[3]).get()));
			movie.setDuration(Integer.valueOf(Optional.ofNullable(data[4]).orElse("").equals("")?"0":Optional.ofNullable(data[4]).get()));
			movie.setDirector_facebook_likes(Integer.valueOf(Optional.ofNullable(data[5]).orElse("0").equals("")?"0":Optional.ofNullable(data[5]).get()));
			movie.setActor_3_facebook_likes(Integer.valueOf(Optional.ofNullable(data[6]).orElse("0").equals("")?"0":Optional.ofNullable(data[6]).get()));
			movie.setActor_2_name(Optional.ofNullable(data[7]).orElse(""));
			movie.setActor_1_facebook_likes(Integer.valueOf(Optional.ofNullable(data[8]).orElse("0").equals("")?"0":Optional.ofNullable(data[8]).get()));
			movie.setGross(Integer.valueOf(Optional.ofNullable(data[9]).orElse("0").equals("")?"0":Optional.ofNullable(data[9]).get()));
			movie.setActor_1_name(Optional.ofNullable(data[10]).orElse(""));
			movie.setMovie_title(Optional.ofNullable(data[11]).orElse(""));
			movie.setNum_voted_users(Integer.valueOf(Optional.ofNullable(data[12]).orElse("0")));
		
			movie.setActor_3_name(Optional.ofNullable(data[14]).orElse(""));
			movie.setFacenumber_in_poster(Integer.valueOf(Optional.ofNullable(data[15]).orElse("0").equals("")?"0":Optional.ofNullable(data[15]).get()));
			movie.setPlot_keywords(Optional.ofNullable(data[16]).orElse(""));
			movie.setMovie_imdb_link(Optional.ofNullable(data[17]).orElse(""));
			movie.setNum_user_for_reviews(Integer.valueOf(Optional.ofNullable(data[18]).orElse("0").equals("")?"0":Optional.ofNullable(data[18]).get()));
			movie.setLanguage(Optional.ofNullable(data[19]).orElse(""));
			movie.setCountry(Optional.ofNullable(data[20]).orElse(""));
			movie.setContent_rating(Optional.ofNullable(data[21]).orElse(""));
			movie.setBudget(Long.valueOf(Optional.ofNullable(data[22]).orElse("0").equals("")?"0":Optional.ofNullable(data[22]).get()));
			movie.setTitle_year(Integer.valueOf(Optional.ofNullable(data[23]).orElse("0").equals("")?"0":Optional.ofNullable(data[23]).get()));
			movie.setActor_2_facebook_likes(Integer.valueOf(Optional.ofNullable(data[24]).orElse("0").equals("")?"0":Optional.ofNullable(data[24]).get()));
			movie.setImdb_score(Double.valueOf(Optional.ofNullable(data[25]).orElse("0").equals("")?"0":Optional.ofNullable(data[25]).get()));
			movie.setAspect_ratio(Double.valueOf(Optional.ofNullable(data[26]).orElse("0").equals("")?"0":Optional.ofNullable(data[26]).get()));
			movie.setMovie_facebook_likes(Integer.valueOf(Optional.ofNullable(data[27]).orElse("0").equals("")?"0":Optional.ofNullable(data[27]).get()));
			movie.setGenres1(Optional.ofNullable(data[28]).orElse(""));
			movie.setGenres2(Optional.ofNullable(data[29]).orElse(""));
			movie.setGenres3(Optional.ofNullable(data[30]).orElse(""));
			movie.setGenres4(Optional.ofNullable(data[31]).orElse(""));
			movie.setGenres5(Optional.ofNullable(data[32]).orElse(""));
			movie.setGenres6(Optional.ofNullable(data[33]).orElse(""));
			movie.setGenres7(Optional.ofNullable(data[34]).orElse(""));
			ret.add(movie);
		}
		return ret;
	}

}
