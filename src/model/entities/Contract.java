package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

	private Integer number;
	private Date date;
	private Double totalValue;
	
	List<Installment> installments = new ArrayList<>();

	public Contract() {
	}
	
	public Contract(Integer number, Date date, Double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}
	
	public Integer getNumber() {
		return number;
	}
	public Integer setNumber(Integer number) {
		return this.number = number;
	}
	
	public Date getDate() {
		return date;
	}
	public Date setDate(Date date) {
		return this.date = date;
	}
	
	public Double getTotalValue() {
		return totalValue;
	}
	
	public void adicionarContrato(Installment installment) {
		installments.add(installment);
	}
	
	public void removerContrato(Installment installment) {
		installments.remove(installment);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Installments: \n");
		for(Installment i: installments) {
			sb.append(i.toString());
		}
		return sb.toString();
	}
}
