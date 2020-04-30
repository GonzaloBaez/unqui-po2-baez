package supermercado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTest {

	Trabajador pepito;
	IngresoNormal ingreso1;
	IngresoNormal ingreso2;
	IngresoNormal ingreso3;
	IngresoNormal ingreso4;
	IngresoNormal ingreso5;
	IngresoNormal ingreso6;
	IngresoNormal ingreso7;
	IngresoNormal ingreso8;
	IngresoNormal ingreso9;
	IngresoNormal ingreso10;
	IngresoHorasExtras ingreso11;
	IngresoHorasExtras ingreso12;
	
	@BeforeEach
	public void setUp() {
		pepito = new Trabajador();
		ingreso1 =  new IngresoNormal("enero","nose",2000);
		ingreso2 =  new IngresoNormal("febero","nose",2000);
		ingreso3 =  new IngresoNormal("marzo","nose",2000);
		ingreso4 =  new IngresoNormal("abril","nose",2000);
		ingreso5 =  new IngresoNormal("mayo","nose",2000);
		ingreso6 =  new IngresoNormal("junio","nose",2000);
		ingreso7 =  new IngresoNormal("julio","nose",2000);
		ingreso8 =  new IngresoNormal("agosto","nose",2000);
		ingreso9 =  new IngresoNormal("septiembre","nose",2000);
		ingreso10 =  new IngresoNormal("octubre","nose",2000);
		ingreso11 =  new IngresoHorasExtras("noviembre","nose",3500,4);
		ingreso12 =  new IngresoHorasExtras("diciembre","nose",2500,2);
		pepito.agregarIngreso(ingreso1);
		pepito.agregarIngreso(ingreso2);
		pepito.agregarIngreso(ingreso3);
		pepito.agregarIngreso(ingreso4);
		pepito.agregarIngreso(ingreso5);
		pepito.agregarIngreso(ingreso6);
		pepito.agregarIngreso(ingreso7);
		pepito.agregarIngreso(ingreso8);
		pepito.agregarIngreso(ingreso9);
		pepito.agregarIngreso(ingreso10);
		pepito.agregarIngreso(ingreso11);
		pepito.agregarIngreso(ingreso12);
	}
	
	@Test
	void totalPercibidoDePepito() {
		assertEquals(26000,pepito.getTotalPercibido());
	}
	
	@Test
	void montoImponibleDePepito() {
		assertEquals(20000,pepito.getMontoImponible());
	}
	
	@Test
	void impuestoAPagarDePepito(){
		assertEquals(400,pepito.getImpuestoAPagar());
	}

}
