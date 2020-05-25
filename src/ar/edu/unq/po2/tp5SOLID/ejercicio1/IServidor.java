package ar.edu.unq.po2.tp5SOLID.ejercicio1;

import java.util.List;

public interface IServidor {
	
	public List<Correo> recibirNuevos(String user, String pass);

	public void conectar(String nombreUsuario, String passusuario);

	public void enviar(Correo correo);
	
	public float tazaDeTransferencia();

	public void resetear();
	
	public void realizarBackUp();

}
