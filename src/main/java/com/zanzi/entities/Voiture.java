package com.zanzi.entities;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.xpath;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Voiture {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String description;
	private String couleur;
	private String boiteAvitesse;
	private String carburant;
	private Double prix;
	@OneToMany(mappedBy="voiture",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private Collection<Image> images;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public String getBoiteAvitesse() {
		return boiteAvitesse;
	}
	public void setBoiteAvitesse(String boiteAvitesse) {
		this.boiteAvitesse = boiteAvitesse;
	}
	public String getCarburant() {
		return carburant;
	}
	public void setCarburant(String carburant) {
		this.carburant = carburant;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	public Collection<Image> getImages() {
		return images;
	}
	public void setImages(Collection<Image> images) {
		this.images = images;
	}
	public Voiture(String nom, String description, String couleur, String boiteAvitesse, String carburant,
			Double prix) {
		super();
		this.nom = nom;
		this.description = description;
		this.couleur = couleur;
		this.boiteAvitesse = boiteAvitesse;
		this.carburant = carburant;
		this.prix = prix;
	}
	public Voiture() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		String test="";
		images.forEach(c->{
			System.out.println(c.getChemin());
		});
		return "Voiture [id=" + id + ", nom=" + nom + ", description=" + description + ", couleur=" + couleur
				+ ", boiteAvitesse=" + boiteAvitesse + ", carburant=" + carburant + ", prix=" + prix + ", images="
				+ images.size() + "]";
	}
	
	
}
