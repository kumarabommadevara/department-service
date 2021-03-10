package com.harsha.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harsha.department.domain.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
