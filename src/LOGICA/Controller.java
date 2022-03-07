/**
 * 
 */
package LOGICA;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author DanielaAGonzalezH
 * @Version 1.0 @fecha 06/03/2022
 * 
 *
 */
public class Controller {
	
	ArrayList<Cliente> listaCliente = new ArrayList<>();
	Cliente cliente= new Cliente();
	
	
	public Controller() {	
	}
	/**	 * Método que se encarga de imprimir el menú y
	 * @return la opción que elige el usuario
	 */
	public int imprimirMenu() {
		String cadena= "";
		System.out.println("*********************************");
		System.out.println("              Menú               ");
		System.out.println("*********************************");
		cadena = "\nPresione 1. para Crear Carro   "+
		          "\nPresione 2 para Crear Moto     "+
				  "\nPresione 3. para generar informe individual de un determinado cliente"+
		          "\nPresione 4. para general el informe general de todos los cliente"+
		          "\nPresione 5. para salir del menú";
		System.out.println("**********************************");
		int opcion = leerInt(cadena);
		return opcion; 	}
	/**
	 * Método que lee un número entero
	 * @param mensaje
	 * @return
	 */
	public int leerInt(String mensaje) {
		Scanner dato= new Scanner(System.in);
		System.out.println(mensaje);
		int numero = dato.nextInt();
		return numero;
	}
	/**
	 * Método que lee la cadena 
	 * @param mensaje
	 * @return
	 */
	public String leerCadena(String mensaje) {
		Scanner dato= new Scanner(System.in);
		System.out.println(mensaje);
		String cadena = dato.nextLine();
		return cadena;
	}
	/**
	 * Método que verifica si la moto tiene limitador
	 * @param mensaje
	 * @return un booleano indicando si tiene o no limitador la moto
	 */
	public boolean leerBooleano(String mensaje) {
		boolean respuesta = false;
		String respuesta2 = leerCadena(mensaje);
		if (respuesta2.equals("S")) { 
			respuesta = true;
		} else {
			respuesta = false;
		}
		return respuesta;
	}
	/**
	 * Método que crear un carro
	 * @return una instancia de tipo carro
	 */
	public Carro crearCarro() {
		String placa = leerCadena("Ingrese la placa del carro: ");
		String marca = leerCadena("Ingrese la marca del carro: ");
		int modelo   = leerInt("Ingrese el modelo del carro: "  );
		int ancho    = leerInt("Ingrese el ancho del carro: "   );
		int alto     = leerInt("Ingrese el alto del carro:   "  );
		Carro carro = new Carro(placa, marca, modelo, ancho, alto);
		
		return carro;
	}
	/**
	 * Método que crea un moto
	 * @return una instancia de tipo Moto
	 */
	public Moto crearMoto() {
		String placa = leerCadena("Ingrese la placa de la moto: ");
		String marca = leerCadena("\nIngrese la marca de la moto: ");
		int modelo   = leerInt("\nIngrese el modelo de la moto: "  );
		boolean limitador = leerBooleano("\nLa moto tiene limitador : Si 'S' o No 'N'");
		Moto moto = new Moto(placa, marca, modelo, limitador);
		return moto;
	}	
	/**
	 * Método que crea los talleres y propietarios en un array list de Strings
	 */
	public static void crearArrayListTalleresPropietarios() {
		ArrayList<String> listaTelefono = new ArrayList<>();
		listaTelefono.add("606381732");
		listaTelefono.add("2132532");
		
		Propietario propietario = new Propietario("Carlos", "Peréz", "29432100",listaTelefono,"Calle 6 # 8-12");
		ArrayList <Taller> listaTaller = new ArrayList <Taller>();
		Taller taller1 = new Taller("Taller Mecánico Ruedas","Calle 12 #8-33",propietario);
		listaTaller.add(taller1);
		
		ArrayList<String> listaTelefonoPropietario2 = new ArrayList<>();
		listaTelefonoPropietario2.add("606381732");
		listaTelefonoPropietario2.add("2132532");
		
		Propietario propietario2 = new Propietario("Oscar", "Sabogal", "329510044", listaTelefonoPropietario2 , "Carrera 8 #2-10");
		ArrayList <Taller> listaTaller2 = new ArrayList <Taller>();
		Taller taller2 = new Taller("AutoRep Express","Avenida Bolívar Carrera 19# 127d-55",propietario2);
		listaTaller2.add(taller2);
		
	}
	/**
	 * Método que crea un cliente 
	 * @param carro
	 * @param moto
	 * @return la instancia de un cliente
	 */
	public Cliente crearCliente(String cedula) {
		String nombre = leerCadena("\nIngrese el nombre  del cliente");
		String apellido = leerCadena("\nIngrese el apellido del cliente");
		ArrayList<String> telefono = crearTelefonos("\nIngrese el número telefónico ¿Cuántos? ");
		Cliente cliente = new Cliente(cedula, nombre, apellido,telefono);
		return cliente;
	}
	/**
	 * Método que crea los telefónos y los almacena en un arrayList
	 * @param mensaje
	 * @return el array list de teléfonos
	 */
	public ArrayList<String> crearTelefonos(String mensaje){
		ArrayList<String> telefonos = new ArrayList<>();
		int numero = leerInt(mensaje);
		for(int i=0;i<numero;i++) {
			String numeros = leerCadena("Ingrese el número: ");
			telefonos.add(numeros);
		}
		return telefonos;
	}
	/**
	 * Método que busca al cliente con su cédula
	 * @param cedula
	 * @return si existe o no
	 */
	public boolean buscarCliente(String cedula) {
		boolean bandera = false; 
		if (listaCliente.size()!=0) {
			for (Cliente miCliente: listaCliente) {
				if (miCliente.getCedula().equals(cedula)) {
						bandera = true;
			        }
		    	}
			}
		else {
			System.out.println("En el momento no se encuentra registrado ningún cliente");
			bandera=false;
		}
		
		return bandera;
	}
	/**
	 * Si ya existe una lista cliente busca la cédula existente en esa lista y añade el 
	 * carro a ese cliente
	 * @param carro
	 * @param cedula
	 */
	public void añadirVehiculoClienteExistente(Carro carro,String cedula) {
		
		for (Cliente miCliente: listaCliente) {
			if (miCliente.getCedula().equals(cedula)) {
				miCliente.addCarro(carro);	
			}
		}
	}
	/**
	 * Si ya existe una lista cliente busca la cédula existente en esa lista y añade la
	 * moto a la lista del cliente
	 * @param moto
	 * @param cedula
	 */
	public void añadirMotoClienteExistente(Moto moto,String cedula) {
		for (Cliente miCliente: listaCliente) {
			if(miCliente.getCedula().equals(cedula)) {
				miCliente.addMoto(moto);
			}
		}
		System.out.println();
	}
	/**
	 * Método que genera el informe de acuerdo a un cliente que busca por su cédula
	 */
	public void generarInforme() {
		String cedula = leerCadena("Ingrese la cédula del cliente que desea generar el informe: ");
		String cadena = "";
		for (Cliente miCliente : listaCliente) {
			if (miCliente.getCedula().equals(cedula)) {
				cadena += "\n DATOS: \nNombre (s): " + miCliente.getNombre() + "\nApellido (s): "
						+ miCliente.getApellido(); 
				for(String telefono: miCliente.getTelefono()) {
					cadena +=  "\nTeléfono (s): "+telefono;
				}
				
				for (Carro carro : miCliente.getListaCarro()) {
						cadena += "\n Carros: Placa"+carro.getPlaca()+
								"\n Marca: "+carro.getMarca()+
								"\n Modelo :"+carro.getModelo()+
								"\n Ancho: "+carro.getAncho()+
								"\n Alto: "+carro.getAlto();
				}
				for (Moto  moto: miCliente.getListaMoto()) {
					cadena += "\n Motos: Placa"+moto.getPlaca()+
							"\n Marca: "+moto.getMarca()+
							"\n Modelo :"+moto.getModelo()+
							"\n limitador: "+(moto.isLimitador()?"SI":"NO");
				}
			}
			
		}
		System.out.println(cadena);
	}
	/**
	 * Método que genera el informe general de todos los clientes con 
	 * sus respectivos vehículos
	 */
	public void generainformeGENERAL() {
		String cadena ="";
		for (Cliente miCliente : listaCliente) {
				cadena += "\n DATOS: \nNombre (s): " + miCliente.getNombre() + "\nApellido (s): "
						+ miCliente.getApellido(); 
				for(String telefono: miCliente.getTelefono()) {
					cadena +=  "\nTeléfono (s): "+telefono;
				}
				for (Carro carro : miCliente.getListaCarro()) {
						cadena += "\n Carros: Placa"+carro.getPlaca()+
								"\n Marca: "+carro.getMarca()+
								"\n Modelo :"+carro.getModelo()+
								"\n Ancho: "+carro.getAncho()+
								"\n Alto: "+carro.getAlto();
				}
				for (Moto  moto: miCliente.getListaMoto()) {
					cadena += "\n Motos: Placa"+moto.getPlaca()+
							"\n Marca: "+moto.getMarca()+
							"\n Modelo :"+moto.getModelo()+
							"\n limitador: "+(moto.isLimitador()?"SI":"NO");
					}
				}
		System.out.println(cadena);
	}
		
	
	
	/**
	 * Método principal que itera el menú
	 */
	public void iniciarMenu() {
		boolean bandera =true;
		while(bandera) {
			int opcion = imprimirMenu();
			switch(opcion) {
			case 1:
				Carro carroNuevo = crearCarro();
				String cedula = leerCadena("Ingrese la cédula del cliente");
				if ( buscarCliente(cedula) == true) {
					añadirVehiculoClienteExistente(carroNuevo, cedula);
					System.out.println("¡ÉXITO! Vehículo agregado");
				}else {
					Cliente cliente =crearCliente(cedula);
					cliente.addCarro(carroNuevo);
					listaCliente.add(cliente);	
				}
				boolean pausa = leerBooleano("¿Desea agregar más vehículos? Si S No N");
				if (pausa == true) {
					bandera = true;
				}else {
					bandera =true;
				}
			break;
			case 2:
				Moto nuevaMoto = crearMoto(); 
				cedula = leerCadena("Ingrese la cédula del cliente");
				if ( buscarCliente(cedula) == true) {
					añadirMotoClienteExistente(nuevaMoto, cedula);
					System.out.println("¡ÉXITO! Vehículo agregado");
				}else {
					Cliente cliente =crearCliente(cedula);
					cliente.addMoto(nuevaMoto);
					listaCliente.add(cliente);	
				}
				pausa = leerBooleano("¿Desea agregar más vehículos? Si S No N");
				if (pausa == true) {
					bandera = true;
				}else {
					bandera = true;
				}
				break;
			case 3:
				generarInforme();
				bandera=true;
				break;
			case 4:
				generainformeGENERAL();
				bandera =true;
				break;
			case 5:
				System.out.println("Adiós");
				bandera = false;
				break;
			default:
				System.out.println("¡Error! Opción inválida");
				bandera =true;
			}		
		}	
	
	}
}
