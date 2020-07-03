package ar.edu.unq.po2.tp10Refactoring.Cuenta;

public abstract class CuentaBancaria {
	protected HistorialMovimientos historialDeMovimientos;
	protected Notificador notificador;
	protected int saldo;
	
	public CuentaBancaria(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo) {
		super();
		this.historialDeMovimientos = historialDeMovimientos;
		this.notificador = notificador;
		this.saldo = saldo;
	}

	public int getSaldo() {
		return saldo;
	}
	
	public void regitrarMovimiento(String operacion,int monto) {
		this.historialDeMovimientos.registrarMovimiento(operacion, monto);
	}
	
	public void notificarNuevoSaldoACliente(CuentaBancaria cuenta) {
		this.notificador.notificarNuevoSaldoACliente(cuenta);
	}
	
	public abstract void extraer(Integer monto);
}
