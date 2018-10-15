package test.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import yto.net.cn.service.YtoSearchByPhonePassService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml" })
public class YtoSearchByPhonePassServiceTest {
    @Autowired
    YtoSearchByPhonePassService ytoSearchByPhonePass;

    @Test
    public void testSearchByPhonePass(){
        System.out.println(ytoSearchByPhonePass.searchByPhonePass("123456","123456"));
    }
}
