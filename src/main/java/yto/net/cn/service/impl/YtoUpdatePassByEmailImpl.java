package yto.net.cn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yto.net.cn.bean.YtoLogin;
import yto.net.cn.dao.YtoLoginDao;
import yto.net.cn.service.YtoUpdatePassByEmail;

@Service
public class YtoUpdatePassByEmailImpl implements YtoUpdatePassByEmail {

    @Autowired
    YtoLoginDao ytoLoginDao;

    @Override
    public YtoLogin updatePassByEmail(String password, String email) {
        return ytoLoginDao.updatePassByEmail(password,email);
    }
}
