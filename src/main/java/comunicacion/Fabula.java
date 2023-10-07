package comunicacion;

public class Fabula extends Escrito {
	
	private String ensenanza;
	private String interpretacion;
	
	public Fabula() {
		this("Colombia", "Satanas", "Mario Mendoza", 100, "Muy bonita", "Increible");
	}
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}
	
	public int palabrasTotales(int palabrasPagina) {
		return 1 * getPaginas();
	}
	
	public String interpretacion () {
		return this.interpretacion;
	}
	
	public String toString() {
		return resumen() + "\n" +
				this.ensenanza;
	}
	
	public String getEnsenanza() {
		return this.ensenanza;
	}
	
	public String getInterpretacion() {
		return this.interpretacion;
	}
	
	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}


}
