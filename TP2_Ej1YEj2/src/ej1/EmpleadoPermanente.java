package ej1;

public class EmpleadoPermanente extends Empleado {
	private int cantidadDeHijos;
	private int antiguedad;
	private boolean tieneConyuge;
	
	@Override
	public float Retenciones() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float CalcularSueldoBasico() {
		return SalarioFamiliar() + this.sueldoBasico;
	}
	
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
	
	private int AsignacionPorConyuge() {
		int dinero = 50;
		return this.CantidadSiTieneConyuge() + dinero * this.cantidadDeHijos;
	}

}
