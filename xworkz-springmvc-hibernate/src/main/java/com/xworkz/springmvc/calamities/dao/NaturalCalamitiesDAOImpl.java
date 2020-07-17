package com.xworkz.springmvc.calamities.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.springmvc.calamities.dto.NaturalCalamitiesDTO;

@Component
public class NaturalCalamitiesDAOImpl implements NaturalCalamitiesDAO {
	
	public NaturalCalamitiesDAOImpl() {
		System.out.println("invoke /t"+this.getClass().getSimpleName());
	}

	@Autowired
	private SessionFactory factory;
	public void setFactory(SessionFactory factory) {
		this.factory=factory;
	}
	
	
	
	public void validateandcreate(NaturalCalamitiesDTO dto) {
		System.out.println("Started validationAndCreate method /t"+this.getClass().getSimpleName());
		System.out.println(dto);
		Session session=factory.openSession();
		try {
			session.beginTransaction();
			session.save(dto);
			session.getTransaction().commit();
			System.out.println("Inserted successfully");
			System.out.println("End:"+this.getClass().getSimpleName());
		}catch(Exception e) {
			System.out.println(" insert failed");
			session.getTransaction().rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		
		
		
	}


	

}
