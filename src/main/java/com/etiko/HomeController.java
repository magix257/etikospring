package com.etiko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.etiko.model.Student;


@Controller
public class HomeController {
	
	
	@Autowired
	Studentrepo repo;
	
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	
	@GetMapping("getStudents")
	public String getStudents(Model m)
	{
		
		m.addAttribute("result", repo.findAll());
		
		return "result";
	}
	
	
	@RequestMapping("addStudent")
	public String addStudent(@RequestParam int rollno, @ModelAttribute Student s, Model m) {
		
		
		repo.save(s);
		m.addAttribute("result", repo.findById(rollno));
		
		
		return "result";
	}
	
	
	
	

}
