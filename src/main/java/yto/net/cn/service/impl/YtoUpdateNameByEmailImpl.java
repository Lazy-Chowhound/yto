package yto.net.cn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yto.net.cn.bean.YtoLogin;
import yto.net.cn.dao.YtoLoginDao;
import yto.net.cn.service.YtoUpdateNameByEmail;

@Service
public class YtoUpdateNameByEmailImpl implements YtoUpdateNameByEmail {

    @Autowired
    YtoLoginDao ytoLoginDao;

    @Override
    public YtoLogin updateNameByEmail(String name, String email) {
        return ytoLoginDao.updateNameByEmail(name, email);
    }
}
