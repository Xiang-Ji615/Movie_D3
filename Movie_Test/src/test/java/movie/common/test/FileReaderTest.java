package test.java.movie.common.test;

import static org.testng.Assert.assertNotNull;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.testng.annotations.Test;

import main.java.movie.common.file.lister.IFileLister;
import main.java.movie.common.file.model.Movie;
import main.java.movie.common.file.reader.IFileReader;
import main.java.movie.dao.dao.IMovieDao;
import main.java.movie.test.config.TestConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {TestConfig.class})
@Transactional
//@SpringBootTest(classes= {TestConfig.class})
//@Transactional
//public class FileReaderTest extends AbstractTestNGSpringContextTests{
public class FileReaderTest {

	@Autowired
	@Qualifier("csvFileLister")
	IFileLister<File> fileLister;
	
	@Autowired
	@Qualifier("csvFileReaderImp")
	IFileReader<File, List<Movie>> csvMovieReader;
	
	@Autowired
	IMovieDao movieDao;
	
	@org.junit.Test
	@Transactional(propagation=Propagation.REQUIRED)
	@Commit
	public void fileReaderTest() throws IOException {
		List<File> files = fileLister.listFilesInFolder("C:\\Comactivity\\Movie");
		for(File file : files) {
			List<Movie> movies = csvMovieReader.readFile(file);
			movieDao.saveMovies(movies);
		}
		assertNotNull("Hello world");
	}
	
//	@Test
//	@Rollback
//	public void deleteMovies() throws IOException {
//		List<Movie> movies = movieDao.listMovies();
//		movieDao.deleteMovies(movies);
//		assertNotNull("Hello world");
//	}
	
//    @org.junit.Test
//	public void deleteMovies() throws IOException {
//		Object movie = movieDao.findMovie(2);
//		assertNotNull(movie);
//	}
    
//    @Test
//	public void deleteMovies() throws IOException {
//	List<Movie> movies = movieDao.listMovies();
//	movieDao.deleteMovies(movies);
//	assertNotNull("Hello world");
//}
}
