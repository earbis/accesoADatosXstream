import java.util.ArrayList;

public class Libreria {
	private ArrayList<Libro> listaLibro;
	private String nombre;
	private String lugar;
	
	public Libreria() {
		super();
	}
	public Libreria(ArrayList<Libro> ºlistaLibro, String nombre, String lugar) {
		super();
		this.listaLibro = ºlistaLibro;
		this.nombre = nombre;
		this.lugar = lugar;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public ArrayList<Libro> getListaLibro() {
		return listaLibro;
	}
	public void setListaLibro(ArrayList<Libro> listaLibro) {
		this.listaLibro = listaLibro;
	}
	
}
