package com.xworkz.springBootDemo.peerproject.controller;



import java.util.Objects;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.xworkz.springBootDemo.peerproject.entity.peerEntity;
import com.xworkz.springBootDemo.peerproject.service.peerService;


@Controller
public class PeerController{
	
	private static final Logger logger = Logger.getLogger(PeerController.class);
	
	@Autowired
	peerService peerService;
	
	public PeerController() {
		logger.info("Created "+this.getClass().getSimpleName());
	}

	@RequestMapping("save")
	public String onMessage()
	{
		logger.info("Invoked onMessage");
		return "welcome";
	}
	
	@RequestMapping("Save")
	public String onDisplayMes(peerEntity peerEntity,Model model) {
		logger.debug("Invoked onDisplayMes");

		

		if (Objects.nonNull(peerEntity)) {
			
			peerEntity fetechedMessage= peerService.saveMessage(peerEntity);
			logger.fatal(fetechedMessage);
			
			model.addAttribute("name", peerEntity.getName());
			model.addAttribute("message", peerEntity.getMassage());
		
			
			logger.info("Directing to DisplayMessage.jsp");
			return "deshboard";
			
		} else {
			logger.info("Message not valid");
			model.addAttribute("Error", "Please check which field and enter valid data");
			return "success";
		}
		
		//return "Hello Peer Project and time on server is : "+LocalDateTime.now();
	}
}