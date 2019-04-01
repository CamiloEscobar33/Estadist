package model;

import java.lang.Math;

public class Rectangle {

	//Atributos	
	private double ancho;

	private double largo;

		

	public Rectangle(double ancho, double largo){

		this.ancho = ancho;

		this.largo = largo;
	}

	public double calcularArea() {

		double area = 0.0;
		
		area = ancho * largo;

		return area;
	}
 	
 	public double calcularPerimetro() {

		double perimetro = 0.0;
		
		perimetro = (ancho + largo) * 2;

		return perimetro;
	}

	public double calcularDiagonal() {

		double longitudDiagonal = 0.0;
		
		longitudDiagonal = (ancho * ancho) + (largo * largo);

		longitudDiagonal = Math.sqrt(longitudDiagonal);

		return longitudDiagonal;
	}

}