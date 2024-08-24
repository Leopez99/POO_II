package ej1;

import java.util.Date;

public abstract class Empleado {
	protected int añoDeNacimiento;
	protected String nombre;
	protected String direccion;
	protected String estadoCivil;
	protected float sueldoBasico;
 
	public int Edad(int añoActual) {
		return añoDeNacimiento - añoActual;
	}
	
	public abstract float Retenciones();
	
	public abstract float CalcularSueldoBruto();
	
	public float SueldoNeto() { 
		return Retenciones() - CalcularSueldoBruto();
	}
}
