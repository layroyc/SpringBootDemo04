package com.wy.service;

import com.wy.bean.Student;
import com.wy.bean.StudentExample;
import com.wy.dao.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
	@Autowired(required = false)
	private StudentDAO studentDAO;
	public long countByExample(StudentExample example){
    	return studentDAO.countByExample(example);
    }

	public int deleteByExample(StudentExample example){
    	return studentDAO.deleteByExample(example);
    }

	public int deleteByPrimaryKey(Integer id){
    	return studentDAO.deleteByPrimaryKey(id);
    }

	public int insert(Student record){
    	return studentDAO.insert(record);
    }

	public int insertSelective(Student record){
    	return studentDAO.insertSelective(record);
    }

	public List<Student> selectByExample(StudentExample example){
    	return studentDAO.selectByExample(example);
    }

	public Student selectByPrimaryKey(Integer id){
    	return studentDAO.selectByPrimaryKey(id);
    }
  
	public int updateByExampleSelective(Student record, StudentExample example){
    	return studentDAO.updateByExampleSelective(record, example);
    }

	public int updateByExample(Student record, StudentExample example){
    	return studentDAO.updateByExample(record, example);
    }

	public int updateByPrimaryKeySelective(Student record){
    	return studentDAO.updateByPrimaryKeySelective(record);
    }

	public int updateByPrimaryKey(Student record){
    	return studentDAO.updateByPrimaryKey(record);
    }


}
