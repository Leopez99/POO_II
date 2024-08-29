package ej1;

import java.util.Calendar;

public abstract class Empleado {
	private int añoDeNacimiento;
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private float sueldoBasico;
 
	public int edad() {
		return añoDeNacimiento - Calendar.YEAR;
	}
	
	public abstract float retenciones();
	
	public abstract float calcularSueldoBruto();
	
	public float SueldoNeto() { 
		return retenciones() - calcularSueldoBruto();
	}

	public float getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(float sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
