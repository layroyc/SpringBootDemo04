package com.wy.service;

import com.wy.bean.RenJiaoSe;
import com.wy.bean.RenJiaoSeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RenJiaoSeService {
   
    long countByExample(RenJiaoSeExample example);

    int deleteByExample(RenJiaoSeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RenJiaoSe record);

    int insertSelective(RenJiaoSe record);

    List<RenJiaoSe> selectByExample(RenJiaoSeExample example);

    RenJiaoSe selectByPrimaryKey(Integer id);
  
    int updateByExampleSelective(@Param("record") RenJiaoSe record, @Param("example") RenJiaoSeExample example);

    int updateByExample(@Param("record") RenJiaoSe record, @Param("example") RenJiaoSeExample example);

    int updateByPrimaryKeySelective(RenJiaoSe record);

    int updateByPrimaryKey(RenJiaoSe record);

}
