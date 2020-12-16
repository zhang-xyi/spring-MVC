package com.emp.model.service;

import com.emp.bean.Emp;
import com.emp.model.dao.EmpDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpDao empDao;
    @Override
    public int delete(int empno) {
        return empDao.deleteByPrimaryKey(empno);

    }

    @Override
    public int save(Emp emp) {
        return empDao.insert(emp);
    }

    @Override
    public int insertSelective(Emp emp) {
        return 0;
    }

    @Override
    public Emp get(int empno) {
        return empDao.selectByPrimaryKey(empno);
    }

    @Override
    public List<Emp> list() {
        return empDao.selectAll();
    }

    @Override
    public int updateByPrimaryKeySelective(Emp emp) {
        return 0;
    }

    @Override
    public int update(Emp emp) {
        return empDao.updateByPrimaryKey(emp);
    }
}
