package com.cui.firstdemo.component;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author cui
 * @since 创建时间：2019/6/22 17:58
 * 切面
 */
@Component
@Aspect
public class LogAspect {
    /**
     * 切入点（pointCut）
     */
    @Pointcut("execution(* com.cui.firstdemo.service.*.*(..))")
    public void pc1() {
    }

    /**
     * @param joinPoint   连接点
     * 前置通知
     */
    @Before(value = "pc1()")
    public void before(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "方法开始执行.....");
    }

    /**
     * 后置通知
     * @param joinPoint
     */
    @After(value = "pc1()")
    public void after(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "方法执行结束....");
    }

    /**
     * 最终通知
     * @param joinPoint
     * @param result
     */
    @AfterReturning(value = "pc1()", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "方法返回值为: " + result);
    }

    @AfterThrowing(value = "pc1()", throwing = "e")
    public void afterThrowing(JoinPoint joinPoint, Exception e) {
        String name = joinPoint.getSignature().getName();
        System.out.println(name + "方法抛出了异常，异常是：" + e.getMessage());
    }

    /**
     * 环绕通知
     * @param proceedingJoinPoint
     * @return
     * @throws Throwable
     */
    @Around("pc1()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        return proceedingJoinPoint.proceed();
    }
}
