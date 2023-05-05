package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//This annotation will tell us where to find the classes to create an instance.
@ComponentScan(basePackages="main")
public class ProjectConfigStereotype {

}
