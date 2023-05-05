package main;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Bird {
	private String name;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
