package org.example.AOP.AlteringMethods.Order;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Component
@Aspect
@Order(1)
public class LoggingAspect {
    private Logger log = Logger.getLogger(LoggingAspect.class.getName());

    @Around("@annotation(org.example.AOP.AlteringMethods.Order.ToOrder)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();

        log.info("Deleting started by method: " + methodName);

        Object[] args = joinPoint.getArgs();
        log.info("Arguments passed: " + Arrays.asList(args));

        Object returnedValue = joinPoint.proceed();

        log.info("Method executed and returned value: " + returnedValue);
        log.info("Logging Aspect: Deleting ended");

        return returnedValue;
    }
}
