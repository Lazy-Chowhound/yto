package yto.net.cn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yto.net.cn.bean.YtoLogin;
import yto.net.cn.dao.YtoLoginDao;
import yto.net.cn.service.YtoUpdateNameByPhone;

@Service
public class YtoUpdateNameByPhoneImpl implements YtoUpdateNameByPhone {

    @Autowired
    YtoLoginDao ytoLoginDao;

    @Override
    public YtoLogin updateNameByPhone(String name, String phone) {
        return ytoLoginDao.updateNameByPhone(name, phone);
    }
}
