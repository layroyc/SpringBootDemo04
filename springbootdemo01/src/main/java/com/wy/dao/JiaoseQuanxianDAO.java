package com.wy.dao;

import com.wy.bean.JiaoseQuanxian;
import com.wy.bean.JiaoseQuanxianExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JiaoseQuanxianDAO {
    long countByExample(JiaoseQuanxianExample example);

    int deleteByExample(JiaoseQuanxianExample example);

    int deleteByPrimaryKey(Integer jiaoseQuanxianId);

    int insert(JiaoseQuanxian record);

    int insertSelective(JiaoseQuanxian record);

    List<JiaoseQuanxian> selectByExample(JiaoseQuanxianExample example);

    JiaoseQuanxian selectByPrimaryKey(Integer jiaoseQuanxianId);

    int updateByExampleSelective(@Param("record") JiaoseQuanxian record, @Param("example") JiaoseQuanxianExample example);

    int updateByExample(@Param("record") JiaoseQuanxian record, @Param("example") JiaoseQuanxianExample example);

    int updateByPrimaryKeySelective(JiaoseQuanxian record);

    int updateByPrimaryKey(JiaoseQuanxian record);
}