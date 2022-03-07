/**
 * 
 */
package LOGICA;

import java.util.ArrayList;

/**
 * @author DanielaAGonzalezH
 * @version 1.0 @fecha 27/02/2022
 */
public class Taller {
	
	/**
	 * Atributos
	 */
	private String nombre;
	private String direccion;
	private Propietario duenio;
	private ArrayList<Cliente> listaCliente;
	/**
	 * Métodos de Obtención 
	 * 
	 */
	public String getNombre() {
		return nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public Propietario getDuenio() {
		return duenio;
	}
	public ArrayList<Cliente> getListaCliente(){
		return this.listaCliente;
	}
	/*
	 * Métodos de modificación
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setDuenio(Propietario duenio) {
		this.duenio = duenio;
	}
	public void addCliente(Cliente nuevoCliente) {
		this.listaCliente.add(nuevoCliente);
	}
	/*
	 * Métodos constructores
	 */
	public Taller(String nombre, String direccion, Propietario duenio, ArrayList<Cliente> listaCliente) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.duenio = duenio;
		this.listaCliente = listaCliente;
	}
	public Taller(String nombre, String direccion, Propietario duenio) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.duenio = duenio;
	}
	public Taller(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	
	

}
