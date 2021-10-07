package com.xiexin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xiexin.bean.StaffExample;
import com.xiexin.bean.Staff;
import com.xiexin.dao.StaffDAO;
@Service("staffService")
public class StaffServiceImpl implements StaffService{
	@Autowired(required = false)
	private StaffDAO staffDAO;
	@Override
	public long countByExample(StaffExample example){
    	return staffDAO.countByExample(example);
    }

	@Override
	public int deleteByExample(StaffExample example){
    	return staffDAO.deleteByExample(example);
    }
	@Override
//	public int deleteByPrimaryKey(Integer id){
//		int i = staffDAO.deleteByPrimaryKey(id);
//
//		return i;
//    }

	public int insert(Staff record){
    	return staffDAO.insert(record);
    }

	public int insertSelective(Staff record){
    	return staffDAO.insertSelective(record);
    }

	public List<Staff> selectByExample(StaffExample example){
    	return staffDAO.selectByExample(example);
    }

//	public Staff selectByPrimaryKey(Integer id){
//    	return staffDAO.selectByPrimaryKey(id);
//    }
  
	public int updateByExampleSelective(Staff record, StaffExample example){
    	return staffDAO.updateByExampleSelective(record, example);
    }

	public int updateByExample(Staff record, StaffExample example){
    	return staffDAO.updateByExample(record, example);
    }

	public int updateByPrimaryKeySelective(Staff record){
    	return staffDAO.updateByPrimaryKeySelective(record);
    }

	public int updateByPrimaryKey(Staff record){
    	return staffDAO.updateByPrimaryKey(record);
    }


}
