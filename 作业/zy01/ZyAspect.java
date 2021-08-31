package zy01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class ZyAspect {
    public void insertZy(){
        System.out.println("插播广告");
    }
    public void vipZy(){
        System.out.println("亲，办理会员可以看vip视频..");
    }

    public void roundZy(ProceedingJoinPoint pj){
        //我是上面的
        System.out.println("请验证");
        //目标方法
        try {
            Object proceed = pj.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        //我是下面的
        System.out.println("转金币成功");
    }
    public void sendZyError(JoinPoint joinPoint, Exception e){
        System.out.println("视频已失踪,推荐您看其他类型的视频");
    }
    public void finalZy(){
        System.out.println("给管理员发送了异常通知");
    }
}
