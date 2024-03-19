package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;

public class Ave extends Animal {
	private static ArrayList<Ave> listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave(String nombre, int edad, String habitat,String genero,String colorPlumas) {
		super(nombre,edad,habitat,genero);
		this.colorPlumas=colorPlumas;
		listado.add(this);
	}
	public Ave() {}

	public static ArrayList<Ave> getListado() {
		return listado;
	}
	public int cantidadAves() {
	return listado.size();
	}
	public String movimiento(){
		return "volar";
	}
	public static void crearHalcon(String nombre,int edad,String genero){
		new Ave(nombre,edad,"montanas",genero,"cafe glorioso");
		Ave.halcones++;
	}
	public static void crearAguila(String nombre,int edad,String genero){
		new Ave(nombre,edad,"montanas",genero,"blanco y amarillo");
		Ave.aguilas++;
	}
}
