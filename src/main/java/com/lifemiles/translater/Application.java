package com.lifemiles.translater;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lifemiles.translater.service.TranslateService;

@SpringBootApplication
public class Application {
	
	
	public static void main(String[] args) {
		//Perdon no pude finalizar todos los escenarios.
		SpringApplication.run(Application.class, args);
		TranslateService service = new TranslateService();
		String result = "";
		String dato1 ="";
		String dato2 ="";
		String dato3 ="";
		System.out.println("Ingrese el texto a traducir");
		Scanner textoATraducir = new Scanner(System.in);
		dato1 = textoATraducir.nextLine();
		System.out.println("Ingrese el formato de origen");
		Scanner formatoOrigen = new Scanner(System.in);
		dato2 = formatoOrigen.nextLine();
		System.out.println("Ingrese el formato destino");
		Scanner formatoDestino = new Scanner(System.in);
		dato3 = formatoDestino.nextLine();
		result = service.translate(dato1, dato2, dato3);
		System.out.println(result);
	}

}
