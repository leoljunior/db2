package db2.juhh.PizzaProj.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import db2.juhh.PizzaProj.model.Pizza;

public class Pizza_DAO {

	private static EntityManagerFactory entManFac = Persistence.createEntityManagerFactory("bd2_PU");
	private static EntityManager entMan = entManFac.createEntityManager();
	
	
		//FIND
		
		public void find(Pizza pizza, int num) {
		 pizza = entMan.find(Pizza.class, num);
		 System.out.println("");
		 System.out.println("*****************************");
		 System.out.println("A pizza nº " + num + " é de: ");
		 System.out.println("Sabor: " + pizza.getSabor());
		 System.out.println("Borda: " + pizza.getBorda());
		 System.out.println("Tamanho: " + pizza.getTamanho());
		 System.out.println("*****************************");
		 System.out.println("");
		}
		
		
		//INSERT
		
		
		 public void insert(Pizza pizza) { 
		 entMan.getTransaction().begin(); 
		 entMan.persist(pizza);
		 entMan.getTransaction().commit();
		 System.out.println("");
		 System.out.println("*****************************");
		 System.out.println("Pizza criada com sucesso!!");
		 System.out.println("*****************************");
		 System.out.println("");
		 }
		 
		
		
		//DELETE
		public void delete(Pizza pizza, int num) {
		pizza = entMan.find(Pizza.class, num); 
		entMan.getTransaction().begin();
		entMan.remove(pizza);
		entMan.getTransaction().commit();
		System.out.println("");
		System.out.println("*****************************");
		System.out.println("Pizza excluída com sucesso!!");
		System.out.println("*****************************");
		System.out.println("");
		}		
		
		//MODIFY
		public void modify(Pizza pizza) {		  
		entMan.getTransaction().begin(); 
		entMan.merge(pizza);
		entMan.getTransaction().commit();
		System.out.println("");
		System.out.println("*****************************");
		System.out.println("Pizza Modificada com sucesso!!");
		System.out.println("*****************************");
		System.out.println("");
		}

		//entMan.close();
		//entManFac.close();

}
