package com.harsha.department.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harsha.department.domain.Department;
import com.harsha.department.repository.DepartmentRepository;
@Service
 
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department saveDepartment(Department department)
	{
		return departmentRepository.save(department);
	}
	
	
	public Optional<Department> findById(Long id)
	
	{ 
		return departmentRepository.findById(id);
	}
	
	
}
