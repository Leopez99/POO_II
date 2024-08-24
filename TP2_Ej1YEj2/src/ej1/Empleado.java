package ej1;

import java.util.Date;

public abstract class Empleado {
	protected int añoDeNacimiento;
	protected String nombre;
	protected String direccion;
	protected String estadoCivil;
	protected float sueldoBasico;
 
	public int Edad(int añoActual) {
		return añoDeNacimiento - añoActual; //Hice esto de diferente.
	}
	
	public abstract float Retenciones();
	
	public abstract float CalcularSueldoBasico();
	
	public float SueldoNeto() {
		return Retenciones() - CalcularSueldoBasico();
	}
}
