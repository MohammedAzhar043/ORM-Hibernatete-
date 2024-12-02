package com.mapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Jawab {

	@Id
	private int jawabId;
	private String jawabDetails;

	@ManyToOne
	private Sawal sawal;
	
	public Sawal getSawal() {
		return sawal;
	}

	public void setSawal(Sawal sawal) {
		this.sawal = sawal;
	}

	public int getJawabId() {
		return jawabId;
	}

	public void setJawabId(int jawabId) {
		this.jawabId = jawabId;
	}

	public String getJawabDetails() {
		return jawabDetails;
	}

	public void setJawabDetails(String jawabDetails) {
		this.jawabDetails = jawabDetails;
	}

	public Jawab(int jawabId, String jawabDetails) {
		super();
		this.jawabId = jawabId;
		this.jawabDetails = jawabDetails;
	}

	public Jawab() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Jawab [jawabId=" + jawabId + ", jawabDetails=" + jawabDetails + "]";
	}

}
