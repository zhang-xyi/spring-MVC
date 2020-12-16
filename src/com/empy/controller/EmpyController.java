package com.empy.controller;

import com.depty.bean.Depty;
import com.depty.model.service.DeptyService;
import com.empy.bean.Empy;
import com.empy.model.service.EmpyService;
import com.util.Page;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: SSM-springMVC
 * @Package: com.empy.controller
 * @Description: java类作用描述
 * @Author: 张子凡
 * @CreateDate: 2020/12/9 20:51
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
@RequestMapping("empy")
public class EmpyController {
    @Autowired
    private EmpyService empyService;

    @Autowired
    private DeptyService deptyService;

    @RequestMapping("list")
    List<Empy> list(Empy empy, Page page) {
        return empyService.list(empy,page);
    }

    @RequestMapping("edit")
    Empy edit(ArrayList<Depty> deptyList, Integer empid) {
        Empy empy = new Empy();
        if (empid != null) {
            empy = empyService.get(empid);
        }
        List<Depty> listDB = deptyService.list();
        deptyList.addAll(listDB);
        return empy;
    }

    /*void edit(Map<String,Object> map,Integer empid){
        Empy empy = new Empy();
        if (null!=empid){
            empy = empyService.get(empid);
        }
        List<Depty> deptyList = deptyService.list();
        map.put("empy",empy);
        map.put("deptyList",deptyList);

    }*/

    /*ModelAndView edit(Integer empid) {
        Empy empy = new Empy();
        if (null!=empid){
            empy = empyService.get(empid);
        }
        List<Depty> deptyList = deptyService.list();
        ModelAndView mv = new ModelAndView();
        mv.addObject("deptyList", deptyList);
        mv.addObject("empy", empy);
        mv.setViewName("empy/edit");
        return mv;
    }*/

    /*Empy edit(Integer empid) {
        if (null != empid) {
            return empyService.get(empid);
        } else {
            return new Empy();
        }

    }*/


    @RequestMapping("update")
    String update(Empy empy) {
        if (empy.getEmpid() != null) {
            empyService.update(empy);
        } else {
            empyService.save(empy);
        }
        return "redirect:list";
    }

    @RequestMapping("delete")
    String delete(int empid) {
        empyService.delete(empid);
        return "redirect:list";
    }

    @RequestMapping("deleteBatch")
    String deleteBatch(Integer[] empids) {
        empyService.deleteBatch(empids);
        return "redirect:list";
    }
}