package com.tianhai.mapper;

import com.tianhai.pojo.ThbyUser;
import com.tianhai.pojo.ThbyUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ThbyUserMapper {
    int countByExample(ThbyUserExample example);

    int deleteByExample(ThbyUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ThbyUser record);

    int insertSelective(ThbyUser record);

    List<ThbyUser> selectByExample(ThbyUserExample example);

    ThbyUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ThbyUser record, @Param("example") ThbyUserExample example);

    int updateByExample(@Param("record") ThbyUser record, @Param("example") ThbyUserExample example);

    int updateByPrimaryKeySelective(ThbyUser record);

    int updateByPrimaryKey(ThbyUser record);
}