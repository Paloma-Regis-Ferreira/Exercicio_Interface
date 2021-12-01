package entities.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	
	public Integer numeroContrato;
	public Date dataContrato;
	public Double ValorTotalContrato;
	
	List<ParcelasContrato> parcelasContrato = new ArrayList<>();
	
	public Contrato() {
	}

	public Contrato(Integer numeroContrato, Date dataContrato, Double valorTotalContrato) {
		this.numeroContrato = numeroContrato;
		this.dataContrato = dataContrato;
		ValorTotalContrato = valorTotalContrato;
	}

	public Integer getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(Integer numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public Date getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}

	public Double getValorTotalContrato() {
		return ValorTotalContrato;
	}

	public void setValorTotalContrato(Double valorTotalContrato) {
		ValorTotalContrato = valorTotalContrato;
	}

	public List<ParcelasContrato> getParcelasContrato() {
		return parcelasContrato;
	}

	public void adicionarParcelas(ParcelasContrato parcela) {
		parcelasContrato.add(parcela);
	}
	
	public void removerParcela(ParcelasContrato parcela) {
		parcelasContrato.remove(parcela);
	}
}
