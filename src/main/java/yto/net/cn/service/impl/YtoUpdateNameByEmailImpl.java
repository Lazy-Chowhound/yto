package yto.net.cn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yto.net.cn.dao.YtoLoginDao;
import yto.net.cn.service.YtoUpdateNameByEmailService;

@Service
public class YtoUpdateNameByEmailImpl implements YtoUpdateNameByEmailService {

    @Autowired
    YtoLoginDao ytoLoginDao;

    @Override
    public int updateNameByEmail(String name, String email) {
        return ytoLoginDao.updateNameByEmail(name, email);
    }
}
