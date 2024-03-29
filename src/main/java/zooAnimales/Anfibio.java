package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado= new ArrayList<Anfibio>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat,String genero,String colorPiel,boolean venenoso) {
		super(nombre,edad,habitat,genero);
		this.colorPiel=colorPiel;
		this.venenoso=venenoso;
		listado.add(this);
	}
	public Anfibio() {
		this(null,0,null,null,null,false);
	}
	
	public int cantidadAnfibios(){
		return listado.size();
	}
	public String movimiento(){
		return "saltar";
	}
	public static Anfibio crearRana(String nombre,int edad,String genero){
		Anfibio Rana=new Anfibio(nombre,edad,"selva",genero,"rojo",true);
		Anfibio.ranas++;
		return Rana;
	}
	public static Anfibio crearSalamandra(String nombre,int edad,String genero){
		Anfibio Salamandra=new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
		Anfibio.salamandras++;
		return Salamandra;
	}
	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	public static ArrayList<Anfibio> getListado() {
		return listado;
	}
	
	public static void setListado(ArrayList<Anfibio> listado) {
		Anfibio.listado = listado;
	}
}
