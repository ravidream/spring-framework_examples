package com.test.spring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

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

	public List<Employee> getAllEmployees() {
		return template.query("select * from employee", new ResultSetExtractor<List<Employee>>() {
			@Override
			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {

				List<Employee> list = new ArrayList<Employee>();
				while (rs.next()) {
					Employee employee = new Employee();
					employee.setId(rs.getInt(1));
					employee.setName(rs.getString(2));
					employee.setSalary(rs.getInt(3));
					list.add(employee);
				}
				return list;
			}
		});
	}
}
