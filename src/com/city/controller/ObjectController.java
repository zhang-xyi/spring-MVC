package com.city.controller;

import com.alibaba.fastjson.JSONObject;
import com.city.bean.City;
import com.city.model.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @ProjectName: SSM-springMVC
 * @Package: com.city.controller
 * @Description: java类作用描述
 * @Author: 张子凡
 * @CreateDate: 2020/12/16 11:15
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
public class ObjectController {

    @Autowired
    CityService cityService;

    @RequestMapping("/objectTest01")
    public void objectTest01(HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        List<City> cities = cityService.list();
        String citiesJson = JSONObject.toJSONString(cities);
        response.getWriter().println(citiesJson);
    }

    @RequestMapping("/objectTest02")
    @ResponseBody
    public List<City> objectTest02(HttpServletResponse response) {
        List<City> cities = cityService.list();
        return cities;
    }

    @RequestMapping("/objectTest03")
    public String objectTest03(HttpServletResponse response, Model model) {
        List<City> cities = cityService.list();
        model.addAttribute("cities",cities);
        return "../province";
    }
}
