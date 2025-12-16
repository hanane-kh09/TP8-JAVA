package com.example.tp2;

public class Email implements Notification {
	private String from;

	public Email(String from) {
		this.from = from;
	}

	@Override
	public void send(String recipient, String message) {
		System.out.printf("[Email] From: %s To: %s — %s%n", from, recipient, message);
	}

	@Override
	public int getPriority() {
		return 1;
	}

	@Override
	public String getType() {
		return "Email";
	}

}
