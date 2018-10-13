package yto.net.cn.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yto.net.cn.bean.StaffDetail;
import yto.net.cn.bean.StaffDetailQuery;

public interface StaffDetailDao {
    int countByExample(StaffDetailQuery example);

    int deleteByExample(StaffDetailQuery example);

    int deleteByPrimaryKey(Long detailId);

    int insert(StaffDetail record);

    int insertSelective(StaffDetail record);

    List<StaffDetail> selectByExample(StaffDetailQuery example);

    StaffDetail selectByPrimaryKey(Long detailId);

    int updateByExampleSelective(@Param("record") StaffDetail record, @Param("example") StaffDetailQuery example);

    int updateByExample(@Param("record") StaffDetail record, @Param("example") StaffDetailQuery example);

    int updateByPrimaryKeySelective(StaffDetail record);

    int updateByPrimaryKey(StaffDetail record);
}