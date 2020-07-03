package ar.edu.unq.po2.tp10Refactoring.Cuenta;

public class CajaAhorro extends CuentaBancaria{

	public CajaAhorro(HistorialMovimientos historialDeMovimientos, Notificador notificador, Integer saldo) {
		super(historialDeMovimientos, notificador, saldo);
	}

	@Override
	public void extraer(Integer monto) {
		if(this.saldo >= monto) {
			this.saldo = saldo - monto;
			this.regitrarMovimiento("Extracción", monto);
			this.notificador.notificarNuevoSaldoACliente(this);
		}
	}
	
	//tanto en caja de ahorro y cuenta bancaria exite codigo repetido a la hora de registrar movimiento y notificiar
	//se crean metodos para cada logica y se los agrega en la clase abstracta de la cual se extienden

}
