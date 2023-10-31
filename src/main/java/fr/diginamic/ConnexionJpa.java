package fr.diginamic;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class ConnexionJpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		EntityManager em = entityManagerFactory.createEntityManager();

		EntityTransaction transaction = em.getTransaction();
	
		
		Region region = new Region("Test", "007");
		
		/*transaction.begin();
		em.persist(region);
		transaction.commit();*/
		
		TypedQuery<Region> query = em.createQuery("select r from Region r where r.nomRegion = 'Test'", Region.class);

		
		List<Region> queryResult = query.getResultList();
		
		System.out.println(queryResult.size());
		
		for(Region r : queryResult) {
			
			System.out.println(queryResult.size());
			System.out.println(r.toString());
		}
	}

}
