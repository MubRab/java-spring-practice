/*
 * This class instructs the Spring framework to do certain actions
 * This class is annotated with @Configuration
 * In this exercise, we will use this class to create beans (object instances).
 */

package config;

import main.*;

//in order to use the @Bean annotation, we need to import it
import org.springframework.context.annotation.Bean;
//in order to use the @Configuration annotation, we need to import it
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfigBean {
	
	@Bean
	Bird bird() {
		Bird b = new Bird();
		b.setName("Swallow bird");
		return b;		
	}
	
	
	/*
	 * When creating an instance of this object, Spring will use the existing
	 * bird object and will "inject" it into the person object (also known as
	 * dependency injection)
	 * 
	 * Note: Spring will not create a new bird object, but will rather use
	 * an existing object.
	 */
	@Bean
	Person person(Bird bird) {
		Person p = new Person();
		p.setName("John");
		p.setBird(bird);
		return p;
	}
	
	
}
