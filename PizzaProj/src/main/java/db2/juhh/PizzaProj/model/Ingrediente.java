package db2.juhh.PizzaProj.model;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "ingrediente")
public class Ingrediente {

		@Id
		private String nome;
				
		private int quantidade;	
		private boolean extra;
		
		
		public Ingrediente() {
				
	}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public int getQuantidade() {
			return quantidade;
		}


		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}


		public boolean isExtra() {
			return extra;
		}


		public void setExtra(boolean extra) {
			this.extra = extra;
		}




}
