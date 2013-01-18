/**
 * 
 */
package com.ensco.training.java.spring.mysqlfoundry.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ensco.training.java.spring.mysqlfoundry.dao.impl.NamesDAO;
import com.ensco.training.java.spring.mysqlfoundry.services.INamesService;

/**
 * @author sharma.shriram
 * 
 */
@Service
@Qualifier("namesService")
public class NamesService implements INamesService {

	@Autowired
	private NamesDAO namesDAO;

	public String getFullName(String firstName) {
		String name = namesDAO.getFullName(firstName);
		if (name == null)
			name = "";
		return name;
	}

}
