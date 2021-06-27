package db2.juhh.PizzaProj.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import db2.juhh.PizzaProj.model.Pizza;

public class Pizza_DAO {

	private static EntityManagerFactory entManFac = Persistence.createEntityManagerFactory("bd2_PU");
	private static EntityManager entMan = entManFac.createEntityManager();
	
	
		//FIND
		/*
		 * Pizza pizza = entMan.find(Pizza.class, 4);
		 * System.out.println("Sabor da pizza: " + pizza.getSabor());
		 * System.out.println("Borda da pizza: " + pizza.getBorda());
		 * System.out.println("Tamanho da pizza: " + pizza.getTamanho());
		 */
		
		
		//INSERT
		
		
		 public void insert(Pizza pizza) { 
		 entMan.getTransaction().begin(); 
		 entMan.persist(pizza);
		 entMan.getTransaction().commit();
		 }
		 
		
		
		//DELETE
		public void delete(Pizza pizza, int num) {
		pizza = entMan.find(Pizza.class, num); 
		entMan.getTransaction().begin();
		entMan.remove(pizza);
		entMan.getTransaction().commit();
		}		
		
		//MODIFY
		/*
		 * Pizza pizza = new Pizza(); pizza.setId(3); pizza.setSabor("A Moda");
		 * pizza.setBorda("Nenhuum"); pizza.setTamanho("Familia");
		 * 
		 * entMan.getTransaction().begin(); entMan.merge(pizza);
		 * entMan.getTransaction().commit(); }
		 */
		//entMan.close();
		//entManFac.close();
		
	}
	

