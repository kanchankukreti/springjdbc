package com.xworkz.springmvc.calamities.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.springmvc.calamities.dto.NaturalCalamitiesDTO;
import com.xworkz.springmvc.calamities.service.NaturalCalamitiesService;

@Component
@RequestMapping("/")
public class XController {
@Autowired
private NaturalCalamitiesService service;
 XController() {
		System.out.println("Created \t"+this.getClass().getSimpleName());
		}
	@RequestMapping(value="/register.odc",method=RequestMethod.POST)
	public String onRegister(NaturalCalamitiesDTO dto,Model model) {
		System.out.println("invoked onRegister method");
		System.out.println("dto");
		
		int valid=this.service.validateAndSave(dto);
		if(valid==0) {
			model.addAttribute("place"+dto.getPlace());
			model.addAttribute("date"+dto.getDate());
			model.addAttribute("type"+dto.getCalamityType());
			model.addAttribute("loss"+dto.getAvgLoss());
			model.addAttribute("injured"+dto.getNoOfInjured());
			model.addAttribute("deaths"+dto.getNoOfDeaths());
			model.addAttribute("capturedBy"+dto.getCapturedBy());
			
		System.out.println("will send response to Success.jsp");
		return "Success";
	}else {
		System.out.println("Data invalid");
		model.addAttribute("Error","data invalid check valid data");
		return "Home";
	}
	
		
		/*@RequestMapping(value="/submit.odc")
	public String onSubmit(@RequestParam String message,@RequestParam String name,Model model) {
		System.out.println("invoked onSubmit");
		System.out.println("name:"+name);
		System.out.println("massage:"+message);
		System.out.println("will send response to Success.jsp");
		 model.addAttribute("show",name);
		return "/Success.jsp";*/
	}
	

}
