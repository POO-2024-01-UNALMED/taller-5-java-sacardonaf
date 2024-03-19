package gestion;
import java.util.ArrayList;
import zooAnimales.Animal;
import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales = new ArrayList<Animal>();
	
	public Zona(String nombre,Zoologico zoo) {
		this.nombre=nombre;
		this.zoo=zoo;
	}
	public Zona() {
		this(null,null);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String n) {
		this.nombre=n;
	}
	public Zoologico getZoo(){
		return zoo;
	}
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	
	public ArrayList<Animal> getAnimales() {
		return animales;
	}
	public void agregarAnimales(Animal a) {
		animales.add(a);
	}
	public int cantidadAnimales() {
		return animales.size();
	}
	
}
