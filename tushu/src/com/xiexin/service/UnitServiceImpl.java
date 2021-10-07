package com.xiexin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.xiexin.bean.UnitExample;
import com.xiexin.bean.Unit;
import com.xiexin.dao.UnitDAO;
@Service("unitService")
public class UnitServiceImpl implements UnitService{
	@Autowired(required = false)
	private UnitDAO unitDAO;
	public long countByExample(UnitExample example){
    	return unitDAO.countByExample(example);
    }

	public int deleteByExample(UnitExample example){
    	return unitDAO.deleteByExample(example);
    }

	public int deleteByPrimaryKey(Integer id){
    	return unitDAO.deleteByPrimaryKey(id);
    }

	public int insert(Unit record){
    	return unitDAO.insert(record);
    }

	public int insertSelective(Unit record){
    	return unitDAO.insertSelective(record);
    }

	public List<Unit> selectByExample(UnitExample example){
    	return unitDAO.selectByExample(example);
    }

	public Unit selectByPrimaryKey(Integer id){
    	return unitDAO.selectByPrimaryKey(id);
    }
  
	public int updateByExampleSelective(Unit record, UnitExample example){
    	return unitDAO.updateByExampleSelective(record, example);
    }

	public int updateByExample(Unit record, UnitExample example){
    	return unitDAO.updateByExample(record, example);
    }

	public int updateByPrimaryKeySelective(Unit record){
    	return unitDAO.updateByPrimaryKeySelective(record);
    }

	public int updateByPrimaryKey(Unit record){
    	return unitDAO.updateByPrimaryKey(record);
    }


}
