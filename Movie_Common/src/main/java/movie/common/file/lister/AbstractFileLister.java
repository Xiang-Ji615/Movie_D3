package main.java.movie.common.file.lister;

import org.apache.commons.io.FilenameUtils;

public abstract class AbstractFileLister {

	protected String fileExtension = "csv";
	
	protected String getFileExtension(String path) {
		return FilenameUtils.getExtension(path);
	}
}
