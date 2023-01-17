package com.flight.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flight.Repository.UserRepository;
import com.flight.UserEntity.User;




@Controller
public class UserController {
	@Autowired
    private UserRepository repo;
	@RequestMapping("/showReg")
	public String showReg()
	{
		return "login/showReg";
		
	}
	@RequestMapping("/saveReg")
	public String saveReg(@ModelAttribute("user")User user)
	{
		repo.save(user);
		return "login/login";
		 
	}
	@RequestMapping("/showloginpage")    
	public String link()
	{
		return "login/login";
		
	}
	@RequestMapping("/verifylogin")
	public String verifyLogin(@RequestParam("emailId")String emailId,@RequestParam("password")String password,ModelMap model)
	{
		
		User user=repo.findByEmail(emailId);
		if(user!=null)
		{
		if(user.getEmail().equals(emailId)&& user.getPassword().equals(password))
		{
		return "login/find_flight";
		}
		else {
			model.addAttribute("error", "invalid user emailid/password");
			return "login/login";
			
		}
		}
		else {
			model.addAttribute("error", "invalid user emailid/password");
			return "login/login";
		}
}
} 