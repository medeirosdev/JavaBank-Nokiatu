package Programa;

import java.util.Scanner;

public class Conta {
	private int agencia;
	private String name;
	private double saldo ;
	private int taxaSelic;
	
	static Scanner input = new Scanner(System.in);
	
	public Conta(Pessoa pessoa ) {
		this.agencia = agencia;
		this.name = name;
	}
	
	public void setNameConta(String name){
		this.name = name;
	}
	
	public String getNameConta(){
		return this.name; 
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void depositarLn(double valor) {
		if(valor > 0) {
			this.saldo += valor;
		}else {
			System.out.println("Não é possível depositar esse valor");
		}
	}
	
	public void sacarLn(double valor) {
		if(valor > this.saldo) {
			System.out.println("Não é possível sacar esse valor");
		}else {
			this.saldo -= valor;
		}
	}
	
	public void definirTaxaSelic(int valor) {
		this.taxaSelic = valor;
	}
	
	
	public void mostrarNome() {
		System.out.println(this.name);
	}
	
	
	
	public String mostrarConta() {
		return "/nNome: " + this.getNameConta() +
				"/nAgência: " + this.getAgencia() +
				"/nEmail: " + this.getSaldo();
	}
	
	public void transferir( double valor , Conta ContaTransferida) {
		ContaTransferida.saldo += valor;
		this.saldo -= valor;
	}
	
	
	
}
