package com.springboot.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.demo.bean.Student;
import com.springboot.demo.repository.StudentRepository;

@Service
public class StudentService {
	// 添加
	@Autowired
	private StudentRepository studentRepository;

	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	public void delteStudent(Integer id) {
		studentRepository.deleteById(id);
	}

	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	// 根据Id查询
	public Student queryStudentById(Integer id) {
		Student student = studentRepository.queryStudentById(id);
		return student;
	}

	// 查询所有
	public List<Student> queryStudentList() {
		List<Student> list = studentRepository.findAll();
		return list;
	}
}
