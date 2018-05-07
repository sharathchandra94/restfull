package com.hexarest.control;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hexarest.da.Employeedao;
import com.hexarest.errorresponse.EmployyeErrorResponse;
import com.hexarest.exceptions.EmployeeException;
import com.hexarest.mod.Employee;

@RequestMapping("/get")
@RestController
public class EmployeeControl {

	Employeedao dao = new Employeedao();
	static Logger log = Logger.getLogger(EmployeeControl.class.getName());

	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	// public List<Employee> getEmployees() {
	public ModelAndView getEmployees() {
		List<Employee> output = dao.dummyEmployees();
		log.info("started employees");
		ModelAndView model = new ModelAndView("viewemployees", "employees",
				output);
		// String json = new Gson().toJson(output);
		// return output;
		return model;
	}

	@RequestMapping(value = "/employees/{id}", method = RequestMethod.GET)
	public ResponseEntity<Employee> getEmployeeById(
			@PathVariable("id") Integer id) throws EmployeeException {
		Employee output = dao.getEmployeeById(id);
		if (output == null) {
			throw new EmployeeException("Invalid employee name requested");
		}
		return new ResponseEntity<Employee>(output, HttpStatus.OK);

	}

	@RequestMapping(value = "/employees", method = RequestMethod.POST)
	public Employee createEmployee(Employee emp) {
		Employee newempl = dao.createEmployee(emp);
		return newempl;
	}

	@RequestMapping(value = "/employees", method = RequestMethod.DELETE)
	public Employee deleteEmployee(@PathVariable("id") Integer id) {
		Employee delemp = dao.deleteEmployee(id);
		return delemp;
	}

}
