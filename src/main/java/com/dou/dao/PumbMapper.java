package com.dou.dao;

import com.dou.domain.Pumb;
import com.dou.domain.PumbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PumbMapper {
    long countByExample(PumbExample example);

    int deleteByExample(PumbExample example);

    int deleteByPrimaryKey(Integer pumbId);

    int insert(Pumb record);

    int insertSelective(Pumb record);

    List<Pumb> selectByExample(PumbExample example);

    Pumb selectByPrimaryKey(Integer pumbId);

    int updateByExampleSelective(@Param("record") Pumb record, @Param("example") PumbExample example);

    int updateByExample(@Param("record") Pumb record, @Param("example") PumbExample example);

    int updateByPrimaryKeySelective(Pumb record);

    int updateByPrimaryKey(Pumb record);
}