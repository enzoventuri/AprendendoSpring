package org.example.AOP.Simple.After;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Aspect
public class LoggingAspect {
//    aspect = logic, when someone calls a specific method (pointcut)
//    advice = when the logic (aspect) is executed according to the pointcut
//    target object = To intercept the method, Spring needs to know which bean has
//    the intercepted method
//    join point = specific point in the execution where the advice can be plugged in

    private Logger log = Logger.getLogger(LoggingAspect.class.getName());

    // ORDEM CRONOLOGICA (ver pagina 138 no online e 133 no fisico)
    // * = Metodo interceptado pode ter qualquer valor retornado
    // pacote = Indica qual pacote esta o metodo interceptado
    // * = Metodo interceptado pode estar em qualquer classe
    // * = Metodo interceptado pode ter qualquer nome
    // (..) = Metodo interceptado pode ter ou nao ter parametros

    @Around("execution(* org.example.AOP.Simple.After.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable{
        log.info("Antes de iniciar o metodo");
        joinPoint.proceed();
        log.info("Depois de iniciar o metodo");
    }
}
