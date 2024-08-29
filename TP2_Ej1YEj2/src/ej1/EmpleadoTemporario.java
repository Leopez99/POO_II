package ej1;

public class EmpleadoTemporario extends Empleado {
	private int horasExtras;
	private int anioDeFinDeContrato;
	
	@Override
	public float retenciones() {
		return this.obraSocial() + this.AporteJubilatorio();
	}

	@Override
	public float calcularSueldoBruto() {
		return this.getSueldoBasico() + this.calculoHorasExtras(40);
	}
	
	//Calculo para sueldo bruto
	private int calculoHorasExtras(int dineroPorHora) {
		return this.horasExtras * dineroPorHora;
	}
	
	//Calculos para retenciones
	public int obraSocial() {
		return (int) (this.calcularSueldoBruto() * 0.1 + this.superaEdad(50));
	}
	
	private int superaEdad(int aniosASuperar) {
		int dinero = 25;
		return this.edad() > aniosASuperar ? dinero : 0;
	}
	
	public int AporteJubilatorio() {
		return (int) (this.calcularSueldoBruto() + this.calculoHorasExtras(5));
 	}

}
