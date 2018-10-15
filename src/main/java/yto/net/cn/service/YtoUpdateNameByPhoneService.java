package yto.net.cn.service;

import yto.net.cn.bean.YtoLogin;

public interface YtoUpdateNameByPhoneService {
    /**
     * 根据手机号修改用户名
     *
     * @param name
     * @param phone
     * @return
     */
    int updateNameByPhone(String name, String phone);
}
