package test.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import yto.net.cn.service.YtoSearchByOpenIdService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml" })
public class YtoSearchByOpenIdServiceTest {

    @Autowired
    YtoSearchByOpenIdService ytoSearchByOpenId;

    @Test
    public void testSearchByOpenId(){
        System.out.println(ytoSearchByOpenId.searchByOpenId("123"));
    }
}
