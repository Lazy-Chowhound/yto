package test.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import yto.net.cn.dao.YtoLoginDao;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class YtoSearchByPhonePassTest {
    @Autowired
    YtoLoginDao ytoLoginDao;

    @Test
    public void testSearchByPhonePass(){
        System.out.println(ytoLoginDao.searchByEmailPass("1234","12345"));
    }
}
