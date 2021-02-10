package com.lifemiles.translater.binary;

public class BinaryConverter {

	public void binaryToString(String texto) {
	      String letras =texto;
	      String binary;
	      int b=0;
	      for (int i=0; i<letras.length(); i++){
	      b=letras.charAt(i);
	      binary=Integer.toBinaryString(b);
	      System.out.println(binary+" ");
	      }
	}
	
	public void stringToBinary(String binary) {
		String[] singleBinaryArray = binary.split("\\s");
		String finalResult = "";
		for (String string : singleBinaryArray) {
		Character c = (char) Integer.parseInt(string, 2);
		    finalResult += c.toString();
		}
		System.out.println("Result: " + finalResult);
	}
}
