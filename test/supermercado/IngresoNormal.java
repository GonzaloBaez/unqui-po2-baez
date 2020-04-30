package supermercado;

public class IngresoNormal implements Ingreso{

	private String mesPercepcion;
	private String concepto;
	private int montoPercibido;
	
	public IngresoNormal(String mesPercepcion, String concepto, int montoPercibido) {
		super();
		this.mesPercepcion = mesPercepcion;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
	}
	
	

	@Override
	public int getMontoPercibido() {
		// TODO Auto-generated method stub
		return montoPercibido;
	}

	@Override
	public int getMontoImponibleAlIngreso() {
		// TODO Auto-generated method stub
		return montoPercibido;
	}
	
}
