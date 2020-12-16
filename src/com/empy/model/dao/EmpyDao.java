package com.empy.model.dao;

import com.empy.bean.Empy;
import com.util.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpyDao {
    int deleteByPrimaryKey(Integer empid);

    int deleteBatch(Integer[] empids);

    int insert(Empy record);

    int insertSelective(Empy record);

    Empy selectByPrimaryKey(Integer empid);

    List<Empy> selectAll(@Param("empy") Empy empy,@Param("page") Page page);

    int SelectRecord(@Param("empy")Empy record);

    Empy selectOne(Empy record);

    int updateByPrimaryKeySelective(Empy record);

    int updateByPrimaryKey(Empy record);

    int updateSetDeptnoNull(Integer deptno);
}