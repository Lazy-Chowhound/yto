package yto.net.cn.service;

import yto.net.cn.bean.YtoLogin;

public interface YtoUpdatePassByPhone {
    /**
     * 根据手机号修改密码
     *
     * @param password
     * @param phone
     * @return
     */
    YtoLogin updatePassByPhone(String password, String phone);
}
