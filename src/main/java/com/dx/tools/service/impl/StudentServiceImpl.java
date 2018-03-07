package com.dx.tools.service.impl;

import com.dx.tools.dao.IStudentDao;
import com.dx.tools.entity.Student;
import com.dx.tools.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by windows on 2018-03-07.
 */
@Service
public class StudentServiceImpl implements IStudentService{

    @Autowired
    IStudentDao studentDao;

    //查看所有学生
    public List<Student> getallStudents(){
        return studentDao.queryallStudents();
    }

    //插入一条学生信息
    public int addStudent(Student student){
        return studentDao.insertStudent(student);
    }

    //删除一条学生信息
    public int deleteStudentById(Integer id){
        return studentDao.deleteStudentById(id);
    }

    //修改一条学生信息
    public int updateStudent(Student student){
        return studentDao.updateStudent(student);
    }
}
