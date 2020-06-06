package com.edu.szu.csse.service.impl.user;

import com.edu.szu.csse.bean.Teacher;
import com.edu.szu.csse.bean.TeacherExample;
import com.edu.szu.csse.bean.user.User;
import com.edu.szu.csse.bean.user.UserExample;
import com.edu.szu.csse.mapper.user.AdminMapper;
import com.edu.szu.csse.mapper.user.TeacherMapper;
import com.edu.szu.csse.service.TeacherService;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * TeacherServiceImpl
 *
 * @author CS
 * @date 2020/6/6
 */
@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public Teacher getTeacher(int id) {
        return null;
    }

    @Override
    public List<Teacher> getTeachers(Map condition) {
        TeacherExample teacherExample = new TeacherExample();
        if (StringUtils.isNotBlank(MapUtils.getString(condition, "teacher_id"))) {
            TeacherExample.Criteria createCriteria = teacherExample.createCriteria();
            createCriteria.andTeacherIdLike("%" + MapUtils.getString(condition, "teacher_id") + "%");
        }
        System.out.println("_____________________________________________");

        List<Teacher> list = teacherMapper.selectByExample(teacherExample);

        return list;
    }
}
