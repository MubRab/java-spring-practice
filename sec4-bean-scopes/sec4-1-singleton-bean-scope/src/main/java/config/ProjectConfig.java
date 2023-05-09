package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import services.CommentService;

@Configuration
public class ProjectConfig {

    /**
     * commentService1 uses the eager approach.
     */
    @Bean
    public CommentService commentService1() {
        System.out.println("Creating commentService1 instance in Spring context...");
        return new CommentService();
    }

    /**
     * commentService2 uses the lazy approach.
     */
    @Bean
    @Lazy
    public CommentService commentService2() {
        System.out.println("Creating commentService2 instance in Spring context...");
        return new CommentService();
    }
}
