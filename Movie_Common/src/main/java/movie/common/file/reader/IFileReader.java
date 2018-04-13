package main.java.movie.common.file.reader;

public interface IFileReader <In, Out>{

	Out readFile(In in);
}
