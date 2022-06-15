package ExercicioCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestaEstoque {

	public static void main(String[] args) {
		
		Estoque produto1 = new Estoque("Milho Enlatado");
		Estoque produto2 = new Estoque("Feijao Enlatado");
		Estoque produto3 = new Estoque("Refrigerante");
		Estoque produto4 = new Estoque("Caf�");
		Estoque produto5 = new Estoque("A�ucar");
		
		ArrayList<Estoque> produtos = new ArrayList<>();
		
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);
		produtos.add(produto5);
		
			System.out.println("Produtos em estoque: " + produtos + "\n");
		
		produtos.remove(produto4);
		produtos.remove(produto5);
			
			System.out.println("Produtos removidos !\n \nO novo estoque �:    " + produtos + "\n");
		
		Estoque produto6 = new Estoque("Salagadinho");
		Estoque produto7 = new Estoque("Arroz");
		
		produtos.set(0, produto6);
		produtos.set(0, produto7);
		 
			System.out.println("Produtos substituidos !\n \nO novo estoque �:    " + produtos + "\n");
		
		produtos.add(produto3);
		produtos.add(produto4);
		
		System.out.println("Produtos adicionados !\n\nO estoque atual �:   " + produtos + "\n");
		

	}

}