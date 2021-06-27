/*
 * package db2.juhh.PizzaProj.dao;
 * 
 * import javax.persistence.EntityManager; import
 * javax.persistence.EntityManagerFactory; import javax.persistence.Persistence;
 * 
 * import db2.juhh.PizzaProj.model.Ingrediente;
 * 
 * public class Ingrediente_DAO {
 * 
 * private static EntityManagerFactory entManFac =
 * Persistence.createEntityManagerFactory("bd2_PU"); private static
 * EntityManager entMan = entManFac.createEntityManager();
 * 
 * 
 * //FIND
 * 
 * Pizza pizza = entMan.find(Pizza.class, 4);
 * System.out.println("Sabor da pizza: " + pizza.getSabor());
 * System.out.println("Borda da pizza: " + pizza.getBorda());
 * System.out.println("Tamanho da pizza: " + pizza.getTamanho());
 * 
 * 
 * 
 * //INSERT
 * 
 * Pizza pizza = new Pizza(); pizza.setSabor("Brocolis");
 * pizza.setBorda("Cheddar"); pizza.setTamanho("Media");
 * 
 * entMan.getTransaction().begin(); entMan.persist(pizza);
 * entMan.getTransaction().commit();
 * 
 * 
 * 
 * //DELETE //Pizza pizza = entMan.find(Pizza.class, 1);
 * //entMan.getTransaction().begin(); //entMan.remove(pizza);
 * //entMan.getTransaction().commit();
 * 
 * Public void update(Ingrediente ingrediente) { //MODIFY Ingrediente
 * this.ingrediente = new Ingrediente(); this.ingrediente.setNome("Mussarela");
 * 
 * entMan.getTransaction().begin(); entMan.merge(pizza);
 * entMan.getTransaction().commit(); } //entMan.close(); //entManFac.close();
 * 
 * 
 * 
 * }
 */
