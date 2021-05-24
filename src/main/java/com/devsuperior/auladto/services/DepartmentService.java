package com.devsuperior.auladto.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.auladto.dto.UserDTO;
import com.devsuperior.auladto.entities.Department;
import com.devsuperior.auladto.repositories.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository repository;
	
	public List<UserDTO> findUsersFromDepartment(Long id) {
		Department entity = repository.getOne(id);
		return entity.getUsers().stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
	}
}
