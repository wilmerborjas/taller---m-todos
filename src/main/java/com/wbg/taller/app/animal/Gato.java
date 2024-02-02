package com.wbg.taller.app.animal;

public class Gato {

	public void arunia() {
		System.out.println("el gato me aruño");
	}

	public void duerme() {
		System.out.println("el gato esta dormido");
	}

	public void nombre(String nombre) {
		System.out.println(" el nombre del gato = " + nombre);

	}

	public void calcularEdad(int anioNacimiento, int anioActual) {
		int edad = anioActual - anioNacimiento;
		System.out.println(" la edad del gato = " + edad);

	}

}
