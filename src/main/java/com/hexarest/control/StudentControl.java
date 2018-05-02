package com.hexarest.control;

import java.util.Collection;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hexarest.da.Studentdao;
import com.hexarest.mod.Student;

@RequestMapping("/get")
@RestController
public class StudentControl {
	Studentdao dao1 =new Studentdao();

	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public  Collection<Student> getAllStudents() {
		Collection<Student> output = dao1.getAllStudents();
		// String json = new Gson().toJson(output);
		return output;

	}
	@RequestMapping(value = "/students/{roll}", method = RequestMethod.GET)
	public  Student getStudentById(@PathVariable("roll") Integer roll) {

		Student output = dao1.getStudentById(roll);
	//	String json = new Gson().toJson(output);

		return output;
	}
	@RequestMapping(value = "/students/{name}", method = RequestMethod.GET)
	public  Student getStudentByName(@PathVariable( "name" )String name) {
		Student newempl = dao1.getStudentByName(name);
		return newempl;

	}
	@RequestMapping(value = "/students/{name}", method = RequestMethod.POST)
	public  Student createStudent(Student stu) {
		Student newempl = dao1.createStudent(stu);
		return newempl;

	}

}
