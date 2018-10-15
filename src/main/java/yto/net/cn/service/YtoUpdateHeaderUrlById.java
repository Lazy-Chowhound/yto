package yto.net.cn.service;

import yto.net.cn.bean.YtoLogin;

public interface YtoUpdateHeaderUrlById {
    /**
     * 根据id修改头像url
     *
     * @param header_url
     * @param id
     * @return
     */
    YtoLogin updateHeaderUrlById(String header_url, int id);
}
