package com.wy.service;

import com.wy.bean.RenJiaoSe;
import com.wy.bean.RenJiaoSeExample;
import com.wy.dao.RenJiaoSeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("renJiaoSeService")
public class RenJiaoSeServiceImpl implements RenJiaoSeService{
	@Autowired(required = false)
	private RenJiaoSeDAO renJiaoSeDAO;
	public long countByExample(RenJiaoSeExample example){
    	return renJiaoSeDAO.countByExample(example);
    }

	public int deleteByExample(RenJiaoSeExample example){
    	return renJiaoSeDAO.deleteByExample(example);
    }

	public int deleteByPrimaryKey(Integer id){
    	return renJiaoSeDAO.deleteByPrimaryKey(id);
    }

	public int insert(RenJiaoSe record){
    	return renJiaoSeDAO.insert(record);
    }

	public int insertSelective(RenJiaoSe record){
    	return renJiaoSeDAO.insertSelective(record);
    }

	public List<RenJiaoSe> selectByExample(RenJiaoSeExample example){
    	return renJiaoSeDAO.selectByExample(example);
    }

	public RenJiaoSe selectByPrimaryKey(Integer id){
    	return renJiaoSeDAO.selectByPrimaryKey(id);
    }
  
	public int updateByExampleSelective(RenJiaoSe record, RenJiaoSeExample example){
    	return renJiaoSeDAO.updateByExampleSelective(record, example);
    }

	public int updateByExample(RenJiaoSe record, RenJiaoSeExample example){
    	return renJiaoSeDAO.updateByExample(record, example);
    }

	public int updateByPrimaryKeySelective(RenJiaoSe record){
    	return renJiaoSeDAO.updateByPrimaryKeySelective(record);
    }

	public int updateByPrimaryKey(RenJiaoSe record){
    	return renJiaoSeDAO.updateByPrimaryKey(record);
    }


}
