package yto.net.cn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yto.net.cn.bean.YtoLogin;
import yto.net.cn.dao.YtoLoginDao;

@Service
public class YtoSearchByEmailPassImpl implements yto.net.cn.service.YtoSearchByEmailPass {

    @Autowired
    private YtoLoginDao ytoLoginDao;

    @Override
    public YtoLogin searchByEmailPass(String email, String password) {
        return ytoLoginDao.searchByEmailPass(email,password);
    }
}
