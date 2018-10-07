package com.zanzi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import com.zanzi.entities.Voiture;
import com.zanzi.entities.Image;
import com.zanzi.repositories.ImageRepository;
import com.zanzi.repositories.VoitureRepository;

@SpringBootApplication
public class ZanziCarApplication implements CommandLineRunner {
	@Autowired
	VoitureRepository voitureRepository;
	@Autowired
	ImageRepository imageRepository;
	@Autowired
	RepositoryRestConfiguration repositoryRestConfiguration;
	
	public static void main(String[] args) {
		SpringApplication.run(ZanziCarApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		
		repositoryRestConfiguration.exposeIdsFor(Voiture.class,Image.class);
			
		Voiture v1 = voitureRepository.save(new Voiture("dassya", "haja mli7a", "khder", "auto", "lisanse", 50000.00));		

		Voiture v2 = voitureRepository.save(new Voiture("mercediss", "haja mli7ach", "khder-9ahwi", "man", "lisanse", 505400.00));		
        
		Image i1 = new Image("test1.jpg");
		Image i3 = new Image("iraoui.jpg");
		Image i2 = new Image("test2.jpg");
		i1.setVoiture(v1);
		i2.setVoiture(v2);
		i3.setVoiture(v2);
		imageRepository.save(i1);
		imageRepository.save(i2);
		imageRepository.save(i3);
		
		voitureRepository.findAll().forEach(c->{
			System.out.println(c.toString());
		});
		System.out.println("---------------------");
		voitureRepository.findAllVoitures().forEach(c->{
			System.out.println(c.toString());
		});
	
	}
}
