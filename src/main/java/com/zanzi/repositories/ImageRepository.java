package com.zanzi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.zanzi.entities.Image;

@RepositoryRestResource
@CrossOrigin
public interface ImageRepository extends JpaRepository<Image, Long> {

}
