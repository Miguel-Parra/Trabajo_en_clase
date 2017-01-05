package com.epn;

import javax.swing.JOptionPane;

public class Profesor  extends Persona  {
	
	
	
	public Profesor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Profesor(String id, String nombre1, String apellido1) {
		super(id, nombre1, apellido1);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return this.getId()+","+this.getNombre1()+","+ this.getApellido1();
	
		
		
		
		
		
	}
	
	
	
	
	
}




