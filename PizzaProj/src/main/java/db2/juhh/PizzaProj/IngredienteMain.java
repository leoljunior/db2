package db2.juhh.PizzaProj;

import java.util.Scanner;

import db2.juhh.PizzaProj.dao.Ingrediente_DAO;
import db2.juhh.PizzaProj.model.Ingrediente;

public class IngredienteMain {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int opc = 0;

		do {
			System.out.println("SEJA BEM VINDO");
			System.out.println("Selecione uma opção:");
			System.out.println("1........Criar ingrediente");
			System.out.println("2........Ver uma ingrediente");
			System.out.println("3........Modificar um ingrediente");
			System.out.println("4........Excluir um ingrediente");
			System.out.println("9........Sair");

			opc = scn.nextInt();
			scn.nextLine();
			System.out.println("");

			if (opc == 1) {
				Ingrediente ingrediente01 = new Ingrediente();
				System.out.println("Crie seu ingrediente: ");

				System.out.println("Digite o nome do ingrediente: ");
				String nome = scn.nextLine();
				ingrediente01.setNome(nome);

				System.out.println("Digite a quantidade de ingrediente: ");
				int quantidade = scn.nextInt();
				scn.nextLine();
				ingrediente01.setQuantidade(quantidade);

				System.out.println("Você quer ingrediente extra: Sim? ou Não?: ");
				String extra = scn.nextLine();
				ingrediente01.setExtra(extra);

				Ingrediente_DAO dao = new Ingrediente_DAO();
				dao.insert(ingrediente01);
			}
			if (opc == 2) {
				Ingrediente ingrediente01 = new Ingrediente();
				System.out.println("Nome do ingrediente que você quer ver: ");
				String nome = scn.nextLine();
				Ingrediente_DAO dao = new Ingrediente_DAO();
				dao.find(ingrediente01, nome);

			}
			if (opc == 3) {
				Ingrediente ingrediente01 = new Ingrediente();
				System.out.println("Nome do ingrediente que você quer mudar: ");
				String nameChange = scn.nextLine();
				ingrediente01.setNome(nameChange);

				System.out.println("Digite o nome do ingrediente: ");
				String nome = scn.nextLine();
				ingrediente01.setNome(nome);

				System.out.println("Digite a quantidade de ingrediente: ");
				int quantidade = scn.nextInt();
				scn.nextLine();
				ingrediente01.setQuantidade(quantidade);

				System.out.println("Digite se você quer ingrediente extra: Sim? ou Não?: ");
				String extra = scn.nextLine();
				ingrediente01.setExtra(extra);

				Ingrediente_DAO dao = new Ingrediente_DAO();
				dao.modify(ingrediente01);
			}
			if (opc == 4) {
				Ingrediente ingrediente01 = new Ingrediente();
				System.out.println("Nome do ingrediente para deletar: ");
				String nome = scn.nextLine();
				Ingrediente_DAO dao = new Ingrediente_DAO();
				dao.delete(ingrediente01, nome);
			}
			if (opc == 9) {
				System.out.println("Saindo do sistema!!");

			}

		} while (opc != 9);

	}

}
