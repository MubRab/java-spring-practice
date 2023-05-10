package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"service", "aspects"})
@EnableAspectJAutoProxy //this will enable the aspect mechanism for this context
public class AppConfig {
}
