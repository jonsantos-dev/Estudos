package application;

import java.util.Scanner;
import entities.Produto;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nome, codigoIdentificador, decisao;
		double preco;
		
		
		System.out.println("Vamos cadastrar produto");
		System.out.print("Digite o nome do produto: ");
		nome = sc.nextLine();
		System.out.print("Digite o codigo identificador: ");
		codigoIdentificador =  sc.nextLine();
		System.out.print("Digite o preco do produto: ");
		preco = sc.nextDouble();
		sc.nextLine();
		
		Produto novoProduto = new Produto(nome, codigoIdentificador, preco);
		
		System.out.print("Deseja cadastrar estoque? ");
		do {
			decisao = sc.nextLine();
			
			if (decisao.equals("s")) {
				System.out.print("Digite a quantidade: ");
				int quantidade = sc.nextInt();
				sc.nextLine();
				
				novoProduto.compra(quantidade);
			} else if (decisao.equals("n")) {
				System.out.println("Sem problemas, seguiremos sem estoque por enquanto.");
			} else {
				System.out.println("Entrada inválida, digite s ou n para prosseguir: ");
			}
			
		} while (!(decisao.equals("s") || decisao.equals("n")));
		
		System.out.println(novoProduto.infoProduto());
		
		do {
			
			System.out.println("O que deseja fazer agora, vender, repor, mudar preço, exibir info ou sair:");
			decisao = sc.nextLine();
			
			if (decisao.equals("vender")) {
				System.out.print("Quantos itens deseja vender? ");
				int quantidade = sc.nextInt();
				sc.nextLine();
				
				int estoque = novoProduto.getQuantidadeEmEstoque();
				
				if ((estoque - quantidade) < 0) {
					System.out.println("Transação recusada, você não tem estoque suficiente para concluir a operação");
				} else {
					novoProduto.venda(quantidade);
				}
			} else if (decisao.equals("repor")) {
				System.out.print("Quantos itens deseja comprar para repor o estoque? ");
				int quantidade = sc.nextInt();
				sc.nextLine();
				novoProduto.compra(quantidade);
			} else if (decisao.equals("mudar preço")) {
				System.out.println("Informe o novo preço: ");
				preco = sc.nextDouble();
				sc.nextLine();
				novoProduto.setPreco(preco);
			} 
			else if (decisao.equals("exibir info")) {
//				System.out.println(novoProduto.infoProduto());
			} else if (decisao.equals("sair")) {
				System.out.println("Fim da sua sessão.");
			}
			else {
				System.out.println("Entrada invalida, vamos tentar novamente");
			}
			
			System.out.println(novoProduto.infoProduto());
			
		} while (!decisao.equals("sair"));
		
		sc.close();
	}
}
