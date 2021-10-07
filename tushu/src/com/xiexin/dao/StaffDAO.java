package com.xiexin.dao;

import com.xiexin.bean.Staff;
import com.xiexin.bean.StaffExample;
import com.xiexin.bean.StaffKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffDAO {
    long countByExample(StaffExample example);

    int deleteByExample(StaffExample example);

    int deleteByPrimaryKey(StaffKey key);

    int insert(Staff record);

    int insertSelective(Staff record);

    List<Staff> selectByExample(StaffExample example);

    Staff selectByPrimaryKey(StaffKey key);

    int updateByExampleSelective(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByExample(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);
}