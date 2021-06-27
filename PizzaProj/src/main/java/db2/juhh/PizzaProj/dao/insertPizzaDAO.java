package db2.juhh.PizzaProj.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import db2.juhh.PizzaProj.model.Pizza;

public class insertPizzaDAO {

	private static EntityManagerFactory entManFac = Persistence.createEntityManagerFactory("bd2_PU");
	private static EntityManager entMan = entManFac.createEntityManager();

	
		
		public void insert(Pizza pizza) {
		entMan.getTransaction().begin();
		entMan.persist(pizza);
		entMan.getTransaction().commit();
		}
	}


