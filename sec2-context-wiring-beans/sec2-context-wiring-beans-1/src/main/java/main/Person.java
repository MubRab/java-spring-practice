package main;

import javax.annotation.PostConstruct;

//The @Component annotation will add an instance of this class to the Spring context
import org.springframework.stereotype.Component;

@Component
public class Person {
	private String name;
	private Bird bird;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Bird getBird() {
		return this.bird;
	}
	
	public void setBird(Bird bird) {
		this.bird = bird;
	}

	@Override
	public String toString() {
		return this.name + " has a " + this.bird.getName();
	}

}
