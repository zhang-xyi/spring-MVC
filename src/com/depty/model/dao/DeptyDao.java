package com.depty.model.dao;

import com.depty.bean.Depty;

import java.util.List;

public interface DeptyDao {
    int deleteByPrimaryKey(Integer deptno);

    int deleteBatch(Integer[] deptnos);

    int insert(Depty record);

    int insertSelective(Depty record);

    Depty selectByPrimaryKey(Integer deptno);

    List<Depty> selectAll();

    List<Depty> selectAllByDepty(Depty depty);

    int updateByPrimaryKeySelective(Depty record);

    int updateByPrimaryKey(Depty record);
}