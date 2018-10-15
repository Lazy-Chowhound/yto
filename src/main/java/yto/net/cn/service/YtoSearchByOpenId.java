package yto.net.cn.service;

import yto.net.cn.bean.YtoLogin;

public interface YtoSearchByOpenId {
    /**
     * 根据wechat_openid查询
     *
     * @param open_id
     * @return
     */
    YtoLogin searchByOpenId(String open_id);
}
