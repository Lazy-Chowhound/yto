package yto.net.cn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yto.net.cn.dao.YtoLoginDao;
import yto.net.cn.service.YtoUpdateEmailByPhonePassService;

@Service
public class YtoUpdateEmailByPhonePassImpl implements YtoUpdateEmailByPhonePassService {

    @Autowired
    private YtoLoginDao ytoLoginDao;

    @Override
    public int updateEmailPhonePass(String email, String phone, String password) {
        return ytoLoginDao.updateEmailByPhonePass(email, phone, password);
    }
}
