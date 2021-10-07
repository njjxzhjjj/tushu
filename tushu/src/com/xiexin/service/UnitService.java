package com.xiexin.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.xiexin.bean.UnitExample;
import com.xiexin.bean.Unit;

public interface UnitService {
   
    long countByExample(UnitExample example);

    int deleteByExample(UnitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Unit record);

    int insertSelective(Unit record);

    List<Unit> selectByExample(UnitExample example);

    Unit selectByPrimaryKey(Integer id);
  
    int updateByExampleSelective(@Param("record") Unit record, @Param("example") UnitExample example);

    int updateByExample(@Param("record") Unit record, @Param("example") UnitExample example);

    int updateByPrimaryKeySelective(Unit record);

    int updateByPrimaryKey(Unit record);

}
