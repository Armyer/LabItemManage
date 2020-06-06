package com.edu.szu.csse.service;

import com.edu.szu.csse.bean.Teacher;

import java.util.List;
import java.util.Map;

/**
 * TeacherService
 *
 * @author CS
 * @date 2020/6/6
 */

public interface TeacherService {
    Teacher getTeacher(int id);
    List<Teacher> getTeachers(Map condition);


}
