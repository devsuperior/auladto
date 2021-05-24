package com.devsuperior.auladto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.auladto.dto.UserDTO;
import com.devsuperior.auladto.services.DepartmentService;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {

	@Autowired
	private DepartmentService service;
	
	@GetMapping(value = "/{id}/users")
	public ResponseEntity<List<UserDTO>> findUsersFromDepartment(@PathVariable Long id) {
		List<UserDTO> list = service.findUsersFromDepartment(id);	
		return ResponseEntity.ok().body(list);
	}
}
