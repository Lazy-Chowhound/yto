package yto.net.cn.service;

import yto.net.cn.bean.YtoLogin;

public interface YtoUpdateNameByEmail {
    /**
     * 根据邮箱修改用户名
     *
     * @param name
     * @param email
     * @return
     */
    YtoLogin updateNameByEmail(String name, String email);
}
