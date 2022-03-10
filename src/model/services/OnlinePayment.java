/* package model.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class OnlinePayment {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Integer installmentsMonths;
	
	public OnlinePayment() {
	}
	
	public OnlinePayment(Integer installmentsMonths) {
		this.installmentsMonths = installmentsMonths;
	}

	public Integer getInstallmentsMonths() {
		return installmentsMonths;
	}
	public void setInstallmentsMonths(Integer installmentsMonths) {
		this.installmentsMonths = installmentsMonths;
	}
	
	public void installmentsContract(Contract contract) throws ParseException {
		Calendar cal = Calendar.getInstance();
		cal.setTime(contract.getDate());
		
		for(int i=1; i<=installmentsMonths;i++) {
			
			cal.add(Calendar.MONTH, 1);
			Date data = cal.getTime();
			
			Double installment = (contract.getTotalValue()/ installmentsMonths);
			installment += installment * 0.01 * i;
			installment += installment * 0.02;
			
			contract.adicionarContrato(new Installment(data, installment));
		}	
	}
	
	
} */
