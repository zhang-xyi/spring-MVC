package com.city.controller;

import com.city.bean.City;
import com.city.model.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ProjectName: SSM-springMVC
 * @Package: com.city.controller
 * @Description: java类作用描述
 * @Author: 张子凡
 * @CreateDate: 2020/12/8 12:00
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
@RequestMapping("city")
public class CityController {
    @Autowired
    private CityService cityService;

    @RequestMapping("list")
    List<City> list(){
        return cityService.list();
    }




}
