package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*
         * In this method we will use the @Autowired annotation with
         * the bean and stereotype method combined.
         */
        var stereotypeConfig = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person p = stereotypeConfig.getBean(Person.class);
        System.out.println(p.toString());
    }
}
