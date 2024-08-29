package ej1;

import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;

public class Empresa {
	private String nombre;
	private String cuit;
	private List<Empleado> cojuntoDeEmpleados; 
	private List<Recibo> listaDeRecibos; 
	
	public Empresa(String nombre, String cuit) {
		this.nombre = nombre;
		this.cuit = cuit;
		this.cojuntoDeEmpleados = new ArrayList<>();
		this.listaDeRecibos = new ArrayList<>();
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
	
	public void liquidacionDeSueldo() {
		for(Empleado empleado : this.cojuntoDeEmpleados) {
			this.listaDeRecibos.add(this.crearReciboDeEmpleado(empleado));
		}
	}
	
	private Recibo crearReciboDeEmpleado(Empleado empleado) {
		return new Recibo(empleado.getNombre(), Calendar.DATE, empleado.CalcularSueldoBruto(), empleado.SueldoNeto());
	}
}
