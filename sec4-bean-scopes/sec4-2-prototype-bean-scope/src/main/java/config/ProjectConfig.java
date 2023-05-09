package config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import services.CommentService;

@Configuration
public class ProjectConfig {

    private static int beanCounter = 0;

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public CommentService commentService() {
        System.out.println("Creating commentService instance in Spring context...");
        ProjectConfig.beanCounter++;
        return new CommentService();
    }

    public static int getBeanCounter() {
        return ProjectConfig.beanCounter;
    }
}
