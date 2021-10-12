package com.wy.service;

import com.wy.bean.QuanXian;
import com.wy.bean.QuanXianExample;
import com.wy.dao.QuanXianDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("quanXianService")
public class QuanXianServiceImpl implements QuanXianService {
	@Autowired(required = false)
	private QuanXianDAO quanXianDAO;
	public long countByExample(QuanXianExample example){
    	return quanXianDAO.countByExample(example);
    }

	public int deleteByExample(QuanXianExample example){
    	return quanXianDAO.deleteByExample(example);
    }

	public int deleteByPrimaryKey(Integer id){
    	return quanXianDAO.deleteByPrimaryKey(id);
    }

	public int insert(QuanXian record){
    	return quanXianDAO.insert(record);
    }

	public int insertSelective(QuanXian record){
    	return quanXianDAO.insertSelective(record);
    }

	public List<QuanXian> selectByExample(QuanXianExample example){
    	return quanXianDAO.selectByExample(example);
    }

	public QuanXian selectByPrimaryKey(Integer id){
    	return quanXianDAO.selectByPrimaryKey(id);
    }
  
	public int updateByExampleSelective(QuanXian record, QuanXianExample example){
    	return quanXianDAO.updateByExampleSelective(record, example);
    }

	public int updateByExample(QuanXian record, QuanXianExample example){
    	return quanXianDAO.updateByExample(record, example);
    }

	public int updateByPrimaryKeySelective(QuanXian record){
    	return quanXianDAO.updateByPrimaryKeySelective(record);
    }

	public int updateByPrimaryKey(QuanXian record){
    	return quanXianDAO.updateByPrimaryKey(record);
    }


}
