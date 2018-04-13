package main.java.movie.common.file.lister;

import java.util.List;

public interface IFileLister <FileType>{

	List<FileType> listFilesInFolder(String folderPath);
}
