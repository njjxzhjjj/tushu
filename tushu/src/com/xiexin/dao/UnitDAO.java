package com.xiexin.dao;

import com.xiexin.bean.Unit;
import com.xiexin.bean.UnitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnitDAO {
    long countByExample(UnitExample example);

    int deleteByExample(UnitExample example);

    int deleteByPrimaryKey(Integer deptnum);

    int insert(Unit record);

    int insertSelective(Unit record);

    List<Unit> selectByExample(UnitExample example);

    Unit selectByPrimaryKey(Integer deptnum);

    int updateByExampleSelective(@Param("record") Unit record, @Param("example") UnitExample example);

    int updateByExample(@Param("record") Unit record, @Param("example") UnitExample example);

    int updateByPrimaryKeySelective(Unit record);

    int updateByPrimaryKey(Unit record);
}