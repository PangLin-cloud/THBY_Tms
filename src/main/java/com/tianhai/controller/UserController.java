package com.tianhai.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.org.apache.xpath.internal.operations.Mod;
import com.tianhai.pojo.ThbyUser;
import com.tianhai.service.UserService;
import com.tianhai.util.Msg;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author Pang-Lin
 * @version 1.0
 * @description: TODO
 * @date 2021/8/23 9:33
 */
@Controller
public class UserController {
    private final Logger logger=Logger.getLogger(UserController.class);


    @Autowired
    UserService userService;
    /** 查询所有员工列表
     * @description: 查询所有员工列表
     * @param: * @param pn 分页数据
     * @return: java.lang.String
     * @author Pang-Lin
     * @date: 2021/8/23 17:30
     */
    @RequestMapping("memberList.action")
    public String userListFindAll(@RequestParam(value = "pn",defaultValue = "1") Integer pn, Model model){
        logger.info("member-list.html页面发起ajax请求开始调用数据");
        PageHelper.startPage(pn,10);
        List<ThbyUser> allUser = userService.findAllUser();
        PageInfo pageInfo=new PageInfo(allUser,5);
        Map<Integer, String> departmentMap = userService.findAllDepartment();
        Map<Integer, String> positionMap = userService.findAllPosition();
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("departmentMap",departmentMap);
        model.addAttribute("positionMap",positionMap);
        logger.info("数据调用完成，准备返回页面！");
        return "member-list";
    }

    @RequestMapping("userDel")
    @ResponseBody
    public Msg userDel(Integer id){
        logger.info("开始删除用户，进入userDel，传入值id="+id);
        int i = userService.userDel(id);
        logger.info("用户删除成功！准备返回页面！i="+i);
        return Msg.success("删除成功！");
    }

    @RequestMapping("userAdd.action")
    @ResponseBody
    public Msg userAdd(ThbyUser user){
        logger.info("进入添加员工方法！");
        logger.info("此次传入员工姓名为："+user.getUsername());
        return Msg.success("添加成功！员工姓名为："+user.getUsername());
    }

}
