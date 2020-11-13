package com;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dao.ContactRepository;
import com.entities.Contact;

@SpringBootApplication
public class ContactsApiRestBackEndApplication implements CommandLineRunner {

	@Autowired
	private ContactRepository contactRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ContactsApiRestBackEndApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		
		
		  contactRepository.save(new
		  Contact("Leslie","Wayne",df.parse("12/01/1998"),"hello@hotmil.fr",066655,
		  "hello.jpeg")); contactRepository.save(new
		  Contact("Margot","Elise",df.parse("12/01/1998"),"lucet@hotmil.fr",5688,
		  "photo.jpeg")); contactRepository.save(new
		  Contact("Klein","Walter",df.parse("12/01/1998"),"walter@hotmil.fr",5659,
		  "line.jpeg"));
		 
		contactRepository.findAll().forEach(c->{System.out.println(c.getNom());});
		
	}

}
