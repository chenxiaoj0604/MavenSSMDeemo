package com.dx.tools.web;

import com.dx.tools.entity.Student;
import com.dx.tools.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by windows on 2018-03-07.
 */

@Controller
@RequestMapping(value = "/students")
public class StudentController {

    @Autowired
    IStudentService studentService;

    @RequestMapping(value = "/showStudents",method = RequestMethod.GET)
    public String showStudent(HttpServletRequest request){
        HttpSession session = request.getSession();
        List<Student> sList = studentService.getallStudents();
        session.setAttribute("sList",sList);
        return "index";
    }

    @RequestMapping(value = "/addStudent",method = RequestMethod.POST)
    public String addStudent(HttpServletRequest request){
        Student student = new Student();
        student.setName(String.valueOf(request.getParameter("name")));
        student.setAge(Integer.valueOf(request.getParameter("age")));
        studentService.addStudent(student);
        return "redirect:/students/showStudents";
    }

    @RequestMapping(value = "/deleteStudent",method = RequestMethod.GET)
    public String deleteStudent(HttpServletRequest request){
        studentService.deleteStudentById(Integer.valueOf(request.getParameter("id")));
        return "redirect:/students/showStudents";
    }

    @RequestMapping(value = "/updateStudent",method = RequestMethod.POST)
    public String updateStudent(HttpServletRequest request){
        Student student = new Student();
        student.setId(Integer.valueOf(request.getParameter("id")));
        student.setName(String.valueOf(request.getParameter("name")));
        student.setAge(Integer.valueOf(request.getParameter("age")));
        studentService.updateStudent(student);
        return "redirect:/students/showStudents";
    }
}
