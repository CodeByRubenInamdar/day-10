package com.demo.SOLID.DIP;

// Abstraction for message sending
interface MessageSender {
	void sendMessage(String message);
}

// Concrete implementation for sending emails
class EmailSender implements MessageSender {
	@Override
	public void sendMessage(String message) {
		System.out.println("Sending Email: " + message);
	}
}

// Concrete implementation for sending SMS
class SmsSender implements MessageSender {
	@Override
	public void sendMessage(String message) {
		System.out.println("Sending SMS: " + message);
	}
}

// High-level module that depends on the abstraction (MessageSender)
class NotificationService {
	private final MessageSender messageSender;

	// Constructor injection to pass the dependency
	public NotificationService(MessageSender messageSender) {
		this.messageSender = messageSender;
	}

	// Method to send notification using the provided MessageSender implementation
	public void sendNotification(String message) {
		messageSender.sendMessage(message);
	}
}

// Main class to test the Dependency Inversion Principle
public class TestDIP {
	public static void main(String[] args) {
		// Using EmailSender to send a notification
		MessageSender emailSender = new EmailSender();
		NotificationService emailNotification = new NotificationService(emailSender);
		emailNotification.sendNotification("This is an email notification.");

		// Using SmsSender to send a notification
		MessageSender smsSender = new SmsSender();
		NotificationService smsNotification = new NotificationService(smsSender);
		smsNotification.sendNotification("This is an SMS notification.");
	}
}
