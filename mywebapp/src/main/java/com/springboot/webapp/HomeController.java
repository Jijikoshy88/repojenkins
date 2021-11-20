package com.springboot.webapp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller 

public class HomeController {
	@RequestMapping("home")
	public String home()
	{
		System.out.println("hi");
		return "home.jsp";
	}

}
