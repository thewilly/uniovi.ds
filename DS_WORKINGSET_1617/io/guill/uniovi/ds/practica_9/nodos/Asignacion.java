package io.guill.uniovi.ds.practica_9.nodos;

import io.guill.uniovi.ds.practica_9.contracts.Expresion;
import io.guill.uniovi.ds.practica_9.contracts.Sentencia;
import io.guill.uniovi.ds.practica_9.contracts.Visitor;

public class Asignacion implements Sentencia {
	public Variable variable;
	public Expresion expr;

	public Asignacion(Variable variable, Expresion expr) {
		this.variable = variable;
		this.expr = expr;
	}

	@Override
	public Object accept(Visitor v, Object param) {
		return v.visit(this, param);
	}

}
