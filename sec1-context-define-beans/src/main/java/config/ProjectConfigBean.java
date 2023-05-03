/*
 * This class instructs the Spring framework to do certain actions
 * This class is annotated with @Configuration
 * In this exercise, we will use this class to create beans (object instances).
 */

package config;

import main.Bird;

//in order to use the @Bean annotation, we need to import it
import org.springframework.context.annotation.Bean;
//in order to use the @Configuration annotation, we need to import it
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfigBean {
	
	@Bean
	Bird bird() {
		Bird b = new Bird();
		b.setName("Swallow");
		return b;		
	}
	
	
}
