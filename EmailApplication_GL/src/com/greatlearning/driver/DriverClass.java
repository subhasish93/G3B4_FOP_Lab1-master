package com.greatlearning.driver;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;
import java.util.Scanner;

public class DriverClass {
	private static final CredentialService credentialService = new CredentialService();
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		//System.out.println("Please enter your name: ");
		//String firstName = sc.nextLine();
		//String lastName = sc.nextLine();
		
		String firstName ="Rajdeep";
		String lastName = "Roy";
		Employee employee = new Employee(firstName, lastName);

		// String generatedEmail;
		// String generatedPassword;

		System.out.println("Please enter the department from the following ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		int option = sc.nextInt();
		// int departmentNumber = sc.nextInt();

		switch (option) {

		case 1: {
			String generatedPassword = credentialService.generatePassword();
			String generatedEmail = credentialService.getEmailAddress(firstName, lastName, "tech");
			credentialService.showCredential(employee, generatedEmail, generatedPassword);
		}
			break;

		case 2: {
			String generatedPassword = credentialService.generatePassword();
			String generatedEmail = credentialService.getEmailAddress(firstName, lastName, "admin");
			credentialService.showCredential(employee, generatedEmail, generatedPassword);
		}
			break;

		case 3: {
			String generatedPassword = credentialService.generatePassword();
			String generatedEmail = credentialService.getEmailAddress(firstName, lastName, "hr");
			credentialService.showCredential(employee, generatedEmail, generatedPassword);
		}
			break;

		case 4: {
			String generatedPassword = credentialService.generatePassword();
			String generatedEmail = credentialService.getEmailAddress(firstName, lastName, "legal");
			credentialService.showCredential(employee, generatedEmail, generatedPassword);
		}
			break;

		}
	}
}
