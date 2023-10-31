package fr.diginamic.librairie.application;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.hibernate.internal.build.AllowSysOut;


import fr.diginamic.Region;
import fr.diginamic.librairie.entite.Client;
import fr.diginamic.librairie.entite.Emprunt;
import fr.diginamic.librairie.entite.Livre;

public class Go {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("librairie");
		EntityManager em = entityManagerFactory.createEntityManager();

		Client client1 = new Client();
		
		//EntityTransaction transaction = em.getTransaction();
		Client client = em.find(Client.class, 1);
		
		Livre livre = em.find(Livre.class, 2);
		Emprunt emprunt = em.find(Emprunt.class, 1);
		
		System.out.println(livre.toString());
		//System.out.println(client.toString());
		System.out.println(emprunt.toString());
	
		System.out.println(client.toString());
		
		System.out.println(emprunt.getClient());


	}
	

}
