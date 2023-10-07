package comunicacion;

public class Fabula extends Escrito {
	
	private String enseñanza;
	private String interpretacion;
	
	public Fabula() {
		this("Colombia", "Satanas", "Mario Mendoza", 100, "Muy bonita", "Increible");
	}
	
	public Fabula(String origen, String titulo, String autor, int paginas, String enseñanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		
		this.enseñanza = enseñanza;
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
				this.enseñanza;
	}
	
	public String getEnsenanza() {
		return this.enseñanza;
	}
	
	public String getInterpretacion() {
		return this.interpretacion;
	}
	
	public void setEnsenanza(String enseñanza) {
		this.enseñanza = enseñanza;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}


}
