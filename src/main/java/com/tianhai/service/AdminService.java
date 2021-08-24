package com.tianhai.service;

import com.tianhai.mapper.ThbyAdminMapper;
import com.tianhai.pojo.ThbyAdmin;
import com.tianhai.pojo.ThbyAdminExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/** 管理员Service
 * @author Pang-Lin
 * @version 1.0
 * @description: TODO
 * @date 2021/8/17 9:17
 */
@Service
public class AdminService {
    @Autowired(required = false)
    ThbyAdminMapper adminMapper;


    /** 登录查询
     * @description: 登录查询
     * @param: user 用户名  password  密码
     * @return: com.tianhai.pojo.ThbyAdmin 返回一个管理员用户对象
     * @author Pang-Lin
     * @date: 2021/8/18 15:22
     */
    public ThbyAdmin selectAdminByUserAndPwd(String user,String password){
        ThbyAdminExample example=new ThbyAdminExample();
        example.createCriteria().andUserEqualTo(user).andPasswordEqualTo(password);
        List<ThbyAdmin> thbyAdmins = adminMapper.selectByExample(example);
        ThbyAdmin thbyAdmin=thbyAdmins.size()>0?thbyAdmins.get(0):null;
        return thbyAdmin;
    }
}
