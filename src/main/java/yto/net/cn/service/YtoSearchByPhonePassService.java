package yto.net.cn.service;

import yto.net.cn.bean.YtoLogin;

public interface YtoSearchByPhonePassService {
    /**
     * 根据手机号和密码查询
     *
     * @param phone
     * @param password
     * @return
     */
    YtoLogin searchByPhonePass(String phone, String password);
}
