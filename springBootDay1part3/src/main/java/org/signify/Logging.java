package org.signify;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logging {
    @Pointcut("execution(* com.signify.*.*(..))")
    private void selectAll(){}

    @Pointcut("execution(* com.signify.*.get*(..))")
    private void getters(){}

    @Before("selectAll()")
    public void beforeAdvice(JoinPoint joinPoint){
        System.out.print("Executing the method: ");
        System.out.println(joinPoint.getSignature());
    }

    @After("selectAll()")
    public void afterAdvice(){
        System.out.println("Method Executed successfully");
    }

    @AfterReturning(pointcut = "getters()", returning = "retVal")
    public void afterReturningAdvice(Object retVal){
        System.out.println("Returning:" + retVal.toString());
    }

}
