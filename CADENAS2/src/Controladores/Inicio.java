package Controladores;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca una cadena palídroma o no: ");
		String cadena1 = sc.nextLine();

		boolean b1 = Palindromo(cadena1);

		System.out.println("La palabra es palídroma: " + b1);
		
	}

	public static boolean Palindromo(String s) {

		StringBuffer buffer = new StringBuffer(s);
		buffer.reverse();
		String data = buffer.toString();

		if (s.equals(data)) {
			return true;
		}
		return false;
	}
}
