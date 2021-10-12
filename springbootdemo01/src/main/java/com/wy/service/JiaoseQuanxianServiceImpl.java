package com.wy.service;

import com.wy.bean.JiaoseQuanxian;
import com.wy.bean.JiaoseQuanxianExample;
import com.wy.dao.JiaoseQuanxianDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("jiaoseQuanxianService")
public class JiaoseQuanxianServiceImpl implements JiaoseQuanxianService{
	@Autowired(required = false)
	private JiaoseQuanxianDAO jiaoseQuanxianDAO;
	public long countByExample(JiaoseQuanxianExample example){
    	return jiaoseQuanxianDAO.countByExample(example);
    }

	public int deleteByExample(JiaoseQuanxianExample example){
    	return jiaoseQuanxianDAO.deleteByExample(example);
    }

	public int deleteByPrimaryKey(Integer id){
    	return jiaoseQuanxianDAO.deleteByPrimaryKey(id);
    }

	public int insert(JiaoseQuanxian record){
    	return jiaoseQuanxianDAO.insert(record);
    }

	public int insertSelective(JiaoseQuanxian record){
    	return jiaoseQuanxianDAO.insertSelective(record);
    }

	public List<JiaoseQuanxian> selectByExample(JiaoseQuanxianExample example){
    	return jiaoseQuanxianDAO.selectByExample(example);
    }

	public JiaoseQuanxian selectByPrimaryKey(Integer id){
    	return jiaoseQuanxianDAO.selectByPrimaryKey(id);
    }
  
	public int updateByExampleSelective(JiaoseQuanxian record, JiaoseQuanxianExample example){
    	return jiaoseQuanxianDAO.updateByExampleSelective(record, example);
    }

	public int updateByExample(JiaoseQuanxian record, JiaoseQuanxianExample example){
    	return jiaoseQuanxianDAO.updateByExample(record, example);
    }

	public int updateByPrimaryKeySelective(JiaoseQuanxian record){
    	return jiaoseQuanxianDAO.updateByPrimaryKeySelective(record);
    }

	public int updateByPrimaryKey(JiaoseQuanxian record){
    	return jiaoseQuanxianDAO.updateByPrimaryKey(record);
    }


}
