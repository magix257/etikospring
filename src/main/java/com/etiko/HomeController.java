package com.etiko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.etiko.model.Zlecenia;


@Controller
public class HomeController {
	
	
	@Autowired
	Zleceniarepo repo;
	
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	
	@GetMapping("getZlecenia")
	public String getStudents(Model m)
	{
		
		m.addAttribute("result", repo.findAll());
		
		return "result";
	}
	
	
	@RequestMapping("addZlecenie")
	public String addStudent(@RequestParam int id, @ModelAttribute Zlecenia z, Model m) {
		
		
		repo.save(z);
		m.addAttribute("result", repo.findById(id));
		
		
		return "result";
	}
	
	
	
	

}
