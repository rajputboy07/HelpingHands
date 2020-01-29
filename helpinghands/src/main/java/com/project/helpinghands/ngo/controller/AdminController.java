package com.project.helpinghands.ngo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.helpinghands.entity.Admin;
import com.project.helpinghands.services.LoginServices;

@RestController
@RequestMapping("/api")
public class AdminController {
@Autowired
LoginServices service;
@PostMapping("/authenticate")
public boolean adminValidation(@RequestBody Admin entity) {
	return service.adminValidation(entity);
}

@PostMapping("/newadmin")
public boolean insertNewCategory(@RequestBody Admin entity) {
	return service.addNewAdmin(entity);
}

}