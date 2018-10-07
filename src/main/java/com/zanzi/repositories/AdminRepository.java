package com.zanzi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.zanzi.entities.Admin;

@RepositoryRestResource
@CrossOrigin
public interface AdminRepository extends JpaRepository<Admin, Long> {

}
