package view;

import java.util.Scanner;

public class TelaLogin {
	Scanner sc = new Scanner(System.in);
	
	public void telaInicial() {
		char confirmacao;
		
		System.out.print("Já tem conta [s/n]: ");
		confirmacao = sc.next().charAt(0);
		while(confirmacao != 's' && confirmacao != 'n') {
			System.out.print("Não exite essa opção. Digite novamente: [s/n] ");
			confirmacao = sc.next().charAt(0);
		}
		
		if(confirmacao == 's') {
			System.out.println("-----------------------------------------");
			telaLogin();
		} else {
			System.out.println("-----------------------------------------");
			
		}
		
	}
	
	public void telaLogin() {
		String email;
		String senha;
		
		sc.nextLine();
		System.out.print("E-mail: ");
		email = sc.nextLine();
		System.out.print("Senha: ");
		senha = sc.nextLine();
	}
	

}
