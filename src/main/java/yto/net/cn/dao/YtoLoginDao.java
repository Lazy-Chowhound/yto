package yto.net.cn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import yto.net.cn.bean.YtoLogin;
import yto.net.cn.bean.YtoLoginQuery;

public interface YtoLoginDao {
    int countByExample(YtoLoginQuery example);

    int deleteByExample(YtoLoginQuery example);

    int deleteByPrimaryKey(Long loginId);

    int insert(YtoLogin record);

    int insertSelective(YtoLogin record);

    List<YtoLogin> selectByExample(YtoLoginQuery example);

    YtoLogin selectByPrimaryKey(Long loginId);

    int updateByExampleSelective(@Param("record") YtoLogin record, @Param("example") YtoLoginQuery example);

    int updateByExample(@Param("record") YtoLogin record, @Param("example") YtoLoginQuery example);

    int updateByPrimaryKeySelective(YtoLogin record);

    int updateByPrimaryKey(YtoLogin record);

    /**
     * 根据手机号和密码登陆
     *
     * @param phone
     * @param password
     * @return
     */
    YtoLogin selectByPhonePass(@Param("phone") String phone, @Param("password") String password);

    /**
     * 根据手机号和密码查询
     *
     * @param phone
     * @param password
     * @return
     */
    YtoLogin searchByPhonePass(@Param("phone") String phone, @Param("password") String password);

    /**
     * 根据邮箱和密码查询
     *
     * @param email
     * @param password
     * @return
     */
    YtoLogin searchByEmailPass(@Param("email") String email, @Param("password") String password);

    /**
     * 根据wechat_openid查询
     *
     * @param open_id
     * @return
     */
    YtoLogin searchByOpenId(String open_id);

    /**
     * 根据手机号修改密码
     *
     * @param password
     * @param phone
     * @return
     */
    int updatePassByPhone(@Param("password") String password, @Param("phone") String phone);

    /**
     * 根据邮箱修改密码
     *
     * @param password
     * @param email
     * @return
     */
    int updatePassByEmail(@Param("password") String password, @Param("email") String email);

    /**
     * 根据手机号修改用户名
     *
     * @param name
     * @param phone
     * @return
     */
    int updateNameByPhone(@Param("name") String name, @Param("phone") String phone);

    /**
     * 根据邮箱修改用户名
     *
     * @param name
     * @param email
     * @return
     */
    int updateNameByEmail(@Param("name") String name, @Param("email") String email);

    /**
     * 根据手机号和密码修改邮箱
     *
     * @param email
     * @param phone
     * @param password
     * @return
     */
    int updateEmailByPhonePass(@Param("email") String email, @Param("phone") String phone, @Param("password") String password);

    /**
     * 根据邮箱和密码修改手机号
     *
     * @param phone
     * @param email
     * @param password
     * @return
     */
    int updatePhoneByEmailPass(@Param("phone") String phone, @Param("email") String email, @Param("password") String password);

    /**
     * 根据id修改头像url
     *
     * @param header_url
     * @param id
     * @return
     */
    int updateHeaderUrlById(@Param("header_url") String header_url, @Param("id") int id);
}