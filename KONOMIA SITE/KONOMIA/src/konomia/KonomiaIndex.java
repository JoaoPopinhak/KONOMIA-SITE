package konomia;

public class KonomiaIndex {

	public static void main(String[] args) {
		
		
		
		InstituicaoBancaria bancoDoBrasil = new InstituicaoBancaria(123, "Banco do Brasil");
		
		ContaBancaria conta = new ContaBancaria(bancoDoBrasil,"Banco do brasil", 1000);
		
		Categoria novaCategoria = new Categoria("teste");
		
		
		
		
		try {
			Lancamento lancamentoTeste = new Lancamento(TipoMovimentacao.DESPESA, conta, novaCategoria, 1001);
			System.out.println(lancamentoTeste.valor);
			
		}catch(ValorMenorZeroException | SaldoInsuficienteException e1){
			
			System.out.println(e1.getMessage());
		}
		
		

	
		


		
		
		
		
		
	
		
		
		
		

		
		
		
	}

}
