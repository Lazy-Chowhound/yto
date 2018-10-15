package yto.net.cn.service;

import yto.net.cn.bean.YtoLogin;

public interface YtoUpdateEmailByPhonePass {
    /**
     * 根据邮箱和密码修改手机号
     *
     * @param email
     * @param phone
     * @param password
     * @return
     */
    YtoLogin updateEmailPhonePass(String email, String phone, String password);
}
