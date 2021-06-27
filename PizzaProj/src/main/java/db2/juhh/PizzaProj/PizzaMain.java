package db2.juhh.PizzaProj;

import java.util.Scanner;

import db2.juhh.PizzaProj.dao.Pizza_DAO;
import db2.juhh.PizzaProj.model.Pizza;

public class PizzaMain {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		

		int opc = 0;

		do {
			System.out.println("BEM VINDO A PIZZARIA");
			System.out.println("Selecione uma opção:");
			System.out.println("1........Criar pizza");
			System.out.println("2........Ver uma pizza");
			System.out.println("3........Modificar uma pizza");
			System.out.println("4........Excluir uma pizza");
			System.out.println("9........Sair");

			opc = scn.nextInt();
			scn.nextLine();
			System.out.println("");

			if (opc == 1) {
				Pizza pizza01 = new Pizza();
				System.out.println("Crie sua pizza: ");

				System.out.println("Digite o sabor da pizza: ");
				String sabor = scn.nextLine();
				pizza01.setSabor(sabor);

				System.out.println("Digite a borda da pizza: ");
				String borda = scn.nextLine();
				pizza01.setBorda(borda);

				System.out.println("Digite o tamanho da pizza: ");
				String tamanho = scn.nextLine();
				pizza01.setTamanho(tamanho);

				Pizza_DAO dao = new Pizza_DAO();
				dao.insert(pizza01);
			}
			if (opc == 2) {
				Pizza pizza01 = new Pizza();
				System.out.println("Número da pizza que você quer ver: ");
				int num = scn.nextInt();
				Pizza_DAO dao = new Pizza_DAO();
				dao.find(pizza01, num);

			}
			if (opc == 3) {
				Pizza pizza01 = new Pizza();
				System.out.println("Número da pizza que você quer modificar: ");
				int num = scn.nextInt();
				scn.nextLine();
				pizza01.setId(num);

				System.out.println("Digite o sabor da pizza: ");
				String sabor = scn.nextLine();
				pizza01.setSabor(sabor);

				System.out.println("Digite a borda da pizza: ");
				String borda = scn.nextLine();
				pizza01.setBorda(borda);

				System.out.println("Digite o tamanho da pizza: ");
				String tamanho = scn.nextLine();
				pizza01.setTamanho(tamanho);

				Pizza_DAO dao = new Pizza_DAO();
				dao.modify(pizza01);
			}
			if (opc == 4) {
				Pizza pizza01 = new Pizza();
				System.out.println("Numero da pizza para deletar: ");
				int num = scn.nextInt();
				Pizza_DAO dao = new Pizza_DAO();
				dao.delete(pizza01, num);
			}
			if (opc == 9) {
				System.out.println("Saindo do sistema!!");

			}

		} while (opc != 9);

	}
}
