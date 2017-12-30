package com.petbook.controller;

import java.util.Date;

import org.hibernate.Session;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.petbook.model.User;
import com.petbook.utils.HibernateUtil;

@RestController
@RequestMapping("/api/ptb")
public class LoginControllerImpl implements LoginController{

	@RequestMapping(value = "/signup", method = RequestMethod.POST, produces = "application/json")
	public User signUp() {
		User jiggii = new User("jigyashamarodia@gmail.com", "Jiiggiii","8800890565",false, new Date());
        jiggii.setCreatedBy("subrat");
        return jiggii;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json")
	public User login() {
		User jiggii = new User("subrat.me@gmail.com", "Subrat","8800890565",false, new Date());
        jiggii.setCreatedBy("subrat");
		return jiggii;
	}

	@RequestMapping(value = "/validate", method = RequestMethod.POST, produces = "application/json")
	public User validateUser() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
 
        User jiggii = new User("jigyashamarodia@gmail.com", "Jiiggiii","8800890565",false, new Date());
        jiggii.setCreatedBy("subrat");
 
        System.out.println("Creating Person: " + jiggii.getName());
        session.persist(jiggii);
 
        session.getTransaction().commit();
        session.close();
    }
    */
}
