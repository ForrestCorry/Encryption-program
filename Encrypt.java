package com.ssa.assignment;

public class Encrypt {
	
	
	public static void encryption(String secretMessage, char[] alphArray, Character[] cipherArray, char[] messageArray,
			char[] encryptedArray) {
		for (int i = 0; i < secretMessage.length(); i++) {
			char compare = messageArray[i];
			for (int j = 0; j < alphArray.length; j++) {
				if (compare == alphArray[j]) {
					encryptedArray[i] = cipherArray[j];
					
					
				}//if statement
				
			}//second for loop
			
		}//first for loop
	
		String encryptedPrint = String.valueOf(encryptedArray);
		System.out.println("Your encrypted messgage is: " + encryptedPrint);
	}//method
	
	
	public static void decryption(String secretMessage, char[] alphArray, Character[] cipherArray, char[] messageArray,
			char[] encryptedArray) {
	for (int i = 0; i < encryptedArray.length; i++) {
		char compare = encryptedArray[i];
		for (int j = 0; j < cipherArray.length; j++) {
			if (compare == cipherArray[j]) {
				messageArray[i] = alphArray[j];
				
			
			}//if statement
		}//second for loop
	}//first for loop
		String messagePrint = String.valueOf(messageArray);
		System.out.println("Your decrypted message is: " + messagePrint);
		System.out.println("");
	}//method
	
}//class
