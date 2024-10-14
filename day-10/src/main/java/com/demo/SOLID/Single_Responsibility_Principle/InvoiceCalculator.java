package com.demo.SOLID.Single_Responsibility_Principle;

public class InvoiceCalculator {
	private double amount;

	public InvoiceCalculator(double amount) {
		this.amount = amount;
	}

	public double calculateTotal() {
		// Logic to calculate total
		System.out.println("Calculating total amount...");
		return amount; // For simplicity, returning the same amount
	}
}
