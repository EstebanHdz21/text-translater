package com.lifemiles.translater.service;

import com.lifemiles.translater.binary.BinaryConverter;
import com.lifemiles.translater.morse.MorseConversion;

public class TranslateService {

	private static final String TEXT = "TEXT";
	private static final String BINARY = "BINARY";
	private static final String MORSE = "MORSE";
	
	public String translate(String textoATraducir, String formatoOrigen, String formatoDestino) {
		MorseConversion morse = new MorseConversion();
		BinaryConverter binary = new BinaryConverter();
		String result = "";
		try {
		if(formatoOrigen.equals(MORSE) && formatoDestino.equals(TEXT)) {
			result = morse.morseToText(textoATraducir);
		}
		
		if(formatoOrigen.equals(TEXT) && formatoDestino.equals(MORSE)) {
			result = morse.textToMorse(textoATraducir);
		}
		
		if(formatoOrigen.equals(TEXT) && formatoDestino.equals(BINARY)) {
			binary.binaryToString(textoATraducir);
		}
		
		if(formatoOrigen.equals(BINARY) && formatoDestino.equals(TEXT)) {
			binary.stringToBinary(textoATraducir);
		}
		
		}catch (Exception e) {
			return "Ocurrio un error: " + e.getMessage();
		}
		return result;
	}
}
