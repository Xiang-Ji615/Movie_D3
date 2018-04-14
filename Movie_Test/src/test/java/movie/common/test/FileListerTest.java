package test.java.movie.common.test;

import static org.testng.Assert.assertNotNull;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import main.java.movie.common.file.lister.IFileLister;
import main.java.movie.test.config.TestConfig;

//@SpringBootTest(classes= {TestConfig.class})
public class FileListerTest extends AbstractTestNGSpringContextTests{

//	@Autowired
//	@Qualifier("csvFileLister")
//	IFileLister<File> fileLister;
	
//	@Test
//	public void fileListerTest() {
//		assertNotNull(fileLister.listFilesInFolder("C:\\Comactivity\\Movie"));
//	}
}
