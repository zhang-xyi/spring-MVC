package com.emp.controller;

import com.emp.bean.Emp;
import com.emp.model.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @ProjectName: SSM-springMVC
 * @Package: com.emp.controller
 * @Description: java类作用描述
 * @Author: 张子凡
 * @CreateDate: 2020/12/8 16:11
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
@RequestMapping("emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    @RequestMapping("list")
    public List<Emp> list() {
        return empService.list();
    }

    @RequestMapping("delete")
    public String delete(int empno) {
        empService.delete(empno);
        return "redirect:list";

    }

    @RequestMapping("add")
    public void add() {

    }

    @RequestMapping("save")
    public String save(Emp emp) {
        empService.save(emp);
        return "redirect:list";
    }

    @RequestMapping("edit")
    public Emp edit(int empno) {
        System.out.println(empService.get(empno));
        return empService.get(empno);
    }

    @RequestMapping("update")
    public String edit(Emp emp) {
        empService.update(emp);
        return "redirect:list";
    }
}
