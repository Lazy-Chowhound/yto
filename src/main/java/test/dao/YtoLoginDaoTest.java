package test.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import yto.net.cn.bean.YtoLogin;
import yto.net.cn.dao.YtoLoginDao;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class YtoLoginDaoTest {

    @Autowired
    private YtoLoginDao ytoLoginDao;

    @Test
    public void testLogin(){
        System.out.println(ytoLoginDao.selectByPhonePass("123456" , "123456"));
    }

}
