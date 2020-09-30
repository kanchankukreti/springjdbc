package com.xworkz.springBootDemo.peerproject.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.springBootDemo.peerproject.service.peerService;
@Component
public class peerDaoImpl implements peerDao {
	@Autowired
    peerService PeerService;

}
