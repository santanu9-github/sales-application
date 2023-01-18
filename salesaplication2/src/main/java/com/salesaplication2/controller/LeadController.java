package com.salesaplication2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.salesaplication2.entity.Lead;
import com.salesaplication2.service.LeadServices;

@RestController
public class LeadController {
@Autowired
private LeadServices leadService;
@GetMapping("/getData")
public List<Lead> getData() {
	List<Lead> lead = leadService.getDataFromDatabase();
	return lead;
}
@PostMapping("/storeData")
public void storeData(@RequestBody Lead lead) {
	leadService.storeData(lead);
}
@DeleteMapping("/delete/{id}")
public void deleteData(@PathVariable("id")long id) {
	leadService.deleteOneData(id);
}
@GetMapping("wservices/api/get/{id}")
public Lead devlopApi(@PathVariable("id")long id) {
	Lead lead = leadService.getAllId(id);
	return lead;
}
}
