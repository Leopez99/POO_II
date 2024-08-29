package ej1;

public class EmpleadoTemporario extends Empleado {
	private int horasExtras;
	private int anioDeFinDeContrato;
	
	@Override
	public float retenciones() {
		return this.obraSocial() + this.aporteJubilatorio();
	}

	@Override
	public float calcularSueldoBruto() {
		return this.getSueldoBasico() + this.calculoHorasExtras(40);
	}
	
	@Override
	public float obraSocial() {
		return (float) (this.calcularSueldoBruto() * 0.1 + this.superaEdad(50));
	}
	
	@Override
	public int aporteJubilatorio() {
		return (int) (this.calcularSueldoBruto() + this.calculoHorasExtras(5));
	}
	
	private int superaEdad(int aniosASuperar) {
		int dinero = 25;
		return this.edad() > aniosASuperar ? dinero : 0;
	}
	
	private int calculoHorasExtras(int dineroPorHora) {
		return this.horasExtras * dineroPorHora;
	}

}
