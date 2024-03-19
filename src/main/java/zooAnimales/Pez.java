package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;

public class Pez extends Animal {
	private static ArrayList<Pez> listado;
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(String nombre, int edad, String habitat,String genero,String colorEscamas,int cantidadAletas) {
		super(nombre,edad,habitat,genero);
		this.colorEscamas=colorEscamas;
		this.cantidadAletas=cantidadAletas;
		listado.add(this);
	}
	public Pez() {}

	public static ArrayList<Pez> getListado() {
		return listado;
	}
	public int cantidadPeces(){
		return listado.size();
	}
	public String movimiento(){
		return "nadar";
	}
	public static void crearSalmon(String nombre,int edad,String genero){
		new Pez(nombre,edad,"oceano",genero,"rojo",6);
		Pez.salmones++;
	}
	public static void crearBacalao(String nombre,int edad,String genero){
		new Pez(nombre,edad,"oceano",genero,"gris",6);
		Pez.bacalaos++;
	}
	
}
