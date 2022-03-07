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
public class Persona implements Identificaci�n{
	/*
	 * Atributos
	 */
	private String cedula;
	private String nombre;
	private String apellido;
	private  ArrayList<String> listaTelefonos; 
		
	/**
	 * M�todos de Obtenci�n y Modificaci�n (get y set)
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
	 * M�todo constructores
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
	 * Se est� implementando el m�todo de la clase interface Identificaci�n
	 */
	@Override
	public boolean identificarse(String nombre, String codigo) {
		return true;
	}
	/**
	 * M�todo que se encarga de imprimir los datos de las personas
	 * 
	 */
	public void imprimir() { 
		System.out.println("***********Datos*********"
				           +"\nC�dula: "+this.cedula    + "        *"
				           +"\nNombre: "+this.nombre    + "        *"
				           +"\nApellido: "+this.apellido+ "        *"
				           +"\n*************************"); }
	
	
	

}
