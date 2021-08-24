package com.tianhai.mapper;

import com.tianhai.pojo.ThbyAdmin;
import com.tianhai.pojo.ThbyAdminExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ThbyAdminMapper {
    int countByExample(ThbyAdminExample example);

    int deleteByExample(ThbyAdminExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ThbyAdmin record);

    int insertSelective(ThbyAdmin record);

    List<ThbyAdmin> selectByExample(ThbyAdminExample example);

    ThbyAdmin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ThbyAdmin record, @Param("example") ThbyAdminExample example);

    int updateByExample(@Param("record") ThbyAdmin record, @Param("example") ThbyAdminExample example);

    int updateByPrimaryKeySelective(ThbyAdmin record);

    int updateByPrimaryKey(ThbyAdmin record);
}