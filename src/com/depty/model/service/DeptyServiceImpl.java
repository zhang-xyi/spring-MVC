package com.depty.model.service;

import com.depty.bean.Depty;
import com.depty.model.dao.DeptyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: SSM-springMVC
 * @Package: com.depty.model.service
 * @Description: java类作用描述
 * @Author: 张子凡
 * @CreateDate: 2020/12/14 9:13
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Service
public class DeptyServiceImpl implements DeptyService {

    @Autowired
    private DeptyDao deptyDao;

    @Override
    public List<Depty> list() {
        return deptyDao.selectAll();
    }

    @Override
    public List<Depty> list(Depty depty) {
        return deptyDao.selectAllByDepty(depty);
    }

    @Override
    public Depty get(int deptno) {
        return deptyDao.selectByPrimaryKey(deptno);
    }

    @Override
    public int delete(int deptno) {
        return deptyDao.deleteByPrimaryKey(deptno);
    }

    @Override
    public int delete(Integer[] deptnos) {
        return deptyDao.deleteBatch(deptnos);
    }

    @Override
    public int save(Depty depty) {
        return deptyDao.insert(depty);
    }

    @Override
    public int update(Depty depty) {
        return deptyDao.updateByPrimaryKey(depty);
    }



}
