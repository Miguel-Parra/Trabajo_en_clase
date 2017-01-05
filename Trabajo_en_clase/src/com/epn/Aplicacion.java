package com.epn;

public class Aplicacion {

	public static void main(String[] args) {
		
		String id1="1713261061";
		String nombre1="Carlos";
		String apellido1="Intriago";
		
		
		String id2="049985421";
		String nombre2="Patricia";
		String apellido2="Fonseca";
		
		String id3="198788955";
		String nombre3="David";
		String apellido3="Navarrete";
		
		Profesor p1=new Profesor(id1,nombre1,apellido1);
		Profesor p2=new Profesor(id2,nombre2,apellido2);
		Profesor p3=new Profesor(id3,nombre3,apellido3);
		
		
		String id4="1185963254";
		String nombre4="Dennis";
		String apellido4="Cabrera";
		int edad1=15;
		
		String id5="1325145698";
		String nombre5="Lorena";
		String apellido5="Mora";
		int edad2=16;
		
		String id6="1722305230";
		String nombre6="Miguel";
		String apellido6="Parra";
		int edad3=14;
		
		Alumno a1=new Alumno(id4,nombre4,apellido4,edad1);
		Alumno a2=new Alumno(id5,nombre5,apellido5,edad2);
		Alumno a3=new Alumno(id6,nombre6,apellido6,edad3);
		
		
	   String nom1="Sistemas";
	   Profesor [] profesores1={p1,p2};
       Alumno[] alumnos1={a1};
       
       String nom2="Estructuras";
	   Profesor [] profesores2={p2,p3};
       Alumno[] alumnos2={a2,a3};
       
       String nom3="Arquitectura de Computadores";
	   Profesor [] profesores3={p1};
       Alumno[] alumnos3={a1,a2};
       
       String nom4="Matematicas";
	   Profesor [] profesores4={p2};
       Alumno[] alumnos4={a1,a2,a3};
       
       Materia m1= new Materia(nom1,profesores1,alumnos1);
       Materia m2= new Materia(nom2,profesores2,alumnos2);
       Materia m3= new Materia(nom3,profesores3,alumnos3);
       Materia m4= new Materia(nom4,profesores4,alumnos4);
       
      Materia materias[]={m1,m2,m3,m4};
			
			Sistema c=new Sistema(materias);
			
			System.out.println(c.matPorProf("1713261061"));
	
	}

}

