package yto.net.cn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yto.net.cn.bean.YtoLogin;
import yto.net.cn.dao.YtoLoginDao;
import yto.net.cn.service.YtoSearchByEmailPassService;

@Service
public class YtoSearchByEmailPassImpl implements YtoSearchByEmailPassService {

    @Autowired
    private YtoLoginDao ytoLoginDao;

    @Override
    public YtoLogin searchByEmailPass(String email, String password) {
        return ytoLoginDao.searchByEmailPass(email,password);
    }
}
