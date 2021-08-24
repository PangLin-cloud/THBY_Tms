package com.tianhai.controller;

import com.tianhai.pojo.ThbyAdmin;
import com.tianhai.service.AdminService;
import com.tianhai.util.Msg;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/** 登录Controller
 * @author Pang-Lin
 * @version 1.0
 * @description: TODO
 * @date 2021/8/17 9:21
 */
@Controller
public class LoginController {
    private Logger logger=Logger.getLogger(LoginController.class);



    @Autowired
    AdminService adminService;
    @RequestMapping("login.html")
    public String loginHtml(){return "login";}
    @RequestMapping("index.html")
    public String indexHtml(){return "index";}
    @RequestMapping("welcome.html")
    public String welcomeHtml(){return "welcome";}
    @RequestMapping("login.action")
    @ResponseBody
    public Msg loginAction(ThbyAdmin admin, Model model, HttpSession session){
        logger.info("进入login.action请求");
        logger.info("进入loginAction方法");
        logger.info("打印用户名和密码："+admin.getUser()+admin.getPassword());
        ThbyAdmin thbyAdmin = adminService.selectAdminByUserAndPwd(admin.getUser(), admin.getPassword());
        if (thbyAdmin!=null){
            logger.info("loginAction方法执行完毕");
            session.setAttribute("user",thbyAdmin);
            return Msg.success("登陆成功！");
        }else {
            logger.info("loginAction方法执行完毕");
            return Msg.fail("用户名或密码错误！");
        }
    }
}
