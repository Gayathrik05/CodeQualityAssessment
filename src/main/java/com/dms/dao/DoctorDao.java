package com.dms.dao;

import org.springframework.data.repository.CrudRepository;

import com.dms.bean.Doctor;

public interface DoctorDao extends CrudRepository<Doctor, Integer> {

}
