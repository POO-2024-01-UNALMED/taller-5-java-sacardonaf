package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;
import zooAnimales.*;
import gestion.Zoologico;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public Animal(String nombre,int edad,String habitat,String genero) {
		this.nombre=nombre;
		this.edad=edad;
		this.habitat=habitat;
		this.genero=genero;
		this.zona=null;
		totalAnimales++;
	}
	public Animal() {
		this(null, 0, null, null);

	}
	
	protected void setNombre(String nombre) {
		this.nombre=nombre;
	}
	protected void setEdad(int edad) {
		this.edad=edad;
	}
	protected void setHabitat(String habitat) {
		this.habitat=habitat;
	}
	protected void setGenero(String genero) {
		this.genero=genero;
	}
	protected void setZona(Zona zona) {
		this.zona=zona;
	}
	public String movimiento() {
		return "desplazarse";
		
	}
	public static String totalPorTipo(){
		return "Mamiferos: " + Mamifero.getListado().size() + "\n" 
				+ "Aves: " + Ave.getListado().size() + "\n" 
				+ "Reptiles: " + Reptil.getListado().size() + "\n" 
				+ "Peces: " + Pez.getListado().size() + "\n" 
				+ "Anfibios: " + Anfibio.getListado().size();
	}
	public String toString() {
		if(getZona() == null) {
			return "Mi nombre es " + getNombre() 
					+ ", tengo una edad de " 
					+ getEdad() + ", habito en " 
					+ getHabitat() + " y mi genero es " 
					+ getGenero();
		} else {
			return "Mi nombre es " + getNombre() 
					+ ", tengo una edad de " 
					+ getEdad() + ", habito en " 
					+ getHabitat() + " y mi genero es " 
					+ getGenero() + " la zona en la que me ubico es " 
					+ getZona().getNombre() + ", en el " + getZona().getZoo().getNombre();
		}
		
	}
	public static int getTotalAnimales() {
		return Animal.totalAnimales;
	}
	
	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}

	
	public String getHabitat() {
		return habitat;
	}
	
	public String getGenero() {
		return genero;
	}

	public Zona getZona() {
		return zona;
	}
	
}
