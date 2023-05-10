package aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
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
@Order(1)
public class SecurityAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Before("@annotation(SecurityLog)")
    public void log() throws Throwable {
        logger.info("Authentication successful!");
    }
}
