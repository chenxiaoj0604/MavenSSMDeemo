package com.dx.tools.service;

import com.dx.tools.entity.Student;

import java.util.List;

/**
 * Created by windows on 2018-03-07.
 */
public interface IStudentService {
    //查看所有学生
    List<Student> getallStudents();

    //插入一条学生信息
    int addStudent(Student student);

    //删除一条学生信息
    int deleteStudentById(Integer id);

    //修改一条学生信息
    int updateStudent(Student student);
}
