package zy02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("tvAspect")
@Aspect
public class TvAspect {
    @Pointcut("execution ( * zy02.*.bofang*(..))")
    public void bofangpt(){
        System.out.println("切入点表达式");
    }
    @Pointcut("execution ( * zy02.*.zanting*(..))")
    public void zantingpt(){
        System.out.println("切入点表达式");
    }
    @Pointcut("execution ( * zy02.*.transMoney*(..))")
    public void transpc(){
        System.out.println("切入点表达式");
    }
    @Pointcut("execution ( * zy02.*.findNo*(..))")
    public void findpc(){
        System.out.println("切入点表达式");
    }

    @Before("bofangpt()")
    public void beforeMsg(){
        System.out.println("插播广告...");
    }
    @AfterReturning("zantingpt()")
    public void afterMsg(){
        System.out.println("亲，办理会员可以看vip...");
    }
    @Around("transpc()")
    public void aroundMsg(ProceedingJoinPoint joinPoint){
        System.out.println("请先验证");
        try {
            Object proceed = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.out.println("转账成功");
    }

    @AfterThrowing(value = "findpc()",throwing = "e")
    public void throwing(JoinPoint joinPoint, Exception e){
        System.out.println("视频已失踪,推荐您看其他类型的视频"+e.getMessage());
    }
    @After("findpc()")
    public void afterFinal(){
        System.out.println("给管理员发送了异常通知");
    }
}
