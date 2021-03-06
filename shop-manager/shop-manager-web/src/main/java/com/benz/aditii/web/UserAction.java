package com.benz.aditii.web;

import com.benz.aditii.pojo.po.TbUser;
import com.benz.aditii.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@Scope("prototype")
public class UserAction {

    @Autowired
    private UserService userService;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/login")
    @ResponseBody
    public String userLogin(TbUser user, HttpSession session) {
        String message = "";
        try {
            //非空校验
            if (user != null) {
                if (user.getUsername().equals("")) {
                    message = "0"; //用户名为空
                } else if (user.getPassword().equals("")) {
                    message = "1"; //密码为空
                } else {
                    //用户名密码都不为空,先根据用户名查询user
                    TbUser findUser = userService.checkUserLogin(user);
                    if (findUser != null) {
                        //进一步判断密码
                        if (findUser.getPassword().equals(user.getPassword())) {
                            session.setAttribute("sessionUser", findUser); //密码和查询出来的user相同,允许登录
                            message = "3"; //用户名密码正确
                        } else {
                            message = "2"; //用户名密码错误
                        }
                    } else {
                        message = "2"; //用户名密码错误
                    }
                }
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return message;
    }

    @RequestMapping("/register")
    public String userRegister(TbUser user, Model model) {
        try {
            //非空校验
            if (user != null) {
                if (user.getUsername().equals("")) {
                    return "register"; //用户名为空
                } else if (user.getPassword().equals("")) {
                    return "register"; //密码为空
                } else {
                    //用户名密码都不为空,先根据用户名查询user
                    TbUser findUser = userService.findUserByName(user);
                    if (findUser == null) {
                        int saveCount = userService.save(user);
                        if (saveCount > 0) {
                            model.addAttribute("registerSuccessMessage", "注册成功");
                            return "login"; //用户名不存在，可以注册，注册成功，返回登录界面
                        }
                    } else {
                        return "register"; //用户名已存在
                    }
                }
            }
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            e.printStackTrace();
        }
        return "login";
    }

    @ResponseBody
    @RequestMapping("/checkUsernameExists")
    public String checkUsernameExists(String name) {
        String message = "";
        TbUser user = new TbUser();
        user.setUsername(name);
        if (userService.findUserByName(user) == null) {
            message = "1"; //用户名不存在，可以使用
        } else {
            message = "0"; //用户名已存在，不可使用
        }
        return message;
    }

}
