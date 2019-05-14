package com.ankita.dao;

import org.springframework.data.repository.CrudRepository;

import com.ankita.student.StudentBean;

public interface StudentRepo extends CrudRepository<StudentBean,Integer>{
	

}
