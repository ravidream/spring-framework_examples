package com.test.spring;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

/**
 * 
 * @author Ravi Thapa
 *
 */
public class EmployeeDao {
	SimpleJdbcTemplate template;

	public EmployeeDao(SimpleJdbcTemplate template) {
		this.template = template;
	}

	public int update(Employee e) {
		String query = "update employee set name=? where id=?";
		return template.update(query, e.getName(), e.getId());

		// String query="update employee set name=?,salary=? where id=?";
		// return template.update(query,e.getName(),e.getSalary(),e.getId());
	}
}
