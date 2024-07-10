package org.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Aspect
@Component
public class NotEmptyAspect {

    public void checkEmpty(JoinPoint joinPoint) throws Exception {
        Object[] arguments = joinPoint.getArgs();
        for (Object arg: arguments){
            if (arg == null)
                throw new Exception("Argument is null");
            if (arg instanceof String && ((String) arg).isEmpty())
                throw new Exception("String is empty");
            if (arg instanceof Collection && ((Collection<?>) arg).isEmpty())
                throw new Exception("Collection is empty");

        }
    }
}
