/**
 * 
 */
package LOGICA;

/**
 * @author DanielaAGonzalezH
 * @version 1.0
 */
public class Carro extends Vehiculo{
	
	public int ancho;
	public int alto;
	
	/*
	 * Métodos de Acceso
	 */
	public int getAncho() {
		return ancho;
	}
	public int getAlto() {
		return alto;
	}
	/*
	 * Métodos Modificadores
	 */
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public void setAlto(int alto) {
		this.alto = alto;
	}
	/**
	 * M�todo Constructor 
	 * @param placa
	 * @param marca
	 * @param modelo
	 * @param ancho
	 * @param alto
	 */
	public Carro(String placa,String marca,int modelo,int ancho, int alto) {
		//Se llama al constructor de la clase padre o superclase
		super(placa,marca,modelo);
		this.ancho=ancho;
		this.alto = alto;
	}
	public Carro(String placa) {
		super(placa);
	}
	public Carro() {
		
	}
	@Override
	public void imprimir() {
		Carro carro = new Carro();
		carro.imprimir();
		System.out.println("Alto");			
	}
	
	

}
