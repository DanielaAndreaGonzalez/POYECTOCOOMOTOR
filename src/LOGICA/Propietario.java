/**
 * 
 */
package LOGICA;

import java.util.ArrayList;

/**
 * @author DanielaAGonzalezH
 * @version 1.0
 */
public class Propietario extends Persona{
	/**
	 * Atributos
	 */
	private String direccion;
	
	/**
	 * M�todo get que obtiene el valor de direcci�n
	 * @return direccion
	 */
	public String getDireccion() {
		return this.direccion;
	}
	/**
	 * M�todo que modifica el valor de direcci�n
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * M�todo constructor
	 * @param cedula
	 * @param nombre
	 * @param apellido
	 * @param telefonos
	 * @param direccion
	 */
	public Propietario(String cedula, String nombre, String apellido, ArrayList<String> telefonos, String direccion) {
		super(cedula, nombre, apellido, telefonos);
		this.direccion = direccion;
	}
	public Propietario(String cedula, String nombre, String telefono) {
		super(cedula,nombre,telefono);
	}
	
	
	

}
