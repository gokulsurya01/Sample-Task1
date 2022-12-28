package org.banl;

public class BankInfo extends AxisBank {
	private void saving() {
		System.out.println("saving acc");
	}
	private void fixed() {
		System.out.println("fixed acc");
	}

	public static void main(String[] args) {
		BankInfo currency = new BankInfo();
		currency.saving();
		currency.fixed();
		currency.deposit();
	}

}
