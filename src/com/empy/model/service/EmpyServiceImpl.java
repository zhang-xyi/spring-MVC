package com.empy.model.service;

import com.empy.bean.Empy;
import com.empy.model.dao.EmpyDao;
import com.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: SSM-springMVC
 * @Package: com.empy.model.service
 * @Description: java类作用描述
 * @Author: 张子凡
 * @CreateDate: 2020/12/9 20:41
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Service
public class EmpyServiceImpl implements EmpyService {
    @Autowired
    private EmpyDao empyDao;

    @Override
    public List<Empy> list(Empy empy, Page page) {
        int total = empyDao.SelectRecord(empy);
        page.setTotalCount(total);
        return empyDao.selectAll(empy, page);
    }

    @Override
    public Empy get(int empid) {
        return empyDao.selectByPrimaryKey(empid);
    }

    @Override
    public Empy get(Empy empy) {
        return empyDao.selectOne(empy);
    }

    @Override
    public int delete(int empid) {
        return empyDao.deleteByPrimaryKey(empid);
    }

    @Override
    public int deleteBatch(Integer[] empids) {
        return empyDao.deleteBatch(empids);
    }

    @Override
    public int save(Empy empy) {
        return empyDao.insert(empy);
    }

    @Override
    public int update(Empy empy) {
        return empyDao.updateByPrimaryKey(empy);
    }

    @Override
    public int update(int deptno) {
        return empyDao.updateSetDeptnoNull(deptno);
    }
}
