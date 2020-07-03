package ar.edu.unq.po2.tp8Composite.parte2;

import java.util.ArrayList;
import java.util.List;

public class ShapeShifterLeaf implements IShapeShifter{

	private int valor;
	@Override
	public IShapeShifter compose(IShapeShifter shapeShifter) {
		ShapeShifterComposite combinacion =  new ShapeShifterComposite();
		combinacion.agregar(shapeShifter);
		combinacion.agregar(this);
		return combinacion;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public int deepest() {
		return 0;
	}

	@Override
	public IShapeShifter flat() {
		return this;
	}

	@Override
	public List<Integer> values() {
		ArrayList<Integer> valores= new ArrayList<Integer>();
		valores.add(this.valor);
		return valores;
	}
}
