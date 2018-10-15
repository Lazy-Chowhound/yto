package yto.net.cn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yto.net.cn.bean.YtoLogin;
import yto.net.cn.dao.YtoLoginDao;
import yto.net.cn.service.YtoUpdateHeaderUrlById;

@Service
public class YtoUpdateHeaderUrlByIdImpl implements YtoUpdateHeaderUrlById {

    @Autowired
    YtoLoginDao ytoLoginDao;

    @Override
    public YtoLogin updateHeaderUrlById(String header_url, int id) {
        return ytoLoginDao.updateHeaderUrlById(header_url, id);
    }
}
