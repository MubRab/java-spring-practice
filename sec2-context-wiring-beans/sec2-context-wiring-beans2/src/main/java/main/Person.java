package main;

import javax.annotation.PostConstruct;

//The @Component annotation will add an instance of this class to the Spring context
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
	private String name;

	private Bird bird;

	/*
	 * This annotation will instruct Spring to use the bean
	 * from the context and pass it as an argument to the constructor.
	 *
	 * This annotation can also be used for setter methods.
	 *
	 * We also used a @Qualifier annotation, this explicitly tells Spring
	 * which bird object to use.
	 */
	@Autowired
	public Person(@Qualifier("bird2") Bird bird) {
		this.bird = bird;
	}
	
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

	@PostConstruct
	public void init() {
		this.name = "Jane";
	}



}
