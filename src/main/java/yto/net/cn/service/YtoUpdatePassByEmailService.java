package yto.net.cn.service;

import yto.net.cn.bean.YtoLogin;

public interface YtoUpdatePassByEmailService {
    /**
     * 根据邮箱修改密码
     *
     * @param password
     * @param email
     * @return
     */
    int updatePassByEmail(String password, String email);
}
