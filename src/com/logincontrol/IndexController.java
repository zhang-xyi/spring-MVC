package com.logincontrol;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceView;

/**
 * @ProjectName: SSM-springMVC
 * @Package: com.logincontrol
 * @Description: java类作用描述
 * @Author: 张子凡
 * @CreateDate: 2020/12/15 9:22
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
public class IndexController {
    @RequestMapping("index")
    ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setView(new InternalResourceView("/welcome.jsp"));
        return modelAndView;
    }

}
