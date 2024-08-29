package ej1;

import java.time.LocalDate;

public class Recibo {
	private String nombreDeEmpleado;
	private LocalDate fechaDeEmision;
	private float sueldoBruto;
	private float sueldoNeto;
	private String conceptos;
	
	public Recibo(String nombreDeEmpleado, LocalDate fechaDeEmision, float sueldoBruto, float sueldoNeto) {
		this.nombreDeEmpleado = nombreDeEmpleado;
		this.fechaDeEmision = fechaDeEmision;
		this.sueldoBruto = sueldoBruto;
		this.sueldoNeto = sueldoNeto;
	}
	
	public void desgloceDeConceptos(Empleado empleado) {
		conceptos = "Obra social: " 		+ empleado.obraSocial() + "/n"
				+ "Aportes jubilatorios: " 	+ empleado.aporteJubilatorio() + "/n"
				+ "Retenciones: "		    + empleado.retenciones();
	}

	private String getConceptos() {
		return conceptos;
	}
}
