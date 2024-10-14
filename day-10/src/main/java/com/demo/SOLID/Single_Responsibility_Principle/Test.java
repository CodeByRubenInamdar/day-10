package com.demo.SOLID.Single_Responsibility_Principle;

public class Test {
	public static void main(String[] args) {
		double amount = 100.0;

		// Separate responsibilities
		InvoiceCalculator calculator = new InvoiceCalculator(amount);
		double total = calculator.calculateTotal();

		PDFGenerator pdfGenerator = new PDFGenerator();
		pdfGenerator.generatePDF();

		EmailService emailService = new EmailService();
		emailService.sendEmail();

		System.out.println("Invoice processing complete with total: " + total);
	}
}
