package comunicacion;

public class Periodico extends Escrito {

	private String fecha;
	private String primicia;
	private String interpretacion;
	
	
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
		super(origen, titulo, autor, paginas);
		
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
	}
	
	public int palabrasTotales(int palabrasPagina) {
		return 10 * getPaginas() * palabrasPagina;
	}
	
	public String interpretacion () {
		return this.interpretacion;
	}
	
	public String toString() {
		return resumen() + "\n" +
				this.fecha + "\n" +
				this.primicia;
	}
	
	public String getFecha() {
		return this.fecha;
	}
	
	public String getPrimicia() {
		return this.primicia;
	}
	
	public String getInterpretacion() {
		return this.interpretacion;
	}
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public void setPrimicia(String primicia) {
		this.primicia = primicia;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
}
