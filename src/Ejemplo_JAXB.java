import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class Ejemplo_JAXB {
private static final String MIARCHIVO_XML= "./libreria.xml";
public static void main(String[] args) throws JAXBException {
	ArrayList<Libro> libroLista = new ArrayList<>();
	Libro libro1 = new Libro("Entornos de Desarrollo", "Alicia Ramos", "Garceta", "978-84-1545-297-3");
	libroLista.add(libro1);
	Libro libro2 = new Libro("Acceso a Datos", "Maria jesus Ramos", "Garceta", "978-84-1545-297-4");
	libroLista.add(libro2);
	Libreria milibreria = new Libreria();
	milibreria.setNombre("Prueba de libreria JAXB");
	milibreria.setLugar("Talavera");
	milibreria.setListaLibro(libroLista);
	JAXBContext context = JAXBContext.newInstance(Libreria.class);
}
}
