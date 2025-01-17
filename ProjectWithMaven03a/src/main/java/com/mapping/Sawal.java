package com.mapping;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Sawal {

	@Id
	private int sawalId;
	private String sawalDetails;
	
	@OneToMany(mappedBy = "sawal")	
	private List<Jawab> jawab;

	public void setJawab(List<Jawab> jawab) {
		this.jawab = jawab;
	}

	public Sawal(int sawalId, String sawalDetails) {
		super();
		this.sawalId = sawalId;
		this.sawalDetails = sawalDetails;
	}

	public Sawal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSawalId() {
		return sawalId;
	}

	public void setSawalId(int sawalId) {
		this.sawalId = sawalId;
	}

	public String getSawalDetails() {
		return sawalDetails;
	}

	public void setSawalDetails(String sawalDetails) {
		this.sawalDetails = sawalDetails;
	}

	@Override
	public String toString() {
		return "Sawal [sawalId=" + sawalId + ", sawalDetails=" + sawalDetails + "]";
	}

}
