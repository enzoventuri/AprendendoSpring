package org.example.AOP.AlteringMethods.CustomAnnotations;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Component
@Aspect
public class LoggingAspect {
    private Logger log = Logger.getLogger(LoggingAspect.class.getName());

    @Around("@annotation(ToLog)")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();

        log.info("Deleting started by method: " + methodName);

        Object[] args = joinPoint.getArgs();
        log.info("Arguments passed: " + Arrays.asList(args));

        Object returnedValue = joinPoint.proceed();

        log.info("Method executed and returned value: " + returnedValue);
        log.info("Deleting ended");

        return returnedValue;
    }
}
