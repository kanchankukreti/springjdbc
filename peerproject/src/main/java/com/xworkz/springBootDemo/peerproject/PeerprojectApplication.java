package com.xworkz.springBootDemo.peerproject;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PeerprojectApplication {

	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/peerapplication");
		//ApplicationContext context=
				
		SpringApplication.run(PeerprojectApplication.class, args);
		//peerRepo peerRepository=context.getBean(peerRepo.class);
		
		//peerEntity entity=new peerEntity();
		//entity.setName("Kanchan");
	}

}
