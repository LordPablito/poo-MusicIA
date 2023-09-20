package musicIA;
import java.util.ArrayList;


public class Class_music {
	public String titulo;
	public ArrayList<String> generos;
	public String letra;
	
}
public String getTituloe() {
    return titulo;
}
public ArrayList getGeneros() {
    return generos;
}
public String getLetra() {
    return letra;
}

class Cancion extends Class_music{
		private String cancion_generada;
		
		public Cancion(String titulo,String genero,String letra,String cancion_generada)
		super(titulo,genero,letra,cancion_generada);
		System.out.println("Cancion Generada: " + cancion_generada);
}
