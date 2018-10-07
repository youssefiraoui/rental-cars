package com.zanzi.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Image {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String chemin;
	@ManyToOne
	private Voiture voiture;
	@ManyToOne
	private Offre offre;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getChemin() {
		return chemin;
	}
	public void setChemin(String chemin) {
		this.chemin = chemin;
	}
	public Voiture getVoiture() {
		return voiture;
	}
	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}
	public Image(String chemin) {
		super();
		this.chemin = chemin;
	}
	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Image [id=" + id + ", chemin=" + chemin + ", voiture=" + voiture + ", offre=" + offre + "]";
	}
	
	
	

}
