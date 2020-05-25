package ar.edu.unq.po2.tp5SOLID.ejercicio2.parte2;

public class CreditoHipotecario extends SolicitudDeCredito{
	
	private Propiedad propiedadGarantia;
	
	public CreditoHipotecario(Cliente clienteSolicitador, int montoSolicitado, int plazo,Propiedad propiedadGarantia) {
		super(clienteSolicitador, montoSolicitado, plazo);
		this.propiedadGarantia = propiedadGarantia;
	}

	@Override
	public boolean esAceptable() {
		int plazoEnAnios = this.getPlazo() / 12;
		double cincuentaPorcientoDelSueldoDelCliente = this.getClienteSolicitador().getSueldoNetoMensual() * 0.5;
		double setentaPorCientoValorFiscal = propiedadGarantia.getValorFiscal() * 0.7;
		
		boolean noSupera50MontoMensual = this.montoCuotaMensual() <= cincuentaPorcientoDelSueldoDelCliente;
		boolean noSupera70ValorFiscal = this.getMontoSolicitado() <= setentaPorCientoValorFiscal;
		boolean terminaDePagarAntesDeLos65= this.getClienteSolicitador().getEdad() + plazoEnAnios < 65;
		
		return  noSupera50MontoMensual && noSupera70ValorFiscal && terminaDePagarAntesDeLos65;
	}

}
