package ej1;

public class EmpleadoPermanente extends Empleado {
	private int cantidadDeHijos;
	private int antiguedad;
	private boolean tieneConyuge;
	
	@Override
	public float retenciones() {
		return this.ObraSocial() + this.AporteJubilatorio();
	}

	@Override
	public float calcularSueldoBruto() {
		return SalarioFamiliar() + this.getSueldoBasico() + this.antiguedad();
	}
	//Calculos para el sueldo bruto
	private int SalarioFamiliar() {
		return this.AsignacionPorConyuge() + this.AsignacionPorHijo();
	}
	
	public int AsignacionPorHijo() {
		int dinero = 150;
		return this.cantidadDeHijos * dinero;
	}
	
	private int cantidadSiTieneConyuge() {
		 return tieneConyuge ? 100 : 0;
	}
	
	public int antiguedad() {
		int dinero = 50;
		return this.antiguedad * dinero;
	}
	
	public int AsignacionPorConyuge() {
		int dinero = 50;
		return this.cantidadSiTieneConyuge() + dinero * this.cantidadDeHijos;
	}
	//Calculos para retenciones
	public float ObraSocial() {
		int dinero = 20; 
		return (float) (this.calcularSueldoBruto() * 0.1 + dinero * this.cantidadDeHijos);
	}
	
	public float AporteJubilatorio() {
		return (float) (this.calcularSueldoBruto() * 0.15);
	}

}
