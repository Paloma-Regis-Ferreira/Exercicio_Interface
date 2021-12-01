package entities.service;

public interface PagamentoOnline {
	
	public double cobrancaJuros(double valorTotal);
	public double cobrancaTaxaPagamento(double valorTotal, int meses);
}
