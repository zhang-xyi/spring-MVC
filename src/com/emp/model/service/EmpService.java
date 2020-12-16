package com.emp.model.service;

import com.emp.bean.Emp;

import java.util.List;

/**
 * @ProjectName: SSM-springMVC
 * @Package: com.emp.model.service
 * @Description: java类作用描述
 * @Author: 张子凡
 * @CreateDate: 2020/12/8 16:04
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public interface EmpService {
    int delete(int empno);

    int save(Emp emp);

    int insertSelective(Emp emp);

    Emp get(int empno);

    List<Emp> list();

    int updateByPrimaryKeySelective(Emp emp);

    int update(Emp emp);
}
