package ej1;

import java.util.Calendar;

public abstract class Empleado {
	protected int añoDeNacimiento;
	protected String nombre;
	protected String direccion;
	protected String estadoCivil;
	protected float sueldoBasico;
 
	public int Edad() {
		return añoDeNacimiento - Calendar.YEAR;
	}
	
	public abstract float Retenciones();
	
	public abstract float CalcularSueldoBruto();
	
	public float SueldoNeto() { 
		return Retenciones() - CalcularSueldoBruto();
	}
}
