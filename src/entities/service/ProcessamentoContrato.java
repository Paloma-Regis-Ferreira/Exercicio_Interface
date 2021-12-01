package entities.service;

import java.util.Calendar;
import java.util.Date;

import entities.model.Contrato;
import entities.model.ParcelasContrato;

public class ProcessamentoContrato {
	// gerar parcelas do contrato com base no numero de meses desejado

	private PagamentoOnline pagamentoOnline;

	public ProcessamentoContrato(PagamentoOnline pagamentoOnline) {
		this.pagamentoOnline = pagamentoOnline;
	}
	
	public void processamentoContrato(Contrato contrato, int parcelas) {
		double valorBaseParcela = contrato.getValorTotalContrato()/parcelas;
		
		for(int i = 0; i < parcelas; i ++) {
			double calculoJurosParcela = valorBaseParcela * pagamentoOnline.cobrancaJuros(valorBaseParcela);
			double calculoTaxaParcela = valorBaseParcela * pagamentoOnline.cobrancaTaxaPagamento(valorBaseParcela, i);
			Date dataParcela = adicionarMeses(contrato.getDataContrato(), i);
			contrato.adicionarParcelas(new ParcelasContrato(dataParcela, calculoJurosParcela + calculoTaxaParcela));
		}
		
	}

	private Date adicionarMeses(Date data, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}

}
