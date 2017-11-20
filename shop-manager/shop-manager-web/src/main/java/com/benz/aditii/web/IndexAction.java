package com.benz.aditii.web;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Scope("prototype")
public class IndexAction {

    @RequestMapping("/")
    public String goLogin() {
        return "login";
    }

    @RequestMapping("/goIndex")
    public String goIndex() {
        return "index";
    }

    @RequestMapping("/goRegister")
    public String goRegister() {
        return "register";
    }
}
