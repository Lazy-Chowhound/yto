package yto.net.cn.service;

import yto.net.cn.bean.YtoLogin;

public interface YtoUpdateNameByPhone {
    /**
     * 根据手机号修改用户名
     *
     * @param name
     * @param phone
     * @return
     */
    YtoLogin updateNameByPhone(String name, String phone);
}
