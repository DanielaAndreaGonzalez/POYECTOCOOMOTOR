/**
 * 
 */
package LOGICA;

import java.util.ArrayList;

/**
 * @author DanielaAGonzalezH
 * @Version 1.0 @fecha 27/02/02
 * 	Clase que implementa el propietario del vehiculo que usa el serivicio del parqueadero 
 */
public class Persona implements Identificación{
	/*
	 * Atributos
	 */
	private String cedula;
	private String nombre;
	private String apellido;
	private  ArrayList<String> listaTelefonos; 
		
	/**
	 * Métodos de Obtención y Modificación (get y set)
	 * 
	 */
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public ArrayList<String> getTelefono(){
		return this.listaTelefonos;
	}
	public void setTelefono(String telefono) {
		this.listaTelefonos.add(telefono);
	}
	
	/**
	 * Método constructores
	 * @param cedula
	 * @param nombre
	 * @param apellido
	 * @param telefonos
	 */
	public Persona(String cedula,String nombre,String apellido,
			       ArrayList<String> listaTelefonos) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.listaTelefonos = listaTelefonos;
		
	}
	public Persona(String cedula,String nombre,String apellido) {
	this.cedula = cedula;
	this.nombre = nombre;
	this.apellido = apellido;
	}
	public Persona() {
		
	}
	/**
	 * Se está implementando el método de la clase interface Identificación
	 */
	@Override
	public boolean identificarse(String nombre, String codigo) {
		return true;
	}
	/**
	 * Método que se encarga de imprimir los datos de las personas
	 * 
	 */
	public void imprimir() { 
		System.out.println("***********Datos*********"
				           +"\nCédula: "+this.cedula    + "        *"
				           +"\nNombre: "+this.nombre    + "        *"
				           +"\nApellido: "+this.apellido+ "        *"
				           +"\n*************************"); }
	
	
	

}
