package gestion;
import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private static ArrayList<Zona> zonas;
	
	public Zoologico(String nombre,String ubicacion){
		this.nombre=nombre;
		this.ubicacion=ubicacion;
	}
	public Zoologico() {}
	
	public String getNombre() {
		return nombre;
	}
	public static ArrayList<Zona> getZona() {
		return zonas;
	}
	public void agregarZonas(Zona z){
		zonas.add(z);
	}
	public int cantidadTotalAnimales() {
		int con=0;
		for (int i=0;i<zonas.size();i++) {
			for(int j=0;j<Zona.getAnimales().size();j++) {
				con++;
			}
		}
		return con;
	}
}
