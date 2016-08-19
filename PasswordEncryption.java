package com.ssa.assignment;

import java.math.BigInteger;
import java.security.SecureRandom;

public class PasswordEncryption {

	protected static SecureRandom random = new SecureRandom();

	  
	public static String nextSessionId() {
	    return new BigInteger(130, random).toString(32);
	  }
	
}

