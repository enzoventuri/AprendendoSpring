package org.example.AOP.AlteringMethods.AfterAltering;

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

    @Around("execution(* org.example.AOP.AlteringMethods.AfterAltering.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();

        log.info("Method: " + methodName + " with parameters: " + Arrays.toString(args) + " will execute");

        Cliente cliente = new Cliente("Enzo2", "09876543211");
        Object[] newArgs = {cliente};

        Object returnedByMethod = joinPoint.proceed(newArgs);

        log.info("Method executed and returned " + returnedByMethod);

        return "FAILED";
    }

}
