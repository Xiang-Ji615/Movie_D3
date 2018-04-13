package main.java.movie.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages= {"main.java"})
@PropertySource(value= {"classpath:DB_Config.properties"})
@ImportResource(value= {"classpath:Database.xml"})
public class TestConfig {

}
	
