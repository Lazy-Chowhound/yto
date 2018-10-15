package yto.net.cn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yto.net.cn.dao.YtoLoginDao;
import yto.net.cn.service.YtoUpdatePassByEmailService;

@Service
public class YtoUpdatePassByEmailImpl implements YtoUpdatePassByEmailService {

    @Autowired
    YtoLoginDao ytoLoginDao;

    @Override
    public int updatePassByEmail(String password, String email) {
        return ytoLoginDao.updatePassByEmail(password,email);
    }
}
