package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal {
	private static ArrayList<Mamifero> listado;
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
	public static void crearCaballo(String nombre,int edad,String genero) {
		new Mamifero(nombre,edad,"pradera",genero,true,4);
		Mamifero.caballos++;
	}
	public static void crearLeon(String nombre,int edad,String genero) {
		new Mamifero(nombre,edad,"selva",genero,true,4);		
		Mamifero.leones++;
	}
	
}
