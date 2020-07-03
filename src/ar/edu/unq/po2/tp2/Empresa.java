package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Empresa {
	
	private String nombreEmp;
	private Float cuit;
	private ArrayList<ReciboDeSueldo> liquidaciones = new ArrayList<ReciboDeSueldo>();
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	
	public Empresa(String nombreEmp, Float cuit) {
		super();
		this.nombreEmp = nombreEmp;
		this.cuit = cuit;
	}
	
	public Float montoTotalSueldoBruto() {
		Float montoTotal = 0f;
		for(Empleado empleado:empleados) {
			montoTotal += empleado.sueldoBruto();
		}
		return montoTotal;
	}
	
	public Float montoTotalSueldoNeto() {
		Float montoTotal = 0f;
		for(Empleado empleado:empleados) {
			montoTotal += empleado.sueldoNeto();
		}
		return montoTotal;
	}
	
	public Float montoTotalRetenciones() {
		Float montoTotal = 0f;
		for(Empleado empleado:empleados) {
			montoTotal += empleado.retenciones();
		}
		return montoTotal;
	}
	
	public ReciboDeSueldo liquidacionEmpleado(Empleado empleado) {
		ReciboDeSueldo nuevaLiquidacion = 
				new ReciboDeSueldo(empleado.getNombre(),empleado.getDireccion(),LocalDate.now(),empleado.sueldoBruto(),empleado.sueldoNeto());
		return nuevaLiquidacion;
	}
	
	public void liquidacionesTotales() {
		for(Empleado empleado:empleados) {
			this.liquidaciones.add(this.liquidacionEmpleado(empleado));
		}
	}
}
