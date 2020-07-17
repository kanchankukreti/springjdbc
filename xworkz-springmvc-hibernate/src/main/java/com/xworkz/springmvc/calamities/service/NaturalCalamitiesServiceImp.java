package com.xworkz.springmvc.calamities.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.springmvc.calamities.dao.NaturalCalamitiesDAO;
import com.xworkz.springmvc.calamities.dto.NaturalCalamitiesDTO;

@Component
public class NaturalCalamitiesServiceImp implements NaturalCalamitiesService {

	@Autowired
	private NaturalCalamitiesDAO dao;

	public NaturalCalamitiesServiceImp() {
		System.out.println("Created /t" + this.getClass().getSimpleName());
	}

	public int validateAndSave(NaturalCalamitiesDTO dto) {
		System.out.println("invoke: validateAndSave method:" + dto);
		int isValid = 1;
		try {
			if (dto != null) {
				System.out.println("Started validation... ");

				String place = dto.getPlace();
				if (place != null && !place.isEmpty()) {
					System.out.println("place of Natural Calamity is valid");
				} else {
					System.out.println("Place of NC is not valid");
					isValid = 1;
				}
				String type = dto.getCalamityType();
				if (isValid == 0 && type != null && !type.isEmpty()) {
					System.out.println("type of Natural Calamity is valid");
				} else {
					System.out.println("type of NC is not valid");
					isValid = 1;
				}
				String date = dto.getDate();
				if (isValid == 0 && date != null && !date.isEmpty()) {
					System.out.println("date of Natural Calamity is valid");
				} else {
					System.out.println("date of NC is not valid");
					isValid = 1;
				}

				String area = dto.getArea();
				if (isValid == 0 && area != null && !area.isEmpty()) {
					System.out.println("place of Natural Calamity is valid");
				} else {
					System.out.println("Place of NC is not valid");
					isValid = 1;
				}
			}

			if (isValid == 0) {
				System.out.println("data is valid and can save fields");
				dao.validateandcreate(dto);

				return isValid;
			}
			System.out.println("End of the validateAndSave method" + dto);
		} catch (Exception e) {
			System.out.println("Exception in validateAndSave method" + e.getMessage());
		}
		return isValid;
	}
}
