package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat,String genero,String colorPiel,boolean venenoso) {
		super(nombre,edad,habitat,genero);
		this.colorPiel=colorPiel;
		this.venenoso=venenoso;
		listado.add(this);
	}
	public Anfibio() {}
	
	public static ArrayList<Anfibio> getListado() {
		return listado;
	}
	
	public int cantidadAnfibios(){
		return listado.size();
	}
	public String movimiento(){
		return("Saltar");
	}
	public static void crearRana(String nombre,int edad,String genero){
		new Anfibio(nombre,edad,"selva",genero,"rojo",true);
		Anfibio.ranas++;
	}
	public static void crearSalamandra(String nombre,int edad,String genero){
		new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
		Anfibio.salamandras++;
	}
}
