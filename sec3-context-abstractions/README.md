# Section 3: Using interfaces

In this example exercise, we will use interfaces, which allows for the decoupling of implementations.

In this example we also learn that if Spring, has more than one bean which can be injected into another component, then we can the @Qualifier("<label>") annotation. This can be seen in the two proxy classes implemented (Email and Push).

Furthermore, we can also replace the @Component annotation with more descriptive annotations. For components that perform some type of service we can use the @Service annotation, and for components that perform some type of repository type of action we can use the @Repository annotation.
