package com.tianhai.mapper;

import com.tianhai.pojo.Position;
import com.tianhai.pojo.PositionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PositionMapper {
    int countByExample(PositionExample example);

    int deleteByExample(PositionExample example);

    int deleteByPrimaryKey(Integer positionId);

    int insert(Position record);

    int insertSelective(Position record);

    List<Position> selectByExample(PositionExample example);

    Position selectByPrimaryKey(Integer positionId);

    int updateByExampleSelective(@Param("record") Position record, @Param("example") PositionExample example);

    int updateByExample(@Param("record") Position record, @Param("example") PositionExample example);

    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKey(Position record);
}