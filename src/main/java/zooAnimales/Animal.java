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
		totalAnimales++;
	}
	public Animal() {
		this(null, 0, null, null);
		Animal.totalAnimales++;
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
		int Anf=0;
		for (int i=0;i<Anfibio.getListado().size();i++) {
			Anf++;
		}
		int Av=0;
		for (int i=0;i<Ave.getListado().size();i++) {
			Av++;
		}
		int Mam=0;
		for (int i=0;i<Mamifero.getListado().size();i++) {
			Mam++;
		}
		int Pe=0;
		for (int i=0;i<Pez.getListado().size();i++) {
			Pe++;
		}
		int Rep=0;
		for (int i=0;i<Reptil.getListado().size();i++) {
			Rep++;
		}
		return ("Mamiferos:"+Integer.toString(Mam)+'\n'+"Aves:"+Integer.toString(Av)+'\n'+"Reptiles:"+Integer.toString(Rep)+'\n'+"Peces:"+Integer.toString(Pe)+'\n'+"Anfibios:"+Integer.toString(Anf));
	}
	public String toString() {
		if(zona==null) {
			return ("Mi nombre es "+nombre+", tengo una edad de "+Integer.toString(edad)+", habito en "+habitat+" y mi genero es "+genero);
		}
		else {
			return("Mi nombre es "+nombre+", tengo una edad de "+Integer.toString(edad)+", habito en "+habitat+" y mi genero es "+genero+", la zona en la que me ubico es "+zona.getNombre()+", en el "+zona.getZoo().getNombre());

		}
		
	}
	
}
