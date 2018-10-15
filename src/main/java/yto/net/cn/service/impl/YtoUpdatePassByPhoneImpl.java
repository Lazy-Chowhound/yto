package yto.net.cn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yto.net.cn.dao.YtoLoginDao;
import yto.net.cn.service.YtoUpdatePassByPhoneService;

@Service
public class YtoUpdatePassByPhoneImpl implements YtoUpdatePassByPhoneService {

    @Autowired
    YtoLoginDao ytoLoginDao;

    @Override
    public int updatePassByPhone(String password, String phone) {
        return ytoLoginDao.updatePassByPhone(password,phone);
    }
}
