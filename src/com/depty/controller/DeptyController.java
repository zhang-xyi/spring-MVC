package com.depty.controller;

import com.depty.bean.Depty;
import com.depty.model.service.DeptyService;
import com.empy.model.service.EmpyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ProjectName: SSM-springMVC
 * @Package: com.depty.controller
 * @Description: java类作用描述
 * @Author: 张子凡
 * @CreateDate: 2020/12/14 9:25
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
@RequestMapping("depty")
public class DeptyController {

    @Autowired
    private DeptyService deptyService;

    @Autowired
    private EmpyService empyService;

    @RequestMapping("list")
    List<Depty> list(Depty depty){
        return deptyService.list(depty);
    }

    @RequestMapping("edit")
    Depty edit(Integer deptno){
        if (null !=deptno){
            return deptyService.get(deptno);
        }else {
            return new Depty();
        }
    }

    @RequestMapping("update")
    String update(Depty depty){
        if (depty.getDeptno()!=null){
            deptyService.update(depty);
        }else {
            deptyService.save(depty);
        }
        return "redirect:list";
    }

    @RequestMapping("delete")
    String delete(int deptno){
        empyService.update(deptno);
        deptyService.delete(deptno);
        return "redirect:list";
    }

    @RequestMapping("deleteBatch")
    String deleteBatch(Integer[] deptnos){
        deptyService.delete(deptnos);
        return "redirect:list";
    }

}
