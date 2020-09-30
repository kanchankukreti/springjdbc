package com.xworkz.springBootDemo.peerproject.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.log4j.Logger;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="peerProject")
public class peerEntity implements Serializable{
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		private static final Logger logger = Logger.getLogger(peerEntity.class);
		
		@Id
		@GenericGenerator(name="xworkz",strategy = "increment")
		@GeneratedValue(generator ="xworkz")
		
		@Column(name="sid")
		private int sid;
		@Column(name="name")
		private int name;
		@Column(name="massage")
		private int massage;
		
		public peerEntity() {
			logger.info("Created Message Entity");
		}

		public int getSid() {
			return sid;
		}

		public void setSid(int sid) {
			this.sid = sid;
		}

		public int getName() {
			return name;
		}

		public void setName(int name) {
			this.name = name;
		}

		public int getMassage() {
			return massage;
		}

		public void setMassage(int massage) {
			this.massage = massage;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		public static Logger getLogger() {
			return logger;
		}

		@Override
		public String toString() {
			return "peerEntity [sid=" + sid + ", name=" + name + ", massage=" + massage + "]";
		}

}
