package com.xiexin.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xiexin.bean.StaffExample;
import com.xiexin.bean.Staff;

public interface StaffService {
   
    long countByExample(StaffExample example);

    int deleteByExample(StaffExample example);

//    int deleteByPrimaryKey(Integer id);

    int insert(Staff record);

    int insertSelective(Staff record);

    List<Staff> selectByExample(StaffExample example);

//    Staff selectByPrimaryKey(Integer id);
  
    int updateByExampleSelective(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByExample(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);

}
