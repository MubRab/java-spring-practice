/**
 * In this example exercise we will use the Singleton scope to define the beans.
 *
 * Each bean that is defined is a singleton, and only a single object is instantiated with the unique BeanID.
 * However, multiple beans of the same class can be instantiated as a singleton, as long as the BeanID is unique.
 *
 * There are two singleton approaches:
 *  - Eager: which is the default approach
 *  - Lazy: which is when the @Lazy annotation is used when instantiating a bean,
 *
 * The eager approach instantiates the beans when the Spring context is instantiated, and the lazy approach
 * instantiates beans only when the bean is referred to.
 */

package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        /**
         * Notice that when the context is created, it also instantiates commentService1, but
         * commentService2 is only instantiated when the program attempts to get the reference to it.
         */

        System.out.println("Creating Spring context instance...");
        var springConfig = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println();

        System.out.println("Calling getBean() to get the reference to commentService1 object in the Spring context");
        CommentService cs1 = springConfig.getBean("commentService1", CommentService.class);
        System.out.println();

        System.out.println("Calling getBean() to get the reference to commentService2 object in the Spring context");
        CommentService cs2 = springConfig.getBean("commentService2", CommentService.class);
        System.out.println();
    }
}
