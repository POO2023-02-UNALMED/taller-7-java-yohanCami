package comunicacion;

public class Alfabeto extends Pictograma {
	
	//private static Character[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	private String[] letras; 
	private String interpretacion;
	

	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	public int cantidadLetras() {
		return this.letras.length;
	}
	
	public String interpretacion () {
		return this.interpretacion;
	}
	
	public String toString() {
		
		String salida = "" + this.letras[0]; 
		
		for (int i = 1; i < this.letras.length; i++) {
            salida += ", " + this.letras[i];
        }
		
		return salida;

	}
	
	public String[] getLetras() {
		return this.letras;
	}
	
	public String getInterpretacion() {
		return this.interpretacion;
	}
	
	public void setLetras(String[] letras) {
		this.letras = letras;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

}
