/**
 * 
 */
package LOGICA;

/**
 * @author DanielaAGonzalezH
 * @version 1.0
 */
public abstract class Vehiculo implements Identificación{
	
	/**
	 * Atributos
	 */
	private String placa;
	private String marca;
	private int modelo;
	/*
	 * Métodos de Acceso
	 */
	public String getPlaca() {
		return placa;
	}
	public String getMarca() {
		return marca;
	}
	public int getModelo() {
		return modelo;
	}
	/*
	 * MÃ©todos Modificadores
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	/**
	 * Método constructor
	 * @param placa
	 * @param marca
	 * @param modelo
	 */
	public Vehiculo(String placa,String marca,int modelo) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
	}
	public Vehiculo(String placa) {
		this.placa = placa;
	}
	public Vehiculo() {
		
	}

	/**
	 * Se está implementando el método de la clase interface Identificación
	 */
	@Override
	public boolean identificarse(String nombre, String codigo) {
		return true;
	}
	public void imprimir() {
		System.out.println("Datos del carro: "+
							"\n Placa: "+this.placa+
							"\n Marca: "+this.marca+
							"\n Modelo: "+this.modelo);	
	}
	
	
}
