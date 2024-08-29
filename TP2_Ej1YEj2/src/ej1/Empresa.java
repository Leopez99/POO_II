package ej1;

import java.time.LocalDate;
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
	
	public float totalSueldoNeto() {
		float contador = 0;
		for (Empleado empleado : cojuntoDeEmpleados) {
			contador += empleado.SueldoNeto();
		}
		return contador;
	}
	
	public float totalSueldoBruto() {
		float contador = 0;
		for (Empleado empleado : cojuntoDeEmpleados) {
			contador += empleado.calcularSueldoBruto();
		}
		return contador;
	}
	
	public float totalRetenciones() {
		float contador = 0;
		for (Empleado empleado : cojuntoDeEmpleados) {
			contador += empleado.retenciones();
		}
		return contador;
	}
	
	public void liquidacionDeSueldo() {
		for(Empleado empleado : this.cojuntoDeEmpleados) {
			this.listaDeRecibos.add(this.crearReciboDeEmpleado(empleado));
		}
	}
	
	private Recibo crearReciboDeEmpleado(Empleado empleado) {
		return new Recibo(empleado.getNombre(), LocalDate.now(), empleado.calcularSueldoBruto(), empleado.SueldoNeto());
	}
}
