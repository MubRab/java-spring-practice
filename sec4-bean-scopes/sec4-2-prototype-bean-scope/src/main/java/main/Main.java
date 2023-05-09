/**
 * In this example exercise we will use the Prototype scope to define the beans.
 *
 * Every attempt to refer to a bean, instantiates a new bean object
 */

package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        /**
         * Notice that only an attempt to refer to the bean instantiates the object/bean.
         */

        System.out.println("Creating Spring context instance...");
        var springConfig = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println();

        System.out.println("Calling getBean() to get the reference to CommentService object in the Spring context");
        CommentService cs1 = springConfig.getBean("commentService", CommentService.class);
        System.out.println();

        System.out.println("Calling getBean() to get the reference to CommentService object in the Spring context");
        CommentService cs2 = springConfig.getBean("commentService", CommentService.class);
        System.out.println();

        System.out.println("Beans created: " + ProjectConfig.getBeanCounter());
        System.out.println("Is cs1 == cs2: " + (cs1==cs2));
    }
}
