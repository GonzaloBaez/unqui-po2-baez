package ar.edu.unq.po2.tp5SOLID.ejercicio2.parte2;

public class CreditoPersonal extends SolicitudDeCredito{

	public CreditoPersonal(Cliente clienteSolicitador, int montoSolicitado, int plazo) {
		super(clienteSolicitador, montoSolicitado, plazo);
		
	}

	@Override
	public boolean esAceptable() {
		
		double setentaPorcientoDelSueldoDelCliente = this.getClienteSolicitador().getSueldoNetoMensual() * 0.7;
		
		boolean gana15000OMas = this.getClienteSolicitador().sueldoAnual()>= 15000;
		boolean noSupera70MontoMensual = this.montoCuotaMensual() <= setentaPorcientoDelSueldoDelCliente;
		
		return gana15000OMas && noSupera70MontoMensual;
	}

}
