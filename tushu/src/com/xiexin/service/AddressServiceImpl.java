package com.xiexin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xiexin.bean.AddressExample;
import com.xiexin.bean.Address;
import com.xiexin.dao.AddressDAO;
@Service("addressService")
public class AddressServiceImpl implements AddressService{
	@Autowired(required = false)
	private AddressDAO addressDAO;
	public long countByExample(AddressExample example){
    	return addressDAO.countByExample(example);
    }

	public int deleteByExample(AddressExample example){
    	return addressDAO.deleteByExample(example);
    }

	public int deleteByPrimaryKey(Integer id){
    	return addressDAO.deleteByPrimaryKey(id);
    }

	public int insert(Address record){
    	return addressDAO.insert(record);
    }

	public int insertSelective(Address record){
    	return addressDAO.insertSelective(record);
    }

	public List<Address> selectByExample(AddressExample example){
    	return addressDAO.selectByExample(example);
    }

	public Address selectByPrimaryKey(Integer id){
    	return addressDAO.selectByPrimaryKey(id);
    }
  
	public int updateByExampleSelective(Address record, AddressExample example){
    	return addressDAO.updateByExampleSelective(record, example);
    }

	public int updateByExample(Address record, AddressExample example){
    	return addressDAO.updateByExample(record, example);
    }

	public int updateByPrimaryKeySelective(Address record){
    	return addressDAO.updateByPrimaryKeySelective(record);
    }

	public int updateByPrimaryKey(Address record){
    	return addressDAO.updateByPrimaryKey(record);
    }


}
