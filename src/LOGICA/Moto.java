/**
 * 
 */
package LOGICA;

/**
 * @author DanielaAGonzalezH
 * @version 1.0
 */
public class Moto extends Vehiculo{
	/**
	 * Atributos
	 */
	public boolean limitador;
	/*
	 * Métodos de Acceso
	 */
	public boolean isLimitador() {
		return limitador;
	}
	/*
	 * Métodos Modificadores
	 */
	public void setLimitador(boolean limitador) {
		this.limitador = limitador;
	}
	/**
	 * M�todos constructores
	 * @param placa
	 * @param marca
	 * @param modelo
	 * @param limitador
	 */
	public Moto(String placa, String marca, int modelo,boolean limitador) {
		super(placa,marca,modelo);
		this.limitador = limitador;
	}
	public Moto(String placa) {
		super(placa);
	}
	
	
	public void aja() {
		
	}

}
