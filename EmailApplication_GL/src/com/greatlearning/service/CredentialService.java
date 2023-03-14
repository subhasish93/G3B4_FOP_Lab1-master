package com.greatlearning.service;

import com.greatlearning.model.Employee;
import java.util.Random;

public class CredentialService implements ICredentialService {

	@Override
	public String generatePassword() {
		String capitalLetters = "ADCDEFGHIJKLMN";
		String smallCaseLetters = "abcdefghijklmn";
		String numbers = "1234567890";
		String specialCharacters = "!@#$%+-_<>";
		String values = capitalLetters + smallCaseLetters + numbers + specialCharacters;
		
		//randomly select a combination of all these different type of characters
		
		StringBuffer strBuffer = new StringBuffer("");
		Random random = new Random();
		for(int index=0;index<10;index++) {
			strBuffer.append(values.charAt(random.nextInt(values.length())));
		}
		return strBuffer.toString();
		
	}

	@Override
	public String getEmailAddress(String firstName, String lastName, String department) {
		// TODO Auto-generated method stub
		return firstName + lastName + "@" + department + ".abc.com";
	}

	@Override
	public void showCredential(Employee employee, String email, String generatePassword) {
		// TODO Auto-generated method stub
		System.out.println("Dear "+employee.getFirstName()+" your generated credentials are as follows ");
		System.out.println("Email -> "+email);
		System.out.println("Password -> "+generatePassword);
	}
}
