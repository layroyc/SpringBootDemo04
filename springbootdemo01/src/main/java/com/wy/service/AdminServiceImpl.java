package com.wy.service;

import com.wy.bean.Admin;
import com.wy.bean.AdminExample;
import com.wy.dao.AdminDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service("adminService")
public class AdminServiceImpl implements AdminService {
	@Autowired(required = false)
	private AdminDAO adminDAO;
	public long countByExample(AdminExample example){
    	return adminDAO.countByExample(example);
    }

	public int deleteByExample(AdminExample example){
    	return adminDAO.deleteByExample(example);
    }

	public int deleteByPrimaryKey(Integer id){
    	return adminDAO.deleteByPrimaryKey(id);
    }

	public int insert(Admin record){
    	return adminDAO.insert(record);
    }

	public int insertSelective(Admin record){
		record.setSalt(getRandomNickname());
    	return adminDAO.insertSelective(record);
    }

	public List<Admin> selectByExample(AdminExample example){
    	return adminDAO.selectByExample(example);
    }

	public Admin selectByPrimaryKey(Integer id){
    	return adminDAO.selectByPrimaryKey(id);
    }
  
	public int updateByExampleSelective(Admin record, AdminExample example){
    	return adminDAO.updateByExampleSelective(record, example);
    }

	public int updateByExample(Admin record, AdminExample example){
    	return adminDAO.updateByExample(record, example);
    }

	public int updateByPrimaryKeySelective(Admin record){
    	return adminDAO.updateByPrimaryKeySelective(record);
    }

	public int updateByPrimaryKey(Admin record){
    	return adminDAO.updateByPrimaryKey(record);
    }


	public static String getRandomNickname() {
		String val = "";
		Random random = new Random();
		for (int i = 0; i < 8; i++) {
			// 输出字母还是数字
			String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num";
			// 字符串
			if ("char".equalsIgnoreCase(charOrNum)) {
				// 取得大写字母还是小写字母
				int choice = random.nextInt(2) % 2 == 0 ? 65 : 97;
				val += (char) (choice + random.nextInt(26));
			} else if ("num".equalsIgnoreCase(charOrNum)) { // 数字
				val += String.valueOf(random.nextInt(10));
			}
		}

		return val;
	}

}
