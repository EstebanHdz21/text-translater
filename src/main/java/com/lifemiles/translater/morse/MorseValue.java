package com.lifemiles.translater.morse;

import java.util.HashMap;
import java.util.Map;

public class MorseValue {

	 public static Map<String, String> getMorse() {
	        Map<String, String> morseValue = new HashMap<>();
	        morseValue.put("A", ".-");
	        morseValue.put("B", "-...");
	        morseValue.put("C", "-.-.");
	        morseValue.put("CH", "----");
	        morseValue.put("D", "-..");
	        morseValue.put("E", ".");
	        morseValue.put("F", "..-.");
	        morseValue.put("G", "--.");
	        morseValue.put("H", "....");
	        morseValue.put("I", "..");
	        morseValue.put("J", ".---");
	        morseValue.put("K", "-.-");
	        morseValue.put("L", ".-..");
	        morseValue.put("M", "--");
	        morseValue.put("N", "-.");
	        morseValue.put("Ñ", "--.--");
	        morseValue.put("O", "---");
	        morseValue.put("P", ".--.");
	        morseValue.put("Q", "--.-");
	        morseValue.put("R", ".-.");
	        morseValue.put("S", "...");
	        morseValue.put("T", "-");
	        morseValue.put("U", "..-");
	        morseValue.put("V", "...-");
	        morseValue.put("W", ".--");
	        morseValue.put("X", "-..-");
	        morseValue.put("Y", "-.--");
	        morseValue.put("Z", "--..");
	        morseValue.put("0", "-----");
	        morseValue.put("1", ".----");
	        morseValue.put("2", "..---");
	        morseValue.put("3", "...--");
	        morseValue.put("4", "....-");
	        morseValue.put("5", ".....");
	        morseValue.put("6", "-....");
	        morseValue.put("7", "--...");
	        morseValue.put("8", "---..");
	        morseValue.put("9", "----.");
	        morseValue.put(".", ".-.-.-");
	        morseValue.put(",", "--..--");
	        morseValue.put(":", "---...");
	        morseValue.put("?", "..--..");
	        morseValue.put("'", ".----.");
	        morseValue.put("-", "-....-");
	        morseValue.put("/", "-..-.");
	        morseValue.put("\"", ".-..-.");
	        morseValue.put("@", ".--.-.");
	        morseValue.put("=", "-...-");
	        morseValue.put("!", "−.−.−−");
	        return morseValue;
	    }

}
