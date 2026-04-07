package org.example.AOP.AlteringMethods;

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

    @Around("execution(* org.example.AOP.AlteringMethods.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();

        log.info("Method: " + methodName + " with parameters: " + Arrays.toString(args) + " will execute");

        Object returnedByMethod = joinPoint.proceed(args);

        log.info("Method executed and returned " + returnedByMethod);

        return returnedByMethod;
    }

}
