package com.xworkz.springBootDemo.peerproject.service;

import java.util.Objects;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.xworkz.springBootDemo.peerproject.dao.peerRepo;
import com.xworkz.springBootDemo.peerproject.entity.peerEntity;


public class peerServiceImp implements peerService {
	@Autowired
	peerRepo peerRepository;

	private static final Logger logger = Logger.getLogger(peerServiceImp.class);

	
		@Override
		public peerEntity saveMessage(peerEntity peerEntity) {
			peerEntity fetchedpeerEntity = null;
			try {
				logger.info("Started: saveMessage from MessageServiceImpl ");
				if (Objects.nonNull(peerEntity)) {
					
					logger.info("-------------------Saving entity into message_table "+peerEntity);
					peerRepository.save(peerEntity);
			return fetchedpeerEntity;
		}
		

			
		} catch (Exception e) {
			logger.error("Exception in saveMessage ", e);
			System.out.println(e);
		}
		logger.info("Ended: saveMessage from MessageServiceImpl");
		return peerEntity;
	}

	
}


