package hello.hellospring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
//AOP

@Component
public class TimeTraceAOP {


    @Around("execution(* hello.hellospring..*(..))")
    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable {
        Long start = System.currentTimeMillis();
        System.out.println("START = " + joinPoint.toLongString());
        try {
            return joinPoint.proceed();
        } finally {
            Long finish = System.currentTimeMillis();
            long timeMs = finish - start;
            System.out.println("END = " + joinPoint.toLongString() + " " + timeMs + "ms");
        }
    }
}
