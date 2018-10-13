package yto.net.cn.service;

import yto.net.cn.bean.YtoLogin;

public interface YtoLoginService {

    /**
     * 根据电话号码和密码登陆
     * @param phone
     * @param password
     * @return
     */
    YtoLogin login(String phone , String password);
}
