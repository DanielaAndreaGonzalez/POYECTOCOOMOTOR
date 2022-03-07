/**
 * 
 */
package LOGICA;

import java.util.ArrayList;

/**
 * @author DanielaAGonzalezH
 * @version 1.0
 */
public class Cliente extends Persona{
	/**
	 * Atributos
	 */
	private ArrayList <Moto> listaMoto;
	private ArrayList <Carro> listaCarro;
	/**
	 * Métodos de obtención y modificación
	 * 
	 */
	 public ArrayList<Moto> getListaMoto(){
		 return this.listaMoto;
	 }
	 public ArrayList<Carro> getListaCarro(){
		 return this.listaCarro;
	 }
	 //public void addMoto(Moto nuevaMoto) {
		// this.listaMoto.add(nuevaMoto);
	 //}
	 public void addMoto(Moto nuevaMoto) {
		 this.listaMoto.add(nuevaMoto);
	 }	 
	 
	 public void addCarro(Carro nuevoCarro) {	 
		 this.listaCarro.add(nuevoCarro);
	 }
	/**
	 * Método Constructores
	 * @param cedula
	 * @param nombre
	 * @param apellido
	 * @param telefonos
	 * @param listadoMotos
	 * @param listadoCarros
	 */
	
	public Cliente(String cedula, String nombre, String apellido, 
			ArrayList<String> telefono, ArrayList<Moto> listaMoto,
			ArrayList<Carro> listaCarro) {
		// Llama al constructor de la super clase
		super(cedula, nombre, apellido, telefono);
		this.listaMoto = listaMoto;
		this.listaCarro = listaCarro;
	}

	public Cliente(String cedula, String nombre, String apellido,ArrayList <String> telefonos) {
		//	Llama al constructor de la super clase
		super(cedula, nombre, apellido,telefonos);
		this.listaMoto = new ArrayList<>();
		this.listaCarro = new ArrayList<>();	
	}
	
	public Cliente() {
		super();
	}
	
	
	
	
 
}
