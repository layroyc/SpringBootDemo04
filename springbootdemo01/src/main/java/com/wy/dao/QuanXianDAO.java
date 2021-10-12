package com.wy.dao;

import com.wy.bean.QuanXian;
import com.wy.bean.QuanXianExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuanXianDAO {
    long countByExample(QuanXianExample example);

    int deleteByExample(QuanXianExample example);

    int deleteByPrimaryKey(Integer quanXianId);

    int insert(QuanXian record);

    int insertSelective(QuanXian record);

    List<QuanXian> selectByExample(QuanXianExample example);

    QuanXian selectByPrimaryKey(Integer quanXianId);

    int updateByExampleSelective(@Param("record") QuanXian record, @Param("example") QuanXianExample example);

    int updateByExample(@Param("record") QuanXian record, @Param("example") QuanXianExample example);

    int updateByPrimaryKeySelective(QuanXian record);

    int updateByPrimaryKey(QuanXian record);
}