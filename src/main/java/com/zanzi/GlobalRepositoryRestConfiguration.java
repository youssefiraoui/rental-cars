package com.zanzi;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import com.zanzi.entities.Image;
import com.zanzi.entities.Voiture;

@Configuration
public class GlobalRepositoryRestConfiguration extends RepositoryRestConfigurerAdapter {
 @Override
public void configureRepositoryRestConfiguration(RepositoryRestConfiguration repo) {
	 repo.setReturnBodyOnCreate(true);
		repo.setReturnBodyOnUpdate(true);
		repo.exposeIdsFor(Voiture.class,Image.class);
		repo.getCorsRegistry()
		.addMapping("/**")
		.allowedOrigins("http://localhost:4200/")
		.allowedHeaders("*")
		.allowedMethods("OPTION","HEAD","GET","POST","PATCH");
		
}
	
}
