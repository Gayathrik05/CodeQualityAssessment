package com.dms.controller;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dms.dao.DoctorDao;
import com.dms.bean.Doctor;

@RestController
@CrossOrigin("http://localhost:4200/")

public class DoctorController {

	@Autowired
	DoctorDao dao;

	@PostMapping("/insert")
	public String performInsert(@RequestBody Doctor emp) {
		dao.save(emp);
		return "Inserted";
		
		
	}

	@PutMapping("/update")
	public String performUpdate(@RequestBody Doctor emp) {
		dao.save(emp);
		return "Updated";
	}

	@DeleteMapping("/delete/{id}")
	public String performDelete(@PathVariable("id") int id) {
		dao.deleteById(id);
		return "Deleted";
	}

	@GetMapping("/view")
	public ArrayList<Doctor> performViewAll() {
		Iterator<Doctor> it = dao.findAll().iterator();
		ArrayList<Doctor> list = new ArrayList<Doctor>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
}
