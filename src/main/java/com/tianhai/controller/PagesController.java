package com.tianhai.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.tianhai.pojo.Department;
import com.tianhai.pojo.Position;
import com.tianhai.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author Pang-Lin
 * @version 1.0
 * @description: TODO
 * @date 2021/8/23 10:46
 */
@Controller
public class PagesController {
    private Logger logger=Logger.getLogger(PagesController.class);

    @Autowired
    UserService userService;

    @RequestMapping("member-list.html")
    public String memberlist(){
        logger.info("跳转至member-list.html页面");
        return "member-list";
    }
    @RequestMapping("member-add.html")
    public String memberAdd(Model model){
        logger.info("跳转至member-add.html页面");
        List<Department> allDepartmentList = userService.findAllDepartmentList();
        List<Position> allPositionList = userService.findAllPositionList();
        model.addAttribute("allDepartmentList",allDepartmentList);
        model.addAttribute("allPositionList",allPositionList);
        return "member-add";
    }
}
