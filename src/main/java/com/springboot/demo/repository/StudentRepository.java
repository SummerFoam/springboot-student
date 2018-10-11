package com.springboot.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.demo.bean.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	public Student queryStudentById(Integer id);

	public int deleteStudentById(Integer id);
	// public int update(Student student);
}
