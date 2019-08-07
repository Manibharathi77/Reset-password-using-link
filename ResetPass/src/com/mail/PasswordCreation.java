package com.mail;

import java.util.Random;

public class PasswordCreation {

	public static String createPass() {

		String password1= "";
		int len = 8;
		String Caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Lower = "abcdefghijklmnopqrstuvwxyz";
		String symbols = "!@#$%";
		String values = Lower + Caps + symbols;
		char[] new_password = new char[len];
		Random rand = new Random();
		for (int i = 0; i< len; i++) {
			new_password[i] = values.charAt( rand.nextInt(values.length()));
			password1 += new_password[i];
		}
		System.out.println(password1);
		return password1;
	}
}
