/**
 * 
 */
package com.ensco.training.java.spring.mysqlfoundry.dao.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ensco.training.java.spring.mysqlfoundry.dao.ABaseDAO;

/**
 * @author sharma.shriram
 * 
 */
@Repository
@Qualifier("namesDAO")
public class NamesDAO extends ABaseDAO {

	private static String getUserByFirstName = "SELECT FullName FROM names WHERE FirstName = ?";

	public String getFullName(String firstName) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		return jdbcTemplate.queryForList(getUserByFirstName, new Object[] { firstName }).get(0).get("FullName")
				.toString();
	}
}
