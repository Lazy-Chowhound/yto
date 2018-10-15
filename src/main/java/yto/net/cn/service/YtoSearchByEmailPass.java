package yto.net.cn.service;

import yto.net.cn.bean.YtoLogin;

public interface YtoSearchByEmailPass {
    /**
     * 根据邮箱和密码查询
     *
     * @param email
     * @param password
     * @return
     */
    YtoLogin searchByEmailPass(String email, String password);
}
