package ej1;

public class Concepto {
	private Empleado empleado;
	
	public Concepto(Empleado empleado) {
		this.empleado = empleado;
	}
	public String mostrarObraSocial() {
		return "Obra social: " + empleado.obraSocial() + "$";
	}
	
	public String mostrarRetenciones() {
		return "Retenciones: " + empleado.retenciones() + "$";
	}
	
	public String mostrarAporteJubilatorio() {
		return "Aportes jubilatorios: " + empleado.aporteJubilatorio() + "$";
	}
}
