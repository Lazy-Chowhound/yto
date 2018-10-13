package test.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import yto.net.cn.service.YtoLoginService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml" })
public class YtoLoginServiceTest {

    @Autowired
    private YtoLoginService ytoLoginService;

    @Test
    public void testLogin(){
        System.out.println(ytoLoginService.login("123456" , "123456"));
    }


}
