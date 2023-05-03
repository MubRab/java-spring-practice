package main;

import java.util.function.Supplier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.*;

public class Main {

	public static void main(String[] args) {
		/* Method 1:
		 * 
		 * the AnnotationConfigApplicationContext class is used to create a Spring context instance
		 * In this case we will use the ProjectConfigBean class to instantiate the instance.
		 * Note: the .class returns an object
		 * 
		 * In this method we will use the @Bean annotation to define a bean
		 * 
		 * The .getBean function will be used to get a reference to type Bird from the Spring context
		 * in the case where there are multiple beans with the same object type, we have to specify the
		 * name of the instance before we get the object.
		 */
		var springContext = new AnnotationConfigApplicationContext(ProjectConfigBean.class);
		Bird b = springContext.getBean("bird", Bird.class);
		System.out.println(b.getName());
		
		/* Method 2:
		 * 
		 * In this method we will use stereotype annotations to add the beans to Spring.
		 * 
		 * This reduces the code base, since the ProjectConfigStereotype will not need any methods
		 * to define the beans.
		 * 
		 * Since, we do not explicitly define a bean, in this case the name field will be null,
		 * in order to set the name, we can use the @PostConstruct annotation.
		 */
		springContext = new AnnotationConfigApplicationContext(ProjectConfigStereotype.class);
		Cat c = springContext.getBean(Cat.class);
		System.out.println(c.getName());
		
		/* Method 3:
		 * 
		 * In this method we can add beans programmatically
		 */
		
		Dog dog = new Dog();
		dog.setName("Husky");
		// The supplier will return an instance of the object
		Supplier<Dog> dogSupplier = () -> dog;
		// This will add the instance to the Spring context
		springContext.registerBean("dog", Dog.class, dogSupplier);
		
		Dog d = springContext.getBean("dog", Dog.class);
		System.out.println(d.getName());
		

	}

}
