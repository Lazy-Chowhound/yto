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
     * @param phone
     * @param password
     * @return
     */
    YtoLogin selectByPhonePass(@Param("phone") String phone ,@Param("password") String password);


}