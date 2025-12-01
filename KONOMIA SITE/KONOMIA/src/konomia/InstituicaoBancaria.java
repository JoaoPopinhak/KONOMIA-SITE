package konomia;

import java.time.LocalDateTime;


public class InstituicaoBancaria {
	
	private LocalDateTime dataCriacao;
	private int codigoBanco;
	private String nome;
	
	public InstituicaoBancaria(int codigobanco, String nome){
		this.codigoBanco = codigobanco;
		this.nome = nome;
		dataCriacao = LocalDateTime.now();
	}
	
	public LocalDateTime getDataCriacao(){
		return dataCriacao;
	}
	
	public int getCodigoBanco(){
		return codigoBanco;
	}
	
	public void setCodigoBanco(int novoCodigoBanco){
		this.codigoBanco=novoCodigoBanco;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String novoNome){
		this.nome=novoNome;
	}
	
}
