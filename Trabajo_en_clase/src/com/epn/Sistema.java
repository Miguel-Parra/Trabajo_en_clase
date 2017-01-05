package com.epn;

import javax.swing.JOptionPane;

public class Sistema {
	
	
private Materia[] materias;

public Sistema(Materia[] materias) {
	super();
	this.materias = materias;
}

public Sistema() {
	super();
	this.materias= new Materia[]{new Materia(),new Materia()};
}

public Materia[] getMaterias() {
	return materias;
}

public void setMaterias(Materia[] materias) {
	this.materias = materias;
}



public String matPorProf(String idProf){
	
	String matProf="";
	for(int i=0; i<this.materias.length; i++){
		if(materias[i].busProf(idProf)==true){
			matProf+= materias[i].toString()+"\n";
			}}
		if(matProf==""){
		return "El codigo "+idProf+" no existen en la lista de profesores";
		}else{		
			return "Las materias del profesor cuyo codigo es el "+idProf+" son las siguientes:\n"+matProf;
	}}





/*public String materiasPorProfesor(String idProfesor){
	for (){
		if(m.buscarProfesor(idProfesor)==true){
			return m.toString();
			
		}}
	return "No existe";

}*/

}

