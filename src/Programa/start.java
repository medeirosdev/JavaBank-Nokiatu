package Programa;

import java.util.Scanner;
import java.util.ArrayList;

public class start {
	
	static Scanner input = new Scanner(System.in);
	
	static ArrayList<Conta> contasBancarias;
	
	
	
	
	
	public static void criarConta() {
		
		System.out.println("\nNome: ");
		String name = input.nextLine();
		
		System.out.println("\nCPF: ");
		String cpf = input.nextLine();
		
		System.out.println("\nEmail: ");
		String email = input.nextLine();
		
		Pessoa pessoa = new Pessoa(name , cpf , email);
		
		Conta conta = new Conta(pessoa);
		
		contasBancarias.add(conta);
		
		Servidor();
		
		
	}
	
	private static Conta encontrarConta(int agencia) {
		Conta conta = null;
		if(contasBancarias.size()>0) {
			for(Conta c: contasBancarias) {
				if(c.getAgencia() == agencia);
				conta = c;
			}
		}
		return conta;
		
	}
	
	public static void Depositar() {
		System.out.println("Qual número da sua conta");
		int numeroConta = input.nextInt();
		
		Conta conta = encontrarConta(numeroConta);
		
		if( conta != null) {
			System.out.println("Qual valor deseja depositar?");
			Double valorDeposito = input.nextDouble();
			conta.depositarLn(valorDeposito);
			System.out.println("Deu bom!");
		}
	}
	
	
	
	
	
	public static void Servidor() {
		System.out.println("------------------------------------------------------");
        System.out.println("-------------Bem vindos a nossa Agência---------------");
        System.out.println("------------------------------------------------------");
        System.out.println("***** Selecione uma operação que deseja realizar *****");
        System.out.println("------------------------------------------------------");
        System.out.println("|   Opção 1 - Criar conta   |");
        System.out.println("|   Opção 2 - Depositar     |");
        System.out.println("|   Opção 3 - Sacar         |");
        System.out.println("|   Opção 4 - Transferir    |");
        System.out.println("|   Opção 5 - Listar        |");
        System.out.println("|   Opção 6 - Sair          |");
	
	
        int operation = input.nextInt();
        
        switch(operation) {
        case 1:
        	criarConta();
        	break;
        
        case 2:
        	Depositar();
        	break;
        	
        case 3:
        	Sacar();
        	break;
        	
        case 4:
        	Transferir();
        	break;
        	
        case 5:
        	Listar();
        	break;
        	
        case 6:
        	System.out.println("ADEUS");
        	System.exit(0);
        	break;
        	
        default:
        	System.out.println("Tente novamente");
        	Servidor();
        
        	
        	
        }
        
        
        
        
	
	
	}
	
	
	
	public static void main(String[] args) {
		
		contasBancarias = new ArrayList<Conta>();
		
		Servidor();
		
	

}
}
