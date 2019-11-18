package com.etiko;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
	
//	@Autowired
//	Zleceniarepo repo;
	
	@PreAuthorize("hasAuthority('ADMIN')")
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	
	@RequestMapping("login")
	public String login()
	{
		return "login.html";
	}
	@RequestMapping("failure")
	public String failure()
	{
		return "failure.jsp";
	}
	
//	@GetMapping("getZlecenia")
//	public String getStudents(Model m)
//	{
//		
//		m.addAttribute("result", repo.findAll());
//		
//		return "result.jsp";
//	}
//	
//	
//	@RequestMapping("addZlecenie")
//	public String addStudent(@ModelAttribute Zlecenia z, Model m) {
//		
//		
//		repo.save(z);
//		//m.addAttribute("result", repo.findById(Zlecenia.getId()));
//		
//		
//		return "result.jsp";
//	}

}
