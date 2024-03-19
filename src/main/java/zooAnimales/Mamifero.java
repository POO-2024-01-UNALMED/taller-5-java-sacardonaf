package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;

public class Mamifero extends Animal {
	private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero(String nombre, int edad, String habitat,String genero,boolean pelaje,int patas) {
		super(nombre,edad,habitat,genero);
		this.pelaje=pelaje;
		this.patas=patas;
		listado.add(this);
	}
	public Mamifero() {
		this(null, 0, null, null, false, 0);
	}
	
	public static ArrayList<Mamifero> getListado() {
		return listado;
	}
	public int cantidadMamiferos() {
		return listado.size();
	}
	public static Mamifero crearCaballo(String nombre,int edad,String genero) {
		Mamifero Caballo = new Mamifero(nombre,edad,"pradera",genero,true,4);
		Mamifero.caballos++;
		return Caballo;
	}
	public static Mamifero crearLeon(String nombre,int edad,String genero) {
		Mamifero Leon = new Mamifero(nombre,edad,"selva",genero,true,4);		
		Mamifero.leones++;
		return Leon;
	}
	
}
