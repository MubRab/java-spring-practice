# Section 5: Aspects
An aspect is an object that intercepts an execution of a function before/after it is executed.

Aspects allow for code to be decoupled and allows for the main logic code to be seperated from any miscellaneous tasks.


To use aspects:
1. The @Aspect annotation is used to annotate an aspect class and is found in the spring-aspects dependency. 
2. A bean of the class should also be instantiated (using either stereotype annotations or @Bean annotation).
3. The aspect method that will intercept a method should be annotated with an advice, i.e., when the method should be intercepted. Such as @Before or @Around with AspectJ pointcut expressions, or custom annotations, as parameters.
4. When using multiple aspects to intercept a common method, the @Order annotation can be used to order the execution of the aspects.