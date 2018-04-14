package main.java.movie.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages= {"main.java"})
@EnableTransactionManagement
//@PropertySource(value= {"classpath:DB_Config.properties"})
//@ImportResource(value= {"classpath:Database.xml"})
public class TestConfig {

}
	
