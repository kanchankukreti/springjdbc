package com.xworkz.springBootDemo.peerproject.dao;

import org.springframework.data.repository.CrudRepository;

import com.xworkz.springBootDemo.peerproject.entity.peerEntity;

public interface peerRepo extends CrudRepository<peerEntity, Long>{

}
