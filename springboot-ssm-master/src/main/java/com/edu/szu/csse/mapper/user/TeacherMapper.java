package com.edu.szu.csse.mapper.user;

import com.edu.szu.csse.bean.Teacher;
import com.edu.szu.csse.bean.TeacherExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * TeacherMapper
 *
 * @author CS
 * @date 2020/6/6
 */


@Mapper
public interface TeacherMapper {

    List<Teacher> selectAllTeacher();

    int deleteByExample(TeacherExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    List<Teacher> selectByExample(TeacherExample example);

    Teacher selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByExample(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);


}
