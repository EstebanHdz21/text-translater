package com.lifemiles.translater.morse;

import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class MorseConversion {

	public String textToMorse(String textoTraducir) {
		StringBuilder codificado = new StringBuilder();
		try {
			for (int i = 0; i < textoTraducir.length(); i++) {
				String result = String.valueOf(textoTraducir.charAt(i)).toUpperCase();
				String equivalencia = morseValues(result);
				if (equivalencia.equals("")) {
					codificado.append(" ");
				}
				codificado.append(equivalencia).append(" ");
			}
		} catch (Exception e) {
			return "Error al traducir: " + e.getMessage();
		}
		return codificado.toString();
	}

	public String getTextFromMorse(String morseText) {
		Map<String, String> equivalencias = MorseValue.getMorse();
		Set<String> claves = equivalencias.keySet();
		for (String clave : claves) {
			String morse = equivalencias.get(clave);
			if (morse.equals(morseText)) {
				return clave;
			}
		}
		return "";
	}

	public String morseToText(String value) {
		StringBuilder decodificado = new StringBuilder();
		try {
			String[] morse = value.split(" ");
			for (String result : morse) {
				String equivalencia = getTextFromMorse(result);
				decodificado.append(equivalencia);
			}
		} catch (Exception e) {
			return "Error al traducir: " + e.getMessage();
		}
		return decodificado.toString();
	}

	public static String morseValues(String value) {
		Map<String, String> equivalencias = MorseValue.getMorse();
		return equivalencias.getOrDefault(value, "");
	}
}
