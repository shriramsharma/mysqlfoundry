/**
 * 
 */
package com.ensco.training.java.spring.mysqlfoundry.dao;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author sharma.shriram
 * 
 */
public abstract class ABaseDAO {

	@Autowired
	protected BasicDataSource dataSource;

}
