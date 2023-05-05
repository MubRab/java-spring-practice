package config;

import main.Bird;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//This annotation will tell us where to find the classes to create an instance.
@ComponentScan(basePackages="main")
public class ProjectConfig {
    /*
     * We will use beans to instantiate birds, and then we will use the stereotype method to instantiate
     * the person object.
     */
    @Bean
    public Bird bird1() {
        Bird b = new Bird();
        b.setName("Parrot");
        return b;
    }

    @Bean
    public Bird bird2() {
        Bird b = new Bird();
        b.setName("Swallow");
        return b;
    }

}
