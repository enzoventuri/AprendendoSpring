package org.example.AOP.AlteringMethods.Order;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Aspect
@Order(2)
public class SecurityAspect {
    private Logger log = Logger.getLogger(SecurityAspect.class.getName());

    @Around("@annotation(org.example.AOP.AlteringMethods.Order.ToOrder)")
    public Object security(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("Security checks by method: " + SecurityAspect.class.getMethod("security", ProceedingJoinPoint.class).getName());

        log.info("All secure, delegating to next method:");

        Object returnedMethod = joinPoint.proceed();
        log.info("Security checks ended, Returned: " + returnedMethod);

        return returnedMethod;
    }
}
