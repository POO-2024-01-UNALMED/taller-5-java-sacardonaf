package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;

public class Reptil extends Animal {
	private static ArrayList<Reptil> listado;
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(String nombre, int edad, String habitat,String genero,String colorEscamas,int largoCola) {
		super(nombre,edad,habitat,genero);
		this.colorEscamas=colorEscamas;
		this.largoCola=largoCola;
		listado.add(this);
	}
	public Reptil() {
		this(null,0,null,null,null,0);
	}
	
	public static ArrayList<Reptil> getListado() {
		return listado;
	}
	public int cantidadReptiles(){
		return listado.size();
	}
	public String movimiento(){
		return "reptar";
	}
	public static void crearIguana(String nombre,int edad,String genero){
		new Reptil(nombre,edad,"humedal",genero,"verde",3);
		Reptil.iguanas++;
	}
	public static void crearSerpiente(String nombre,int edad,String genero){
		new Reptil(nombre,edad,"jungla",genero,"blanco",1);		
		Reptil.serpientes++;
	}
	
}
