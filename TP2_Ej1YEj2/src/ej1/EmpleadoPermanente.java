package ej1;

public class EmpleadoPermanente extends Empleado {
	private int cantidadDeHijos;
	private int antiguedad;
	private boolean tieneConyuge;
	
	@Override
	public float Retenciones() {
		return this.ObraSocial() + this.AporteJubilatorio();
	}

	@Override
	public float CalcularSueldoBruto() {
		return SalarioFamiliar() + this.getSueldoBasico() + this.Antiguedad();
	}
	//Calculos para el sueldo bruto
	private int SalarioFamiliar() {
		return this.AsignacionPorConyuge() + this.AsignacionPorHijo();
	}
	
	private int AsignacionPorHijo() {
		int dinero = 150;
		return this.cantidadDeHijos * dinero;
	}
	
	private int CantidadSiTieneConyuge() {
		 return tieneConyuge ? 100 : 0;
	}
	
	private int Antiguedad() {
		int dinero = 50;
		return this.antiguedad * dinero;
	}
	
	private int AsignacionPorConyuge() {
		int dinero = 50;
		return this.CantidadSiTieneConyuge() + dinero * this.cantidadDeHijos;
	}
	//Calculos para retenciones
	private float ObraSocial() {
		int dinero = 20; 
		return (float) (this.CalcularSueldoBruto() * 0.1 + dinero * this.cantidadDeHijos);
	}
	
	private float AporteJubilatorio() {
		return (float) (this.CalcularSueldoBruto() * 0.15);
	}

}
