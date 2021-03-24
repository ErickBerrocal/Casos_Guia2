package com.senati.eti;

import java.util.Scanner;

public class Caso11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese número [1-7]: ");
		int nd = sc.nextInt();
		
		String nombre_dia = "";
		
		switch (nd) {
		    case 1:
		    	nombre_dia = "Lunes";
		    	break;
		    case 2:
		    	nombre_dia = "Martes";
		    	break;
		    default:
		    	nombre_dia = "Desconocido";
		} // ALT + 125
		
		System.out.println("\n----- R E S U L T A D O -----");
		System.out.println("Día de la semana: " + nombre_dia.toUpperCase());

	}

}
