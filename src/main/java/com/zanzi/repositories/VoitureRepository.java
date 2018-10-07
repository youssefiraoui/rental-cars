package com.zanzi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.zanzi.entities.Voiture;

@RepositoryRestResource
@CrossOrigin
public interface VoitureRepository extends JpaRepository<Voiture, Long>{
	
	
	//@Query("select v from Voiture v, Image i where v.id=i.voiture.id")
	@Query("select v from Voiture v inner join Image i on v.id=i.voiture.id")
	public List<Voiture> findAllVoitures();

}
