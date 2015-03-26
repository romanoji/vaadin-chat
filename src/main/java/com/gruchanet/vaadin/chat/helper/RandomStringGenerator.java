package com.gruchanet.vaadin.chat.helper;

public class RandomStringGenerator {

    public static enum Mode {
	    ALPHA, ALPHANUMERIC, NUMERIC 
	}
	
	public static String generateRandomString(int length, Mode mode) throws Exception {

		StringBuilder builder = new StringBuilder();
		String characters = "";

		switch(mode){
		
		case ALPHA:
			characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			break;
		
		case ALPHANUMERIC:
			characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
			break;
	
		case NUMERIC:
			characters = "1234567890";
		    break;
		}
		
		int charactersLength = characters.length();

		for (int i = 0; i < length; i++) {
			double index = Math.random() * charactersLength;
            builder.append(characters.charAt((int) index));
		}
		return builder.toString();
	}
}