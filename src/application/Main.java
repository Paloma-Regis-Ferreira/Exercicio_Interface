package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.model.Contrato;
import entities.model.ParcelasContrato;
import entities.service.PagamentoOnlinePayPal;
import entities.service.ProcessamentoContrato;

public class Main {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		double totalValue = sc.nextDouble();
		
		Contrato contract = new Contrato(number, date, totalValue);
		
		System.out.print("Enter number of installments: ");
		int n = sc.nextInt();
		
		ProcessamentoContrato contractService = new ProcessamentoContrato(new PagamentoOnlinePayPal());
		
		contractService.processamentoContrato(contract, n);
		
		System.out.println("Installments:");
		for (ParcelasContrato x : contract.getParcelasContrato()) {
			System.out.println(x);
		}
		
		sc.close();

	}

}
