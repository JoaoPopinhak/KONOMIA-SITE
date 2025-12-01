package konomia;

import java.time.LocalDateTime;

public class Conta implements Movimentacao{
	

	protected LocalDateTime dataCriacao;
	protected String nome;
	protected InstituicaoBancaria instituicaoBancaria;
	protected double saldo;
	
	
	public Conta(InstituicaoBancaria instituicao, String nomeConta, double saldoInicial){
		this.instituicaoBancaria = instituicao;
		this.nome = nomeConta;
		this.saldo = saldoInicial;
		dataCriacao = LocalDateTime.now();
	}
	
	public LocalDateTime getDataCriacao(){
		return dataCriacao;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String novoNome){
		this.nome = novoNome;
	}
	
	public InstituicaoBancaria getInstituicaoBancaria(){
		return instituicaoBancaria;
	}
	
	public void SetInstituicaoBancaria(InstituicaoBancaria instituicaoBancariaNova){
		this.instituicaoBancaria = instituicaoBancariaNova;
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public void setSaldo(double saldoNovo){
		this.saldo = saldoNovo;
	}
	
	public void receita(double valor)
			throws ValorMenorZeroException
	{
		if(valor <= 0){
			throw new ValorMenorZeroException("Para adicionar uma receita a conta o valor precisa ser maior que 0");
		}else{
			saldo+=valor;
		}
		
			
	}
	
	public void despesa(double valor)
			throws ValorMenorZeroException,SaldoInsuficienteException
	{
		if(valor <= 0){
			throw new ValorMenorZeroException("Para adicionar uma despesa a conta o valor precisa ser maior que 0");
		}else if(saldo < valor){
			throw new SaldoInsuficienteException("O seu saldo é insuficiente para completar essa acao");
		}else{
			saldo-=valor;
		}
		
	}
	
	public void transferencia(Conta contadest, double valor)
			throws ValorMenorZeroException,SaldoInsuficienteException
	{
		if(valor <= 0){
			throw new ValorMenorZeroException("Para adicionar uma transferencia a conta o valor precisa ser maior que 0");
		}else if(saldo < valor){
			throw new SaldoInsuficienteException("O seu saldo é insuficiente para completar essa acao");
		}else {
			this.despesa(valor);
			contadest.receita(valor);
		}
		
	}
	
	
	
	
}
