package yto.net.cn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yto.net.cn.bean.YtoLogin;
import yto.net.cn.dao.YtoLoginDao;
import yto.net.cn.service.YtoUpdatePhoneByEmailPass;

@Service
public class YtoUpdatePhoneByEmailPassImpl implements YtoUpdatePhoneByEmailPass {

    @Autowired
    YtoLoginDao ytoLoginDao;

    @Override
    public YtoLogin updatePhoneByEmailPass(String phone, String email, String password) {
        return ytoLoginDao.updatePhoneByEmailPass(phone, email, password);
    }
}
