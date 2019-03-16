package br.com.vvcurso;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import br.com.vvcurso.dataSource.PedidoDataSource;
import br.com.vvcurso.model.ItemPedido;
import br.com.vvcurso.model.Pedido;

public class mainApp {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PedidoDataSource pedidoDataSource = new PedidoDataSource();
		Pedido pedido = new Pedido();
		ItemPedido itemPedido;
		List<ItemPedido> listaItem = new ArrayList<ItemPedido>();

		int opcao = 0, codigo = 0;
	     
	    do {
	    	menuApp();
			opcao = Integer.parseInt(scan(false));

			System.out.println("\n\n");
			switch (opcao) {
			case 1: 
					pedidoDataSource.listar();
					break;
					
			case 2: 
					pedido.setCodigo(10);
					pedido.setDataHoraInclusao(new Date());
					pedido.setNomeCliente("Emerson Rioji Koike");
					pedido.setNomeFilial("S�o Caetano do Sul");
					
					itemPedido = new ItemPedido();
					itemPedido.setCodigo(10);
					itemPedido.setProduto("TV LCD 55 Polegadas");
					itemPedido.setQuantidade(1);
					itemPedido.setValor(1299.00);
					listaItem.add(itemPedido);
					pedido.setItens(listaItem);
					
					itemPedido = new ItemPedido();
					itemPedido.setCodigo(11);
					itemPedido.setProduto("Geladeira Panasonic 500l");
					itemPedido.setQuantidade(1);
					itemPedido.setValor(6299.00);
					listaItem.add(itemPedido);
					pedido.setItens(listaItem);
					pedidoDataSource.incluir(pedido);
					break;
					
			case 3:
					System.out.print("DIGITE O CODIGO PEDIDO A SER EDITADO: ");
					codigo = Integer.parseInt(scan(false));
					pedidoDataSource.editar(codigo);
					break;
					
			case 4: 
					System.out.print("DIGITE O CODIGO PEDIDO A SER EXCLUIDO: ");
					codigo = Integer.parseInt(scan(false));
					pedidoDataSource.remover(codigo, true);
					break;
					
			case 5: 
					break;
					
			default: 
					System.out.println("< OPCAO ERRADO >");
			}
			System.out.println("\n\n");
	      } while (opcao != 5);

	    scan(true);
	}
	
	private static void menuApp() {
		System.out.println("######### PEDIDOS #########");
		System.out.println("1 - LISTAR");
		System.out.println("2 - ADICIONAR");
		System.out.println("3 - EDITAR");
		System.out.println("4 - EXCLUIR\n");
		System.out.println("5 - SAIR");
		System.out.println("___________________________");
		 
		System.out.print("ESCOLHA A OPCAO DESEJADA: ");
	}

	private static String scan(boolean fim) {
		Scanner scan = new Scanner(System.in);
		String ret = " ";
		if (!fim) {
			ret = scan.nextLine();
		} else {
			scan.close();
		}
		return ret;
	}
	
	
}
