package view;

import java.text.ParseException;
import java.util.Scanner;

import entidade.Usuario;
import persistencia.BDUsuario;

public class TelaLogin {	
	public static void telaInicial() {
		Scanner sc = new Scanner(System.in);
		
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
			cadastraUsuario();
			
		}
		
		sc.close();
	}
	
	public static void telaLogin() {
		Scanner sc = new Scanner(System.in);
		
		String email;
		String senha;
		
		System.out.print("E-mail: ");
		email = sc.nextLine();
		System.out.print("Senha: ");
		senha = sc.nextLine();
		
		BDUsuario.confirmacaoLogin(email, senha);
		
		sc.close();
	}
	
	public static void cadastraUsuario() {
		Scanner sc = new Scanner(System.in);
		
		String nome;
		String email;
		String senha;
		String dataNascimento;
		
		System.out.print("Nome: ");
		nome = sc.nextLine();
		System.out.print("Data de Nascimento: (dd/mm/yyyy) ");
		dataNascimento = sc.next();
		System.out.print("E-mail: ");
		email = sc.nextLine();
		System.out.print("Senha: ");
		senha = sc.nextLine();
		
		try {
			BDUsuario.cadastroUsuario(new Usuario(nome, dataNascimento, email, senha));
		} catch (ParseException e) {
			System.out.println("Erro: "+e.getMessage());
		}
		
		sc.close();
	}
}
