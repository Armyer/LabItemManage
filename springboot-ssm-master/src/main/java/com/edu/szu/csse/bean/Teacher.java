package com.edu.szu.csse.bean;

import java.util.Date;

/**
 * Teacher
 *
 * @author CS
 * @date 2020/6/6
 */
public class Teacher {
    public Integer id;
    public String teacher_id;
    public String teacher_name;
    public String mobile;
    public String email;
    private Date create_time;
    private String status;

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", teacher_id='" + teacher_id + '\'' +
                ", teacher_name='" + teacher_name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", create_time=" + create_time +
                ", status='" + status + '\'' +
                '}';
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(String teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getTeacher_name() {
        return teacher_name;
    }

    public void setTeacher_name(String teacher_name) {
        this.teacher_name = teacher_name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatetime() {
        return create_time;
    }

    public void setCreatetime(Date createtime) {
        this.create_time = create_time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
