package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 * The @Aspect annotation will declare this class as an aspect
 * but, it will not create a bean, you still have to do that separately
 * either using the @Bean method or stereotypes.
 *
 * The @Order annotation will set the order in which the aspect is executed, if
 * there are more than one.
 */
@Aspect
@Component
@Order(2)
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* service.*.*(..))")
    public Object log(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        // this will get the method name of the intercepted method
        String methodName = proceedingJoinPoint.getSignature().getName();
        //this will get the arguments passed to the intercepted method
        Object [] args = proceedingJoinPoint.getArgs();

        logger.info("Executing intercepted Method: " + methodName +
                " with parameters passed: " + Arrays.asList(args));

        //this will call the intercepted method and will store the returned value
        Object returnValByMethod = proceedingJoinPoint.proceed();

        logger.info("Value returned by intercepted method: " + returnValByMethod);

        return returnValByMethod;
    }
}
