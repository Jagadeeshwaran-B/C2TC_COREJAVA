package com.tns.ifet.dayfive.hasa;

public class Executor {

	public static void main(String[] args) {
		Address address = new Address("405 Laxmi Enclave, Pandiya Colony", "Nashik", "Maharashtra", "422003");
		Person person = new Person("Aniket Pawar", address);
		person.displayInfo();
	}

}
