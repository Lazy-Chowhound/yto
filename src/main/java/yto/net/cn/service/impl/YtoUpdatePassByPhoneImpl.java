package yto.net.cn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yto.net.cn.bean.YtoLogin;
import yto.net.cn.dao.YtoLoginDao;
import yto.net.cn.service.YtoUpdatePassByPhone;

@Service
public class YtoUpdatePassByPhoneImpl implements YtoUpdatePassByPhone {

    @Autowired
    YtoLoginDao ytoLoginDao;

    @Override
    public YtoLogin updatePassByPhone(String password, String phone) {
        return ytoLoginDao.updatePassByPhone(password,phone);
    }
}
