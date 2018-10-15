package yto.net.cn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yto.net.cn.dao.YtoLoginDao;
import yto.net.cn.service.YtoUpdateHeaderUrlByIdService;

@Service
public class YtoUpdateHeaderUrlByIdImpl implements YtoUpdateHeaderUrlByIdService {

    @Autowired
    YtoLoginDao ytoLoginDao;

    @Override
    public int updateHeaderUrlById(String header_url, int id) {
        return ytoLoginDao.updateHeaderUrlById(header_url, id);
    }
}
