package com.example.thai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.thai.Service.TinDangService;
import com.example.thai.entity.TinDang;

import java.util.Map;


@Controller
public class AdminController {

	@Autowired
	private TinDangService tinDangService;
	@GetMapping("/login")
	public String login(Model model)
	{
		
		return "login";
	}

	//Trang admin/home
		@RequestMapping(value = { "/admin/home" })
		public String indexAdmin(ModelMap model) {
			Authentication auth = SecurityContextHolder.getContext().getAuthentication(); 
			UserDetails userPrincipal = (UserDetails)auth.getPrincipal(); 
			System.out.println(userPrincipal.getUsername());
			List<Map<String,Object>> listtin = tinDangService.getDSTinDang();
			
			model.addAttribute("userName", "Welcome "+ userPrincipal.getUsername());
			model.addAttribute("listtin",listtin);
			
			return "admin/home";
		}
    @GetMapping(value = { "/accountInfo" })
    public String accountInfo(Model model) {
 
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        System.out.println(userDetails.getPassword());
        System.out.println(userDetails.getUsername());
        System.out.println(userDetails.isEnabled());
 
        model.addAttribute("userDetails", userDetails);
        return "accountInfo";
    }
}
