package org.example;



import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Aspect
@Component
public class NotEmptyAspect {

    @Around("@annotation(NotEmpty)")
    public Object checkNotEmpty(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            if (arg == null) {
                System.out.println("Argument is null");
            }
            if (arg instanceof String && ((String) arg).isEmpty()) {
                System.out.println("String is null");
            }
            if (arg instanceof Collection && ((Collection<?>) arg).isEmpty()) {
                System.out.println("Collection is empty");
            }
        }
        return joinPoint.proceed();
    }
}