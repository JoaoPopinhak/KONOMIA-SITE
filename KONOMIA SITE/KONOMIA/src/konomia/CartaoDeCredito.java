package konomia;

import java.time.LocalDateTime;

public class CartaoDeCredito implements Movimentacao{
	
	private int id;
	private LocalDateTime dataCriacao;
	private String nome;
	private ContaBancaria contaBancaria;
	private double limite;
	private double limiteDisponivel;
	private double limiteUtilizado;
	
	public CartaoDeCredito(ContaBancaria contaBancaria, String nome, double limite){
		this.contaBancaria = contaBancaria;
		this.nome=nome;
		this.limite=limite;
		limiteDisponivel=limite;
		limiteUtilizado=0;
		id++;
		this.dataCriacao=LocalDateTime.now();
	}
	
	public int getId(){
		return id;
	}
	
	public LocalDateTime getDataCriacao(){
		return dataCriacao;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String novoNome){
		this.nome=novoNome;
	}
	
	public ContaBancaria getContaBancaria(){
		return contaBancaria;
	}
	
	public void setContaBancaria(ContaBancaria novaContaBancaria){
		this.contaBancaria=novaContaBancaria;
	}
	
	public double getLimite(){
		return limite;
	}
	
	public void setLimite(double novoLimite){
		this.limite=novoLimite;
	}
	
	public double getLimiteDisponivel(){
		return limiteDisponivel;
	}
	
	public double getLimiteUtilizado(){
		return limiteUtilizado;
	}
	
	public void despesaCartao(double valor){
		limiteUtilizado+=valor;
		limiteDisponivel-=limiteUtilizado;
	}
	
	public void pagamentoCartao(){
		
	}


	public void receita(double valor){}

	public void despesa(double valor) {
		limiteUtilizado+=valor;
		limiteDisponivel=limite-limiteUtilizado;
	}

	public void transferencia(Conta conta, double valor){}
	
	
	
}
