package com.ssa.assignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EncryptMain {

	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 String secretMessage = null;
		 String passwordGenerator = null;
		 String pw1 = null;
		 Character[]myArray = {'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'};
		 int arrayLength = 0;
		 char[]alphArray = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		 char[]messageArray = new char [arrayLength];
		 char[]encryptedArray = new char[arrayLength];
		 boolean cont = true;
		 
		 //Randomizing the char list to allow for random ciphers
		 List<Character> charList = Arrays.asList(myArray);
		 Collections.shuffle(charList);
		 Character[] cipherArray = (Character[]) charList.toArray();

		 do{ 
				System.out.println("What would you like to do?\n"
						+ "Encrypt a message -Press 1\n"
						+ "Decrypt your message -Press 2\n"
						+ "Exit Program -Press 3");
				String menuChoice = sc.nextLine();
				
				switch (menuChoice) {
				
				case "1":
					
					System.out.println("What message would you like to encrypt?");
					secretMessage = sc.nextLine();
					arrayLength = secretMessage.length();
				
					messageArray = secretMessage.toLowerCase().toCharArray();
					encryptedArray = new char[arrayLength];
										
					Encrypt.encryption(secretMessage, alphArray, cipherArray, messageArray, encryptedArray);
					//Producing a random password
					passwordGenerator = PasswordEncryption.nextSessionId();
					System.out.println("\nPassword for your encryption: " + passwordGenerator + "\n" );
					break;
					
				case "2":
					System.out.println("Please enter your password");
					String verifyPw = sc.nextLine().toLowerCase();
					if (verifyPw.equals(passwordGenerator)) {
						//decrypting the message
						Encrypt.decryption(secretMessage, alphArray, cipherArray, messageArray, encryptedArray);
						
					}
								
					break;
					
				case "3":
					System.out.println("Thank you for using our app!!");
					System.exit(0);
					cont = false;

				default:
					System.out.println("That is not a valid character");
					break;
				}
				}while(cont);
	}
	
	

}//class
