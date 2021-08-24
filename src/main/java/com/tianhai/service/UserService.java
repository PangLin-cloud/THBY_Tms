package com.tianhai.service;

import com.tianhai.mapper.DepartmentMapper;
import com.tianhai.mapper.PositionMapper;
import com.tianhai.mapper.ThbyUserMapper;
import com.tianhai.pojo.Department;
import com.tianhai.pojo.Position;
import com.tianhai.pojo.ThbyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Pang-Lin
 * @version 1.0
 * @description: TODO
 * @date 2021/8/23 9:31
 */
@Service
public class UserService {
    /** 员工表接口 */
    @Autowired(required = false)
    ThbyUserMapper userMapper;
    /** 公司部门表接口 */
    @Autowired(required = false)
    DepartmentMapper departmentMapper;
    /** 职位表接口 */
    @Autowired(required = false)
    PositionMapper positionMapper;


    /** 查询所有员工
     * @description: 查询所有员工
     * @param: * @param null
     * @return:
     * @author Pang-Lin
     * @date: 2021/8/23 9:40
     */
    public List<ThbyUser> findAllUser(){
        return userMapper.selectByExample(null);
    }

    /** 查询所有部门名称
     * @description: 查询所有部门名称
     * @param:
     * @return: java.util.List<com.tianhai.pojo.Department>
     * @author Pang-Lin
     * @date: 2021/8/24 15:51
     */
    public List<Department> findAllDepartmentList(){
        return departmentMapper.selectByExample(null);
    }
    /** 查询所有部门名称并转为Map集合
     * @description: 查询所有部门名称并转为Map集合
     * @param:
     * @return: java.util.Map<java.lang.Integer,java.lang.String>
     * @author Pang-Lin
     * @date: 2021/8/23 9:46
     */
    public Map<Integer,String> findAllDepartment(){
        List<Department> departments = departmentMapper.selectByExample(null);
        Map<Integer,String> departmentMap=new HashMap<>();
        for (Department department:departments) {
            departmentMap.put(department.getDepId(),department.getDepName());
        }
        return departmentMap;
    }
    /** 查询所有职位信息
     * @description: 查询所有职位信息
     * @param:
     * @return: java.util.List<com.tianhai.pojo.Position>
     * @author Pang-Lin
     * @date: 2021/8/24 15:52
     */
    public List<Position> findAllPositionList(){
        return positionMapper.selectByExample(null);
    }

    /** 查询所有职位信息并放入Map集合
     * @description: 查询所有职位信息并放入Map集合
     * @param:
     * @return: java.util.Map<java.lang.Integer,java.lang.String>
     * @author Pang-Lin
     * @date: 2021/8/23 9:50
     */
    public Map<Integer,String> findAllPosition(){
        List<Position> positions = positionMapper.selectByExample(null);
        Map<Integer,String> positionMap=new HashMap<>();
        for (Position position:positions) {
            positionMap.put(position.getPositionId(),position.getPositionName());
        }
        return positionMap;
    }

    public int userDel(int id){
        return userMapper.deleteByPrimaryKey(id);
    }
}
