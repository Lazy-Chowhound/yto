package yto.net.cn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yto.net.cn.bean.YtoLogin;
import yto.net.cn.dao.YtoLoginDao;
import yto.net.cn.service.YtoUpdateEmailByPhonePass;

@Service
public class YtoUpdateEmailByPhonePassImpl implements YtoUpdateEmailByPhonePass {

    @Autowired
    private YtoLoginDao ytoLoginDao;

    @Override
    public YtoLogin updateEmailPhonePass(String email, String phone, String password) {
        return ytoLoginDao.updateEmailByPhonePass(email, phone, password);
    }
}
