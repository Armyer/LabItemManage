package com.edu.szu.csse.controller;

import com.edu.szu.csse.annotation.MyLogAnnotation;
import com.edu.szu.csse.bean.Teacher;
import com.edu.szu.csse.bean.user.User;
import com.edu.szu.csse.service.TeacherService;
import com.edu.szu.csse.utils.DefaultValue;
import com.edu.szu.csse.utils.ValidateCheck;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.collections.MapUtils;
import org.apache.ibatis.annotations.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * TeacherController
 *
 * @author CS
 * @date 2020/6/6
 */

@Controller /** 自动返回的是json格式数据 ***/
@RequestMapping("teacher")
public class TeacherController {
    private static final Logger logger = LoggerFactory.getLogger(TeacherController.class);

    @Autowired
    private TeacherService teacherService;


    /**
     * 分页查询user
     *
     * @param condition
     * @return
     */
    @RequestMapping("getTeachers")
    // @Cacheable(value = "teacgersCache", keyGenerator = "keyGenerator") //
    // 在redis中开启key为findAllTeacher开头的存储空间。key和keyGenerator只能使用一个
    @MyLogAnnotation(operateDescription = "分页查询用户")
    @ResponseBody
    public PageInfo<Teacher> getTeachers(@RequestParam Map condition) {
        int pageNum = 1;
        //测试
        System.out.println("***************************************");
        System.out.println(condition);
        if (ValidateCheck.isNotNull(MapUtils.getString(condition, "pageNum"))) { // 如果不为空的话改变当前页号
            pageNum = Integer.parseInt(MapUtils.getString(condition, "pageNum"));
        }
        int pageSize = DefaultValue.PAGE_SIZE;
        if (ValidateCheck.isNotNull(MapUtils.getString(condition, "pageSize"))) { // 如果不为空的话改变当前页大小
            pageSize = Integer.parseInt(MapUtils.getString(condition, "pageSize"));
        }
        // 开始分页
        PageHelper.startPage(pageNum, pageSize);
        List<Teacher> teachers = new ArrayList<Teacher>();
        try {
            teachers = teacherService.getTeachers(condition);
        } catch (Exception e) {
            logger.error("getTeachers error！", e);
        }
        PageInfo<Teacher> pageInfo = new PageInfo<Teacher>(teachers);
        return pageInfo;
    }

}
