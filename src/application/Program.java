package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Contract contract;	
		
		System.out.print("Numero Contrato: ");
		int number = sc.nextInt();
		
		System.out.print("Date: ");
		Date date = sdf.parse(sc.next());
		
		System.out.print("Valor do Contrato: ");
		Double totalValue = sc.nextDouble();
		
		contract = new Contract(number,date,totalValue);
		
		System.out.print("Insira o número de Parcelas: ");
		int installments = sc.nextInt();
		
		ContractService cs = new ContractService(new PaypalService());
		cs.processContract(contract, installments);
		
		//OnlinePayment onlinePayment = new OnlinePayment(installments);
		//onlinePayment.installmentsContract(contract);
		//System.out.print(contract.toString());
		
		System.out.println("Installments:");
		for (Installment it : contract.getInstallments()) {
			System.out.print(it);
		}
		sc.close();
	}

}
