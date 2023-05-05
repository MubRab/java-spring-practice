package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import config.*;

public class Main {

	public static void main(String[] args) {
		/* Method 1
		 * 
		 * To wire the two beans, we will use the @Bean annotation
		 * and perform a dependency injection (DI)
		 */
		var beanContext = new AnnotationConfigApplicationContext(ProjectConfigBean.class);
		Person person = beanContext.getBean(Person.class);
		System.out.println(person.toString());

		
	}

}
