package yto.net.cn.service;

import yto.net.cn.bean.YtoLogin;

public interface YtoUpdatePhoneByEmailPass {
    /**
     * 根据邮箱和密码修改手机号
     *
     * @param phone
     * @param email
     * @param password
     * @return
     */
    YtoLogin updatePhoneByEmailPass(String phone, String email, String password);
}
