package ar.edu.unq.po2.tp8Composite.parte2;

import java.util.ArrayList;
import java.util.List;

public class ShapeShifterComposite implements IShapeShifter{

	ArrayList<IShapeShifter> listaDeShapeShifter = new ArrayList<IShapeShifter>();
	
	@Override
	public IShapeShifter compose(IShapeShifter shapeShifter) {
		ShapeShifterComposite combinacion =  new ShapeShifterComposite();
		combinacion.agregar(shapeShifter);
		combinacion.agregar(this);
		return combinacion;
	}

	@Override
	public int deepest() {
		IShapeShifter primerShapeShifter = this.listaDeShapeShifter.get(0);
		IShapeShifter segunShapeShifter = this.listaDeShapeShifter.get(1);
		int ElDeMasProfundidad = Math.max(primerShapeShifter.deepest(), segunShapeShifter.deepest());
		return ElDeMasProfundidad+1;
	}


	@Override
	public IShapeShifter flat() {
		ShapeShifterComposite nuevoAplanado = new ShapeShifterComposite();
		List<Integer> numeros = this.values();
		for(int numero:numeros) {
			ShapeShifterLeaf nuevo = new ShapeShifterLeaf();
			nuevo.setValor(numero);
			nuevoAplanado.agregar(nuevo);
		}
		return nuevoAplanado;
	}

	@Override
	public List<Integer> values() {
		List<Integer> valores= new ArrayList<Integer>();
		for(IShapeShifter shapeShifter:listaDeShapeShifter) {
			valores.addAll(shapeShifter.values());
		}
		return valores;
	}
	public void agregar(IShapeShifter shapeShifter) {
		this.listaDeShapeShifter.add(shapeShifter);
	}

}
