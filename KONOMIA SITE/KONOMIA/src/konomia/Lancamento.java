package konomia;

import java.time.LocalDateTime;

public class Lancamento {
	
	LocalDateTime dataCriacao;
	TipoMovimentacao tipoMovimentacao;
	Conta conta;
	Categoria categoria;
	double valor;
	
	
	public Lancamento(TipoMovimentacao tipoMovimentacao, Conta conta, Categoria categoria, double valor)throws ValorMenorZeroException,SaldoInsuficienteException
	{
		
		if(tipoMovimentacao == TipoMovimentacao.DESPESA){	
			
			conta.despesa(valor);
			this.dataCriacao = LocalDateTime.now();
			this.tipoMovimentacao=tipoMovimentacao;
			this.conta=conta;
			this.categoria=categoria;
			this.valor=valor;
			
		}else if(tipoMovimentacao == TipoMovimentacao.RECEITA){
			
			conta.receita(valor);
			this.dataCriacao = LocalDateTime.now();
			this.tipoMovimentacao=tipoMovimentacao;
			this.conta=conta;
			this.categoria=categoria;
			this.valor=valor;
			
		}else if(tipoMovimentacao == TipoMovimentacao.TRANSFERENCIA){
			
			conta.transferencia(null, valor);
			this.dataCriacao = LocalDateTime.now();
			this.tipoMovimentacao=tipoMovimentacao;
			this.conta=conta;
			this.categoria=categoria;
			this.valor=valor;
		}
	}
	
}
