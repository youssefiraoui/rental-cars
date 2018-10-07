package com.zanzi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.zanzi.entities.Offre;

@RepositoryRestResource
@CrossOrigin
public interface OffreRepository extends JpaRepository<Offre, Long> {

}
