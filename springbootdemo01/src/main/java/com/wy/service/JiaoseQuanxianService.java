package com.wy.service;

import com.wy.bean.JiaoseQuanxian;
import com.wy.bean.JiaoseQuanxianExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JiaoseQuanxianService {
   
    long countByExample(JiaoseQuanxianExample example);

    int deleteByExample(JiaoseQuanxianExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JiaoseQuanxian record);

    int insertSelective(JiaoseQuanxian record);

    List<JiaoseQuanxian> selectByExample(JiaoseQuanxianExample example);

    JiaoseQuanxian selectByPrimaryKey(Integer id);
  
    int updateByExampleSelective(@Param("record") JiaoseQuanxian record, @Param("example") JiaoseQuanxianExample example);

    int updateByExample(@Param("record") JiaoseQuanxian record, @Param("example") JiaoseQuanxianExample example);

    int updateByPrimaryKeySelective(JiaoseQuanxian record);

    int updateByPrimaryKey(JiaoseQuanxian record);

}
