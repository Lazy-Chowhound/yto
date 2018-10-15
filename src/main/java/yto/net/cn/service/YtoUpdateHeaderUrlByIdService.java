package yto.net.cn.service;


public interface YtoUpdateHeaderUrlByIdService {
    /**
     * 根据id修改头像url
     *
     * @param header_url
     * @param id
     * @return
     */
    int updateHeaderUrlById(String header_url, int id);
}
