package com.logincontrol;

import com.empy.bean.Empy;
import com.empy.model.service.EmpyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * @ProjectName: SSM-springMVC
 * @Package: com.logincontrol
 * @Description: java类作用描述
 * @Author: 张子凡
 * @CreateDate: 2020/12/14 21:26
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
public class LoginController {

    @Autowired
    EmpyService empyService;

    @RequestMapping("login")
    void login(){

    }

    @RequestMapping("doLogin")
    String doLogin(Empy empy, HttpSession session){
        Empy empyDB=empyService.get(empy);
        if (empyDB==null){
            empy.setMsg("登录失败");
            return "login";
        }
        session.setAttribute("LOGIN",empyDB);
        return "redirect:/";
    }


    @RequestMapping("logout")
    String logout(HttpSession session){
        session.removeAttribute("LOGIN");
        return "redirect:/";
    }

}
