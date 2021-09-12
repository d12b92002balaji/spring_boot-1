package com.example.webapp;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class homeController 
{
	@RequestMapping("home")
	public ModelAndView home(Alien alien)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("obj", alien);
		mv.setViewName("home");
		return mv;
	}
}
