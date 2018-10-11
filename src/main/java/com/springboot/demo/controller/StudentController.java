/**
 * Project Name:SpringBootTest
 * File Name:StudentController.java
 * Package Name:com.springboot.demo.controller
 * Date:2018年9月12日下午4:24:52
 * Copyright (c) 2018, summer.zhang@clpsglobal.com All Rights Reserved.
 *
 */
package com.springboot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.bean.Student;
import com.springboot.demo.service.StudentService;

/**
 * ClassName: StudentController <br/>
 * Description: TODO ADD REASON(可选). <br/>
 * <br/>
 * date: 2018年9月12日 下午4:24:52 <br/>
 *
 * @author summer.zhang
 * @version V1.0
 * @since JDK 1.8
 */
@RestController
@CrossOrigin
public class StudentController {
	@Autowired
	private StudentService studentService;

	// 添加 127.0.0.1:8080/springBootTest/stu
	@PostMapping(value = "/stu")
	public Student addStudent(@RequestBody Student student) {

		student = studentService.saveStudent(student);
		return student;
	}

	// 查询所有127.0.0.1:8080/springBootTest/stu
	@GetMapping(value = "/stu")
	// @RequestMapping(method = RequestMethod.GET, value = "/stu")
	public List<Student> findAll() {
		List<Student> list = studentService.queryStudentList();
		return list;
	}

	// 根据Id查询127.0.0.1:8080/springBootTest/stu/1
	@GetMapping(value = "/stu/{id}")
	public Student queryStudentById(@PathVariable("id") Integer id) {
		Student student = studentService.queryStudentById(id);
		return student;
	}

	// 修改 127.0.0.1:8080/springBootTest/stu/1
	@PutMapping(value = "/stu/{id}")
	public Student updateStudent(@RequestBody Student student, @PathVariable("id") Integer id) {
		student.setId(id);
		student = studentService.updateStudent(student);
		return student;
	}

	// 删除127.0.0.1:8080/springBootTest/stu/6
	@DeleteMapping(value = "/stu/{id}")
	public void deleteStudent(@PathVariable("id") Integer id) {
		studentService.delteStudent(id);
	}

}
