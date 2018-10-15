package yto.net.cn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yto.net.cn.dao.YtoLoginDao;
import yto.net.cn.service.YtoUpdateNameByPhoneService;

@Service
public class YtoUpdateNameByPhoneImpl implements YtoUpdateNameByPhoneService {

    @Autowired
    YtoLoginDao ytoLoginDao;

    @Override
    public int updateNameByPhone(String name, String phone) {
        return ytoLoginDao.updateNameByPhone(name, phone);
    }
}
