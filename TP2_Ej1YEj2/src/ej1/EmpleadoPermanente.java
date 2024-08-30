package ej1;

public class EmpleadoPermanente extends Empleado {
	private int cantidadDeHijos;
	private int antiguedad;
	private boolean tieneConyuge;
	
	public EmpleadoPermanente(int cantidadDeHijos, int antiguedad, boolean tieneConyuge, float sueldoBasico) {
		this.cantidadDeHijos = cantidadDeHijos;
		this.antiguedad = antiguedad;
		this.tieneConyuge = tieneConyuge;
		this.sueldoBasico = sueldoBasico;
	}
	
	@Override
	public float retenciones() {
		return this.obraSocial() + this.aporteJubilatorio();
	}

	@Override
	public float calcularSueldoBruto() {
		return salarioFamiliar() + this.getSueldoBasico() + this.antiguedad();
	}
	
	@Override
	public float obraSocial() {
		int dinero = 20; 
		return (float) (this.calcularSueldoBruto() * 0.1 + dinero * this.cantidadDeHijos);
	}
	
	@Override
	public int aporteJubilatorio() {
		return (int) (this.calcularSueldoBruto() * 0.15);
	}
	
	private int salarioFamiliar() {
		return this.asignacionPorConyuge() + this.asignacionPorHijo();
	}
	
	public int asignacionPorHijo() {
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
	
	public int asignacionPorConyuge() {
		int dinero = 50;
		return this.cantidadSiTieneConyuge() + dinero * this.cantidadDeHijos;
	}

}
