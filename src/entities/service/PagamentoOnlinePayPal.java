package entities.service;

public class PagamentoOnlinePayPal implements PagamentoOnline {
	
	private static double COBRANCA_JUROS = 0.01;
	private static double COBRANCA_TAXA = 0.02;

	@Override
	public double cobrancaJuros(double valorTotal) {
		double calculoJuros = valorTotal * COBRANCA_JUROS;
		return calculoJuros;
	}

	@Override
	public double cobrancaTaxaPagamento(double valorTotal, int meses) {
		double calculoTaxa = valorTotal * COBRANCA_TAXA * meses;
		return calculoTaxa;
	}
	
	
}
