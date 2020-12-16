package com.empy.model.service;

import com.empy.bean.Empy;
import com.util.Page;

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
public interface EmpyService {
    List<Empy> list(Empy empy, Page page);

    Empy get(int empid);

    Empy get(Empy empy);

    int delete(int empid);

    int deleteBatch(Integer[] empids);

    int save(Empy empy);

    int update(Empy empy);

    int update(int deptno);
}
