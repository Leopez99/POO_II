package ej1;

import java.util.List;

public class Empresa {
	private String nombre;
	private String cuit;
	public List<Empleado> cojuntoDeEmpleados; 
	
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
	
	public float TotalSueldoNeto() {
		float contador = 0;
		for (Empleado empleado : cojuntoDeEmpleados) {
			contador += empleado.SueldoNeto();
		}
		return contador;
	}
	
	public float TotalSueldoBruto() {
		float contador = 0;
		for (Empleado empleado : cojuntoDeEmpleados) {
			contador += empleado.CalcularSueldoBruto();
		}
		return contador;
	}
	
	public float TotalRetenciones() {
		float contador = 0;
		for (Empleado empleado : cojuntoDeEmpleados) {
			contador += empleado.Retenciones();
		}
		return contador;
	}
	
	public float LiquidacionDeSueldo() {
		return this.TotalRetenciones() + this.TotalSueldoBruto() + this.TotalSueldoNeto();
	}
}
