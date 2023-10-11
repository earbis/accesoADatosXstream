import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

import com.thoughtworks.xstream.XStream;

public class EscribirPersonas implements Serializable {
 public static void main(String[] args) throws IOException, ClassNotFoundException {
	File fichero = new File("FichPersona.dat");
	FileInputStream filein = new FileInputStream(fichero);
	ObjectInputStream dataIs= new ObjectInputStream(filein);
	System.out.println("Comineza el proceso...");
	ListaPersona lista = new ListaPersona();
	try {
		while(true) {
			Persona persona = (Persona) dataIs.readObject();
			lista.add(persona);
		}
	}catch(EOFException eo) {dataIs.close();}
	try {
		XStream xstream = new XStream();
		xstream.alias("ListaPersonasMunicipio",ListaPersona.class);
		xstream.alias("DatosPersona", Persona.class);
		xstream.addImplicitCollection(ListaPersona.class, "lista");
		xstream.toXML(lista, new FileOutputStream("Personas.xml"));
		System.out.println("Creado Fichero XML...");
	} catch (Exception e) {
		e.printStackTrace();
	}
	
 }
}
