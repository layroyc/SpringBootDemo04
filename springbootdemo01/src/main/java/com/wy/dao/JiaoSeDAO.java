package com.wy.dao;

import com.wy.bean.JiaoSe;
import com.wy.bean.JiaoSeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JiaoSeDAO {
    long countByExample(JiaoSeExample example);

    int deleteByExample(JiaoSeExample example);

    int deleteByPrimaryKey(Integer jiaoSeId);

    int insert(JiaoSe record);

    int insertSelective(JiaoSe record);

    List<JiaoSe> selectByExample(JiaoSeExample example);

    JiaoSe selectByPrimaryKey(Integer jiaoSeId);

    int updateByExampleSelective(@Param("record") JiaoSe record, @Param("example") JiaoSeExample example);

    int updateByExample(@Param("record") JiaoSe record, @Param("example") JiaoSeExample example);

    int updateByPrimaryKeySelective(JiaoSe record);

    int updateByPrimaryKey(JiaoSe record);
}