package db2.juhh.PizzaProj.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import db2.juhh.PizzaProj.model.PizzaDetalhe;

public class PizzaDetalhe_DAO {

		private static EntityManagerFactory entManFac = Persistence.createEntityManagerFactory("bd2_PU");
		private static EntityManager entMan = entManFac.createEntityManager();
		
		
			//FIND
			
			public void find(PizzaDetalhe pizzaDetail, int num) {
			 pizzaDetail = entMan.find(PizzaDetalhe.class, num);
			 System.out.println("");
			 System.out.println("*****************************");
			 System.out.println("Segue os detalhes da pizza nº " + num + ": ");
			 System.out.println("Data do pedido: " + pizzaDetail.getData());
			 System.out.println("Número do seu pedido: " + pizzaDetail.getNumPedido());
			 System.out.println("Quantidade de pizzas que você pediu: " + pizzaDetail.getQuantidade());
			 System.out.println("Valor da(s) sua(s) pizza(s): " + pizzaDetail.getPreco());
			 System.out.println("*****************************");
			 System.out.println("");
			}
			
			
			//INSERT
			
			
			 public void insert(PizzaDetalhe pizzaDetail) { 
			 entMan.getTransaction().begin(); 
			 entMan.persist(pizzaDetail);
			 entMan.getTransaction().commit();
			 System.out.println("");
			 System.out.println("*****************************");
			 System.out.println("Detalhes da pizza criados com sucesso!!");
			 System.out.println("*****************************");
			 System.out.println("");
			 }
			 
			
			
			//DELETE
			public void delete(PizzaDetalhe pizzaDetail, int num) {
			pizzaDetail = entMan.find(PizzaDetalhe.class, num); 
			entMan.getTransaction().begin();
			entMan.remove(pizzaDetail);
			entMan.getTransaction().commit();
			System.out.println("");
			System.out.println("*****************************");
			System.out.println("Detalhes da pizza excluídos com sucesso!!");
			System.out.println("*****************************");
			System.out.println("");
			}		
			
			//MODIFY
			public void modify(PizzaDetalhe pizzaDetail) {		  
			entMan.getTransaction().begin(); 
			entMan.merge(pizzaDetail);
			entMan.getTransaction().commit();
			System.out.println("");
			System.out.println("*****************************");
			System.out.println("Detalhes da pizza modificados com sucesso!!");
			System.out.println("*****************************");
			System.out.println("");
			}

			//entMan.close();
			//entManFac.close();

	}

	
	

