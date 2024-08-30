package ej1;

import java.util.Calendar;

public abstract class Empleado {
	protected int añoDeNacimiento;
	protected String nombre;
	protected String direccion;
	protected String estadoCivil;
	protected float sueldoBasico;
 
	public int edad() {
		return getAñoDeNacimiento() - Calendar.YEAR;
	}
	
	public abstract float retenciones();
	
	public abstract float calcularSueldoBruto();
	
	public abstract float obraSocial();
	
	public abstract int aporteJubilatorio();
	
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

	public int getAñoDeNacimiento() {
		return añoDeNacimiento;
	}

	public void setAñoDeNacimiento(int añoDeNacimiento) {
		this.añoDeNacimiento = añoDeNacimiento;
	}
}
