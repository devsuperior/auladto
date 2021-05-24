package com.devsuperior.auladto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.auladto.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
