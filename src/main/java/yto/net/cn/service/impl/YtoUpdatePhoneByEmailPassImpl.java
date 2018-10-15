package yto.net.cn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yto.net.cn.dao.YtoLoginDao;
import yto.net.cn.service.YtoUpdatePhoneByEmailPassService;

@Service
public class YtoUpdatePhoneByEmailPassImpl implements YtoUpdatePhoneByEmailPassService {

    @Autowired
    YtoLoginDao ytoLoginDao;

    @Override
    public int updatePhoneByEmailPass(String phone, String email, String password) {
        return ytoLoginDao.updatePhoneByEmailPass(phone, email, password);
    }
}
