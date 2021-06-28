package db2.juhh.PizzaProj;

import java.util.Date;
import java.util.Scanner;

import db2.juhh.PizzaProj.dao.PizzaDetalhe_DAO;
import db2.juhh.PizzaProj.model.PizzaDetalhe;



public class DetalhesMain {	

		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);			

			int opc = 0;

			do {
				System.out.println("SEJA BEM VINDO");
				System.out.println("Selecione uma opção:");
				System.out.println("1........Criar detalhes da pizza");
				System.out.println("2........Ver detalhes da pizza");
				System.out.println("3........Modificar os detalhes de uma pizza");
				System.out.println("4........Excluir os detalhes de uma pizza");
				System.out.println("9........Sair");

				opc = scn.nextInt();
				scn.nextLine();
				System.out.println("");

				if (opc == 1) {
					PizzaDetalhe details01 = new PizzaDetalhe();
					System.out.println("Crie os detalhes da sua pizza: ");

					details01.setData(new Date());
					
					System.out.println("Digite a quantidade de pizza: ");
					int quantidade = scn.nextInt();
					scn.nextLine();
					details01.setQuantidade(quantidade);

					System.out.println("Digite o preço da(s) pizza(s): ");
					float preco = scn.nextFloat();
					scn.nextLine();
					details01.setPreco(preco);
					
					PizzaDetalhe_DAO dao = new PizzaDetalhe_DAO();
					dao.insert(details01);
				}
				if (opc == 2) {
					PizzaDetalhe details01 = new PizzaDetalhe();
					System.out.println("Número do pedido que você quer ver: ");
					int num = scn.nextInt();
					PizzaDetalhe_DAO dao = new PizzaDetalhe_DAO();
					dao.find(details01, num);

				}
				if (opc == 3) {
					PizzaDetalhe details01 = new PizzaDetalhe();
					System.out.println("Número do pedido que você quer modificar: ");
					int num = scn.nextInt();
					scn.nextLine();
					details01.setNumPedido(num);

					details01.setData(new Date());
					
					System.out.println("Digite a quantidade de pizza: ");
					int quantidade = scn.nextInt();
					scn.nextLine();
					details01.setQuantidade(quantidade);

					System.out.println("Digite o preço da(s) pizza(s): ");
					float preco = scn.nextFloat();
					scn.nextLine();
					details01.setPreco(preco);

					PizzaDetalhe_DAO dao = new PizzaDetalhe_DAO();
					dao.modify(details01);
				}
				if (opc == 4) {
					PizzaDetalhe details01 = new PizzaDetalhe();
					System.out.println("Número do pedido para deletar: ");
					int num = scn.nextInt();
					PizzaDetalhe_DAO dao = new PizzaDetalhe_DAO();
					dao.delete(details01, num);
				}
				if (opc == 9) {
					System.out.println("Saindo do sistema!!");

				}

			} while (opc != 9);

		}
	
}
