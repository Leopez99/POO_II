package ej1;

public class Recibo {
	private String nombreDeEmpleado;
	private int fechaDeEmision;
	private float sueldoBruto;
	private float sueldoNeto;
	
	public Recibo(String nombreDeEmpleado, int fechaDeEmision, float sueldoBruto, float sueldoNeto) {
		this.nombreDeEmpleado = nombreDeEmpleado;
		this.fechaDeEmision = fechaDeEmision;
		this.sueldoBruto = sueldoBruto;
		this.sueldoNeto = sueldoNeto;
	}
}
