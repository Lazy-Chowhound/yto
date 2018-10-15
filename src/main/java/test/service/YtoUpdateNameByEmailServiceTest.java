package test.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import yto.net.cn.service.YtoUpdateNameByEmailService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml" })
public class YtoUpdateNameByEmailServiceTest {
    @Autowired
    YtoUpdateNameByEmailService ytoUpdateNameByEmailService;

    @Test
    public void testYtoUpdateNameByEmail(){
        System.out.println(ytoUpdateNameByEmailService.updateNameByEmail("1234","1234"));
    }
}
