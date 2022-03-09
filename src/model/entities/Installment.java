package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date dueDate;
	private Double amount;

	public Installment() {
	}
	
	public Installment(Date dueDate, Double amount) {
		this.dueDate = dueDate;
		this.amount = amount;
	}
	
	public Date getDate() {
		return dueDate;
	}
	public Date setDate(Date dueDate) {
		return this.dueDate = dueDate;
	}
	
	public Double getAmount() {
		return amount;
	}
	public Double setAmount(Double amount) {
		return this.amount = amount;
	}
	
	@Override
	public String toString() {
		return 	sdf.format(dueDate)
			+	" - "
			+	String.format("%.2f",amount)
			+ " \n";
	}
}
