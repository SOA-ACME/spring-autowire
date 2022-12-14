package com.trifulcas.springprueba;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("miSaludo")
public class Saludos {
	
	private ISaludo _saludo;
	
	@Autowired
	public Saludos(ISaludo miSaludo) {
		_saludo=miSaludo;
	}
	public String hola() {
		return _saludo.hola();
	}
	public String adios() {
		return _saludo.adios();
	}
}
