package db2.juhh.PizzaProj;

import java.util.Scanner;

import db2.juhh.PizzaProj.dao.Pizza_DAO;
import db2.juhh.PizzaProj.model.Pizza;

public class PizzaMain {

	public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);			
			Pizza pizza01 = new Pizza();
			
			
		
			
			
			/*System.out.println("Crie sua pizza:");
			
			System.out.println("Digite o sabor da pizza:");
			String sabor = scn.nextLine();
			pizza01.setSabor(sabor);
			
			System.out.println("Digite a borda da pizza:");
			String borda = scn.nextLine();
			pizza01.setBorda(borda);
			
			System.out.println("Digite o tamanho da pizza:");
			String tamanho = scn.nextLine();
			pizza01.setTamanho(tamanho);
			
			Pizza_DAO dao = new Pizza_DAO();
			dao.insert(pizza01);
			
			
			
			System.out.println("Numero da pizza para deletar: ");
			int num = scn.nextInt();
			Pizza_DAO dao = new Pizza_DAO();
			dao.delete(pizza01, num);
			
			
			
			System.out.println("Numeroda da pizza que vo^ce quer ver: ");
			int num = scn.nextInt();
			Pizza_DAO dao = new Pizza_DAO();
			dao.find(pizza01, num);*/
			
			
			System.out.println("numero pizza modificar");
			int num = scn.nextInt();
			scn.nextLine();
			pizza01.setId(num);
			
			System.out.println("Digite o sabor da pizza:");
			String sabor = scn.nextLine();
			pizza01.setSabor(sabor);
			
			System.out.println("Digite a borda da pizza:");
			String borda = scn.nextLine();
			pizza01.setBorda(borda);
			
			System.out.println("Digite o tamanho da pizza:");
			String tamanho = scn.nextLine();
			pizza01.setTamanho(tamanho);
			
			Pizza_DAO dao = new Pizza_DAO();
			dao.modify(pizza01);
			
			
			
			
			
	}		
}




























