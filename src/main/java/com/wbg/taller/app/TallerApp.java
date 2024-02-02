package com.wbg.taller.app;

import com.wbg.taller.app.animal.Gato;
import com.wbg.taller.app.animal.Perro;

public class TallerApp {

	public static void main(String[] args) {

		Gato gato = new Gato();
		gato.arunia();
		gato.duerme();
		gato.nombre(" pepe ");
		gato.calcularEdad(1994, 2024);

		Perro perro = new Perro();
		perro.correr();
		perro.ladrar();
		perro.nombre("firulais");

	}

}
