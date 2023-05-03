package main;

import javax.annotation.PostConstruct;

// The @Component annotation will add an instance of this class to the Spring context
import org.springframework.stereotype.Component;

@Component
public class Cat {
	private String name;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	/*
	 * This annotation will ensure that after the spring context defines the bean,
	 * the init() function will be executed and the name will be set.
	 * In order to use the annotation, we also need to add the javax.annotation
	 * dependency in the pom.xml file.
	 */
	@PostConstruct
	public void init() {
		this.name = "Siberian";
	}
}
