package entities.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ParcelasContrato {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Date data;
	public Double valor;
	
	public ParcelasContrato() {
	}

	public ParcelasContrato(Date data, Double valor) {
		this.data = data;
		this.valor = valor;
	}

	public static SimpleDateFormat getSdf() {
		return sdf;
	}

	public static void setSdf(SimpleDateFormat sdf) {
		ParcelasContrato.sdf = sdf;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return sdf.format(data) + " - " + String.format("%.2f", valor);
 	}
}
