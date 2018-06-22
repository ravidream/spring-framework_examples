package com.test.spring;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import java.util.*;

/**
 * 
 * @author Ravi Thapa
 *
 */
public class EmployeeDao {
	NamedParameterJdbcTemplate template;

	public EmployeeDao(NamedParameterJdbcTemplate template) {
		this.template = template;
	}

	public void save(Employee employee) {
		String query = "insert into employee values (:ID,:NAME,:AGE)";

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ID", employee.getId());
		map.put("NAME", employee.getName());
		map.put("AGE", employee.getAge());

		template.execute(query, map, new PreparedStatementCallback() {
			@Override
			public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				return ps.executeUpdate();
			}
		});
	}
}