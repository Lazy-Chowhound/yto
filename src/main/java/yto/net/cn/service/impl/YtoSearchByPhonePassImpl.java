package yto.net.cn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yto.net.cn.bean.YtoLogin;
import yto.net.cn.dao.YtoLoginDao;
import yto.net.cn.service.YtoSearchByPhonePassService;

@Service
public class YtoSearchByPhonePassImpl implements YtoSearchByPhonePassService {

    @Autowired
    private YtoLoginDao ytoLoginDao;

    @Override
    public YtoLogin searchByPhonePass(String phone, String password) {
        return ytoLoginDao.searchByPhonePass(phone,password);
    }
}
