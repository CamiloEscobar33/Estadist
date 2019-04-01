package ui;

import model.*;

import java.util.Scanner;

public class Main {

	//Atributos	
	private Rectangle rectangle;

	private Scanner scanner;
		

	public Main(){

	scanner = new Scanner(System.in);
	
	
	}

	public static void main (String[] args) {

		Main main = new Main();
		main.MostrarResultados();
	}

	public void MostrarResultados() {

		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");

		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-Bienvenido a la Calculadora de Rectangulos_-_-_-_-_-_-_-_-_-_-_-_-");

		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");

		System.out.println("\nDigite:");

		System.out.println("El Ancho");

		double ancho= scanner.nextDouble();

		System.out.println("El Largo");

		double largo= scanner.nextDouble();

		rectangle = new Rectangle (ancho, largo);

		double area = rectangle.calcularArea();

		double perimetro = rectangle.calcularPerimetro();

		double longitudDiagonal = rectangle.calcularDiagonal();

		System.out.println("El area de rectangulo es: " + area + "\nEl perimetro del rectangulo es: " + perimetro + "\nLa longitud del la diagonal del rectangulo es: " + longitudDiagonal);		
	}

}


