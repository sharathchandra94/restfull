package com.hexarest.control;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hexarest.da.Employeedao;
import com.hexarest.mod.Employee;

@RequestMapping("/get")
@RestController
public class EmployeeControl {

	Employeedao dao = new Employeedao();
	static Logger log = Logger.getLogger(EmployeeControl.class.getName());
	
	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public List<Employee> getEmployees() {
		List<Employee> output = dao.dummyEmployees();
		log.info("started employees");
		
		// String json = new Gson().toJson(output);
		return output;

	}

	@RequestMapping(value = "/employees/{id}", method = RequestMethod.GET)
	public Employee getEmployeeById(@PathVariable("id") Integer id) {

		Employee output = dao.getEmployeeById(id);
		// String json = new Gson().toJson(output);

		return output;
	}

	@RequestMapping(value = "/employees", method = RequestMethod.POST)
	public Employee createEmployee(Employee emp) {
		Employee newempl = dao.createEmployee(emp);
		return newempl;
		
	}
	@RequestMapping(value="/employees",method= RequestMethod.DELETE)
		public Employee deleteEmployee(@PathVariable("id") Integer id){
		Employee delemp=dao.deleteEmployee(id);
			return delemp;
	}
	
	

}
