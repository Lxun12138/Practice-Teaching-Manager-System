package com.xupt.dao;

import com.xupt.entity.Class;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Auther: liuxun
 * @Date: 2019/3/13
 * @Description:
 */
public interface ClassDao {


    List<Class> queryClassList();

    void deleteClassById(@Param("classId") int classId);

    void insertClass(Class classs);

    Class qyeryClassById(@Param("classId") int classId);

    void updateClass(Class classs);


}
