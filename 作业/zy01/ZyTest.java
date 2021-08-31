package zy01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ZyTest {
    @Test
    public void tets01(){
        String xml="zy01/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        ZyService zyService = ac.getBean("zyService", ZyService.class);
        zyService.bofang();
        System.out.println("====================");
        zyService.zanting();
        System.out.println("====================");
        zyService.transMoney();
        System.out.println("====================");
        zyService.findNo();
    }
}
