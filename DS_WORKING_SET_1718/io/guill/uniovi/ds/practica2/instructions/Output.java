package io.guill.uniovi.ds.practica2.instructions;

import io.guill.uniovi.ds.practica2.Computer;
import io.guill.uniovi.ds.practica2.IInstruction;

public class Output implements IInstruction {

	@Override
	public void operation(Computer comp) {
		System.out.println(new Pop().value(comp));
		new IncreaseIP().operation(comp);
	}

}
