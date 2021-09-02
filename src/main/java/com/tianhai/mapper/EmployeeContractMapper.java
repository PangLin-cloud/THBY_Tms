package com.tianhai.mapper;

import com.tianhai.pojo.EmployeeContract;
import com.tianhai.pojo.EmployeeContractExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeContractMapper {
    int countByExample(EmployeeContractExample example);

    int deleteByExample(EmployeeContractExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EmployeeContract record);

    int insertSelective(EmployeeContract record);

    List<EmployeeContract> selectByExample(EmployeeContractExample example);

    EmployeeContract selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EmployeeContract record, @Param("example") EmployeeContractExample example);

    int updateByExample(@Param("record") EmployeeContract record, @Param("example") EmployeeContractExample example);

    int updateByPrimaryKeySelective(EmployeeContract record);

    int updateByPrimaryKey(EmployeeContract record);
}