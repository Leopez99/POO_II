package ej1;

import java.util.List;

public class Empresa {
	private String nombre;
	private String cuit;
	public List<String> cojuntoDeEmpleados; 
	
	public Empresa(String nombre, String cuit) {
		nombre = this.nombre;
		cuit = this.cuit;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getCuit() {
		return this.cuit;
	}
}
