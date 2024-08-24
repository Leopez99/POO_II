package ej1;

public class EmpleadoTemporario extends Empleado {
	private int horasExtras;
	private int antiguedad;
	private int anioDeFinDeContrato;
	
	@Override
	public float Retenciones() {
		return this.ObraSocial() + this.AporteJubilatorio();
	}

	@Override
	public float CalcularSueldoBruto() {
		return this.sueldoBasico + this.CalculoHorasExtras(40);
	}
	
	//Calculo para sueldo bruto
	private int CalculoHorasExtras(int dineroPorHora) {
		return this.horasExtras * dineroPorHora;
	}
	
	//Calculos para retenciones
	private int ObraSocial() {
		return (int) (this.CalcularSueldoBruto() * 0.1 + this.SuperaEdad(50));
	}
	
	private int SuperaEdad(int aniosASuperar) {
		int dinero = 25;
		return this.Edad() > aniosASuperar ? dinero : 0;
	}
	
	private int AporteJubilatorio() {
		return (int) (this.CalcularSueldoBruto() + this.CalculoHorasExtras(5));
 	}

}
