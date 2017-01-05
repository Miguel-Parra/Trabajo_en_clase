package com.epn;

import java.util.Arrays;
import java.util.Vector;

import javax.swing.JOptionPane;

public class Materia {

private String nombre_;

private Profesor [] profesores_;
private Alumno[] alumnos_;



public Materia() {
	

	this.nombre_ ="Materias";
	this.profesores_= new Profesor[] {new Profesor(), new Profesor()};
	this.alumnos_ = new Alumno[] {new Alumno(), new Alumno()};
}




public Materia(String nombre_,Profesor[] profesores_, Alumno[] alumnos_) {
	super();

	this.nombre_ = nombre_;
	
	this.profesores_ = profesores_;
	this.alumnos_ = alumnos_;
}

public String getNombre_() {
	return nombre_;
}
public void setNombre_(String nombre_) {
	this.nombre_ = nombre_;
}


public Profesor[] getProfesores_() {
	return profesores_;
}
public void setProfesores_(Profesor[] profesores_) {
	this.profesores_ = profesores_;
}
public Alumno[] getAlumnos_() {
	return alumnos_;
}
public void setAlumnos_(Alumno[] alumnos_) {
	this.alumnos_ = alumnos_;
}




@Override
public String toString() {
	return "Materia [nombre_=" + nombre_ + ", profesores_="
			+ Arrays.toString(profesores_) + ", alumnos_=" + Arrays.toString(alumnos_) + "]";
}


public Boolean busProf(String idProf){
	
	for(int i=0; i<this.profesores_.length; i++){
		if(idProf.compareTo(this.profesores_[i].getId())==0){
		return true;
		}}
		return false;
		}
	

}





