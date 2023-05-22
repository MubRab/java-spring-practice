# Section 6: Static Web Page Using Spring Boot
To create a Spring Boot project, we us the Spring Boot project initialization service: http://start.spring.io. We then add the Spring Web dependency.

To create a basic (static) web page:

1. We create an HTML file, with static content.
2. We create a controller class, which contains methods that are executed based on the type of HTTP request and returns an appropriate response. The controller class is annotated with the @Controller annotation.

In this exercise, we want to only display a web page, so we will write a method which will return an HTML file, and we will annotate the method with @RequestMapping("/"), where the parameter value passed will be the path to obtaining the web page.

When we execute the web app, we can visit http://localhost:8080/ to view the web page.