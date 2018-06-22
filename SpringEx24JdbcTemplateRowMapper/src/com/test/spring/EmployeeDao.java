package com.test.spring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

/**
 * 
 * @author Ravi Thapa
 *
 */
public class EmployeeDao {
	private JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public List<Employee> getAllEmployeesRowMapper() {
		return template.query("select * from employee", new RowMapper<Employee>() {
			@Override
			public Employee mapRow(ResultSet rs, int rownumber) throws SQLException {
				Employee employee = new Employee();
				employee.setId(rs.getInt(1));
				employee.setName(rs.getString(2));
				employee.setSalary(rs.getInt(3));
				return employee;
			}
		});
	}

}
