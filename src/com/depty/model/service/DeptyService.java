package com.depty.model.service;

import com.depty.bean.Depty;

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
public interface DeptyService {
    List<Depty> list();

    List<Depty> list(Depty depty);

    Depty get(int deptno);

    int delete(int deptno);

    int delete(Integer[] deptnos);

    int save(Depty depty);

    int update(Depty depty);
}
