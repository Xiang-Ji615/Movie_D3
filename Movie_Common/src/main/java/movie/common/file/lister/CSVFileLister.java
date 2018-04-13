package main.java.movie.common.file.lister;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component(value="csvFileLister")
public class CSVFileLister extends AbstractFileLister implements IFileLister<File> {

	@Override
	public List<File> listFilesInFolder(String folderPath) {
		File folder = new File(folderPath);
		File[] listOfFiles = folder.listFiles();
		List<File> ret = new ArrayList<>();
		if (listOfFiles != null) {
			if (listOfFiles.length > 0) {
				for (int i = 0; i < listOfFiles.length; i++) {
					if (listOfFiles[i].isFile() && getFileExtension(listOfFiles[i].getName()).equals("csv")) {
						ret.add(listOfFiles[i]);
					}
				}
			}
		}
		return ret;
	}

}
