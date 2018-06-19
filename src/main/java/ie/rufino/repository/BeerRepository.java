package ie.rufino.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ie.rufino.entity.BeerEntity;

public class BeerRepository {

	private final EntityManagerFactory entityManagerFactory;
	private final EntityManager entityManager;
	
	public BeerRepository(){
		
		this.entityManagerFactory = Persistence.createEntityManagerFactory("persistence_unit_db_beerapp");
		this.entityManager = this.entityManagerFactory.createEntityManager();
	}
	
	@SuppressWarnings("unchecked")
	public List<BeerEntity> randomBeer(){
		List<BeerEntity> beerList = this.entityManager.createQuery("SELECT p FROM BeerEntity p ORDER BY RAND()").getResultList();
		return  beerList;
	}
	
}
