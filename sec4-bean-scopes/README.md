# Section 4: Bean Scopes

There are two bean scopes covered in this section:
- Singleton
- Prototype

## Singleton Scope
- Bean instances in this scope are managed directly by the Spring context
- Each bean instance has a unique bean ID
- This is the default method
- Singleton beans are immutable
- Singleton beans allow for two types of instantiation:
    - Eager: the bean is instantiated when the context is initialized. This is the default method of instantiation.
    - Lazy: the bean is instantiated only when the bean is referred to. The @Lazy annotation is used for beans to be instantiated using the lazy method.
- These beans may face concurrency issues (race conditon).
## Prototype Scope
- Only the object types are managed by Spring
- A bean is instantiated every time the type is referred to
- Prototype beans are mutable.
- The @Scope(BeanDefinition.SCOPE_PROTOTYPE) annotation needs to be used to declare a Prototype bean
- No concurrency issues (race condition) is faced for these types of beans

