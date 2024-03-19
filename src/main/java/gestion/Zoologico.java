package gestion;
import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas =new ArrayList<Zona>();
	
	public Zoologico(String nombre,String ubicacion){
		this.nombre=nombre;
		this.ubicacion=ubicacion;
	}
	public Zoologico() {
		this(null,null);
	}
	
	public String getNombre() {
		return nombre;
	}
	public ArrayList<Zona> getZona() {
		return zonas;
	}
	public void agregarZonas(Zona z){
		zonas.add(z);
	}
	public int cantidadTotalAnimales() {
		int con=0;
		for (int i=0;i<zonas.size();i++) {
			con = con + zonas.get(i).getAnimales().size();
			
		}
		return con;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getUbicacion() {
		return ubicacion;
	}
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	
	}
	
	public void setZona(ArrayList<Zona> zonas) {
		this.zonas = zonas;
	}
}
