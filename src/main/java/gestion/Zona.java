package gestion;
import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico[] zoo;
	private static ArrayList<Animal> animales;
	
	public Zona(String nombre,Zoologico[] zoo) {
		this.nombre=nombre;
		this.zoo=zoo;
	}
	public Zona() {}
	
	public String getNombre() {
		return nombre;
	}
	public Zoologico[] getZoo(){
		return zoo;
	}
	public static ArrayList<Animal> getAnimales() {
		return animales;
	}
	public void agregarAnimales(Animal a) {
		animales.add(a);
	}
	public int cantidadAnimales() {
		int con=0;
		for (int i=0;i<animales.size();i++) {
			con++;
		}
		return con;
	}
	
}
