package com.ankita.controller;


	

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ankita.dao.StudentRepo;
import com.ankita.student.StudentBean;

import org.springframework.stereotype.Controller;


@Controller
public class StudentController {

	
	
	@Autowired
	StudentRepo repo;
	
	@RequestMapping("/")
	
	public String home()
	{
		return "add.jsp";
	}
	
     @RequestMapping("/addStudent")
	  public String addStudent(StudentBean student) {
	  
	  
	  repo.save(student); 
	  return "add.jsp"; 
	  }
    
	 
@RequestMapping("/search")

public ModelAndView getStudent(@RequestParam("id") int id)

{
	ModelAndView mv=new ModelAndView("showStudent.jsp");

	StudentBean student=repo.findById(id).orElse(new StudentBean());
	mv.addObject("student",student);
    return mv;
}

@RequestMapping("/deleteStudent")
public String deleteStudent(@RequestParam("id") int id) {


    repo.deleteById(id);

   return "delete.jsp"; 
  }




}
