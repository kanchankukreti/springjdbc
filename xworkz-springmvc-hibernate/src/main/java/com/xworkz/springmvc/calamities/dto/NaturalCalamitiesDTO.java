package com.xworkz.springmvc.calamities.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="Natural_Calamities_Info")
public class NaturalCalamitiesDTO{
	@Id
	@Column(name="S_ID")
	@GenericGenerator(name="XWORKZ",strategy="increment")
	@GeneratedValue(generator="XWORKZ")
	private Integer sid;
	@Column(name="Place")
	private String place;
	@Column(name="Date")
	private String date;
	@Column(name="Captured_By")
	private String capturedBy;
	@Column(name="Calamity_Type")
	private String calamityType;
	@Column(name="Area")
	private String area;
	@Column(name="Average_Loss")
	private int avgLoss;
	@Column(name="No_Of_Deaths")
	private int noOfDeaths;
	@Column(name="No_Of_Injured")
	private int noOfInjured;
	
	public NaturalCalamitiesDTO() {
		System.out.println("Invoke /t"+this.getClass().getSimpleName());
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCapturedBy() {
		return capturedBy;
	}

	public void setCapturedBy(String capturedBy) {
		this.capturedBy = capturedBy;
	}

	public String getCalamityType() {
		return calamityType;
	}

	public void setCalamityType(String calamityType) {
		this.calamityType = calamityType;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getAvgLoss() {
		return avgLoss;
	}

	public void setAvgLoss(int avgLoss) {
		this.avgLoss = avgLoss;
	}

	public int getNoOfDeaths() {
		return noOfDeaths;
	}

	public void setNoOfDeaths(int noOfDeaths) {
		this.noOfDeaths = noOfDeaths;
	}

	public int getNoOfInjured() {
		return noOfInjured;
	}

	public void setNoOfInjured(int noOfInjured) {
		this.noOfInjured = noOfInjured;
	}
	public NaturalCalamitiesDTO(String place, String date, String capturedBy, String calamityType, String area,
			int avgLoss, int noOfDeaths, int noOfInjured) {
		super();
		this.place = place;
		this.date = date;
		this.capturedBy = capturedBy;
		this.calamityType = calamityType;
		this.area = area;
		this.avgLoss = avgLoss;
		this.noOfDeaths = noOfDeaths;
		this.noOfInjured = noOfInjured;
	}

	@Override
	public String toString() {
		return "NaturalCalamitiesDTO [place=" + place + ", date=" + date + ", capturedBy=" + capturedBy
				+ ", calamityType=" + calamityType + ", area=" + area + ", avgLoss=" + avgLoss + ", noOfDeaths="
				+ noOfDeaths + ", noOfInjured=" + noOfInjured + "]";
	}
	

}
