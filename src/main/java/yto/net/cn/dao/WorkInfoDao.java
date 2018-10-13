package yto.net.cn.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yto.net.cn.bean.WorkInfo;
import yto.net.cn.bean.WorkInfoQuery;

public interface WorkInfoDao {
    int countByExample(WorkInfoQuery example);

    int deleteByExample(WorkInfoQuery example);

    int deleteByPrimaryKey(Long workId);

    int insert(WorkInfo record);

    int insertSelective(WorkInfo record);

    List<WorkInfo> selectByExample(WorkInfoQuery example);

    WorkInfo selectByPrimaryKey(Long workId);

    int updateByExampleSelective(@Param("record") WorkInfo record, @Param("example") WorkInfoQuery example);

    int updateByExample(@Param("record") WorkInfo record, @Param("example") WorkInfoQuery example);

    int updateByPrimaryKeySelective(WorkInfo record);

    int updateByPrimaryKey(WorkInfo record);
}