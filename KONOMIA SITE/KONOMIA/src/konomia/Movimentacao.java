package konomia;

public interface Movimentacao {
	public void receita(double valor)throws ValorMenorZeroException;
	public void despesa(double valor)throws ValorMenorZeroException, SaldoInsuficienteException;
	public void transferencia(Conta conta, double valor)throws ValorMenorZeroException,SaldoInsuficienteException;
}
