package ar.edu.unq.po2.tp5.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.Agencia;
import ar.edu.unq.po2.tp5.Caja;
import ar.edu.unq.po2.tp5.Cliente;
import ar.edu.unq.po2.tp5.Gas;
import ar.edu.unq.po2.tp5.Impuesto;
import ar.edu.unq.po2.tp5.Internet;
import ar.edu.unq.po2.tp5.ProductoCooperativa;
import ar.edu.unq.po2.tp5.ProductoEmpresa;
import ar.edu.unq.po2.tp5.Servicio;

class MercadoTest {

	Caja caja1; 
	Cliente cliente1;
	ProductoCooperativa leche;
	ProductoEmpresa chocolate;
	Servicio internet;
	Impuesto gas;
	Agencia fibertel;
	Agencia metrogas;
	@BeforeEach
	public void setUp() {
		caja1= new Caja(1);
		cliente1 = new Cliente("pepito");
		leche = new ProductoCooperativa(100d,5);
		chocolate = new ProductoEmpresa(50d,10);
		internet = new Servicio(5d,100d,fibertel);
		gas = new Impuesto(2500d,metrogas);
		fibertel = new Internet();
		metrogas = new Gas();
	}
	@Test
	void compra2Lechesy3Chocolates() {
		cliente1.agregarProductoAlCarro(leche);
		cliente1.agregarProductoAlCarro(leche);
		cliente1.agregarProductoAlCarro(chocolate);
		cliente1.agregarProductoAlCarro(chocolate);
		cliente1.agregarProductoAlCarro(chocolate);
		assertEquals("El precio total es 330.0",cliente1.adquirirProductos(caja1));
		assertEquals(3,leche.getStock());
		assertEquals(7,chocolate.getStock());
	}
	
	@Test
	
	void compra2Leche3ChocolatesPagaInternetYGas() {
		cliente1.agregarProductoAlCarro(leche);
		cliente1.agregarProductoAlCarro(leche);
		cliente1.agregarProductoAlCarro(chocolate);
		cliente1.agregarProductoAlCarro(chocolate);
		cliente1.agregarProductoAlCarro(chocolate);
		cliente1.agregarProductoAlCarro(gas);
		cliente1.agregarProductoAlCarro(internet);
		assertEquals("El precio total es 3330.0",cliente1.adquirirProductos(caja1));
		assertEquals(3,leche.getStock());
		assertEquals(7,chocolate.getStock());
		assertEquals(false,internet.puedeAgregarse());
		assertEquals(0,gas.getCantidad());
	}

}
