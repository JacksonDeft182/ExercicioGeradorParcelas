package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.services.OnlinePayment;

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
		
		System.out.print("Insira o número de Parcelas: ");
		int installments = sc.nextInt();
		
		contract = new Contract(number,date,totalValue);
		OnlinePayment onlinePayment = new OnlinePayment(installments);
		onlinePayment.installmentsContract(contract);

		System.out.print(contract.toString());
		
		sc.close();
	}

}
