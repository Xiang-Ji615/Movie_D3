package main.java.movie.common.file.reader;

import java.io.IOException;

public interface IFileReader <In, Out>{

	Out readFile(In in) throws IOException;
}
