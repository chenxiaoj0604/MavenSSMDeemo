package com.dx.tools.dao;

import com.dx.tools.entity.Student;

import java.util.List;

/**
 * Created by windows on 2018-03-07.
 */
public interface IStudentDao {

    //查看所有学生
    List<Student> queryallStudents();

    //插入一条学生信息
    int insertStudent(Student student);

    //删除一条学生信息(根据id)
    int deleteStudentById(Integer id);

    //修改一条学生信息
    int updateStudent(Student student);
}
