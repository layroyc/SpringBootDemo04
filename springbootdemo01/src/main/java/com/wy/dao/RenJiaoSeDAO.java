package com.wy.dao;

import com.wy.bean.RenJiaoSe;
import com.wy.bean.RenJiaoSeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RenJiaoSeDAO {
    long countByExample(RenJiaoSeExample example);

    int deleteByExample(RenJiaoSeExample example);

    int deleteByPrimaryKey(Integer renJiaoseId);

    int insert(RenJiaoSe record);

    int insertSelective(RenJiaoSe record);

    List<RenJiaoSe> selectByExample(RenJiaoSeExample example);

    RenJiaoSe selectByPrimaryKey(Integer renJiaoseId);

    int updateByExampleSelective(@Param("record") RenJiaoSe record, @Param("example") RenJiaoSeExample example);

    int updateByExample(@Param("record") RenJiaoSe record, @Param("example") RenJiaoSeExample example);

    int updateByPrimaryKeySelective(RenJiaoSe record);

    int updateByPrimaryKey(RenJiaoSe record);
}