package main.java.movie.dao.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan(basePackages = { "main.java" })
@PropertySource(value = { "classpath:DB_Config.properties"})
@ImportResource(value= {"classpath:Database.xml"})
public class App implements CommandLineRunner {
	
	@Value("${jdbc.movie.url}")
	String test;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}
