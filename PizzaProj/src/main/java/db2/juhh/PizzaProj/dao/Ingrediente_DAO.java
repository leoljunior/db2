package db2.juhh.PizzaProj.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import db2.juhh.PizzaProj.model.Ingrediente;



public class Ingrediente_DAO {

	private static EntityManagerFactory entManFac = Persistence.createEntityManagerFactory("bd2_PU");
	private static EntityManager entMan = entManFac.createEntityManager();
	
	
		//FIND
		
		public void find(Ingrediente ingrediente, String nome) {
		 ingrediente = entMan.find(Ingrediente.class, nome);
		 System.out.println("");
		 System.out.println("*****************************");
		 System.out.println("Nome: " + ingrediente.getNome());
		 System.out.println("Quantidade: " + ingrediente.getQuantidade());
		 System.out.println("Extra: " + ingrediente.getExtra());
		 System.out.println("*****************************");
		 System.out.println("");
		}
		
		
		//INSERT
		
		
		 public void insert(Ingrediente ingrediente) { 
		 entMan.getTransaction().begin(); 
		 entMan.persist(ingrediente);
		 entMan.getTransaction().commit();
		 System.out.println("");
		 System.out.println("*****************************");
		 System.out.println("Ingrediente criado com sucesso!!");
		 System.out.println("*****************************");
		 System.out.println("");
		 }
		 
		
		
		//DELETE
		public void delete(Ingrediente ingrediente, String nome) {
		ingrediente = entMan.find(Ingrediente.class, nome); 
		entMan.getTransaction().begin();
		entMan.remove(ingrediente);
		entMan.getTransaction().commit();
		System.out.println("");
		System.out.println("*****************************");
		System.out.println("Ingrediente excluído com sucesso!!");
		System.out.println("*****************************");
		System.out.println("");
		}		
		
		//MODIFY
		public void modify(Ingrediente ingrediente) {		  
		entMan.getTransaction().begin(); 
		entMan.merge(ingrediente);
		entMan.getTransaction().commit();
		System.out.println("");
		System.out.println("*****************************");
		System.out.println("Ingrediente modificado com sucesso!!");
		System.out.println("*****************************");
		System.out.println("");
		}

		//entMan.close();
		//entManFac.close();

}
