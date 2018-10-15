package test.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import yto.net.cn.service.YtoSearchByEmailPass;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml" })
public class YtoSearchByEmailPassTest {

    @Autowired
    private YtoSearchByEmailPass ytoSearchByEmailPass;

    @Test
    public void testsearchByEmailPass(){
        System.out.println(ytoSearchByEmailPass.searchByEmailPass("1","123456"));
    }
}
