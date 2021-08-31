package zy02;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:zy02/applicationContext.xml")
public class TvTest {
    @Autowired
    private TvService tvService;
    @Test
    public void test01(){
        tvService.bofang();
        System.out.println("===========");
        tvService.zanting();
        System.out.println("==========");
        tvService.transMoney();
        System.out.println("===========");
        tvService.findNo();
    }


}
