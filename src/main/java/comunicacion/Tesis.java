package comunicacion;



public class Tesis extends Escrito{
	
	private String idea;
	private String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	//public Tesis() {
		//this("Colombia", "Satanas", "Mario Mendoza", 100, "Habia una vez", "Vivieron felices", "El dueño", "Carlos Villagran");
	//}
	
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		
		this.idea = idea;
		this.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}
	
	public int palabrasTotales(int palabrasPagina) {
		return 5 * getPaginas();
	}
	
	public String interpretacion () {
		return this.interpretacion;
	}
	
	public String toString() {
		return resumen() + "\n" +
				this.idea + "\n" +
				this.argumentos.length + "\n" +
				this.conclusion + "\n" +
				this.referencias;
	}
	
	public String getIdea() {
		return this.idea;
	}
	
	public String[] getArgumentos(){
		return this.argumentos;
	}
	
	public String getConclusion() {
		return this.conclusion;
	}
	
	public String getReferencias() {
		return this.referencias;
	}
	
	public String getInterpretacion() {
		return this.interpretacion;
	}
	
	public void setIdea(String idea) {
		this.idea = idea;
	}
	
	public void getArgumentos(String[] argumentos){
		this.argumentos = argumentos;
	}
	
	public void getConclusion(String conclusion) {
		this.conclusion = conclusion;
	}
	
	public void getReferencias(String referencias) {
		this.referencias = referencias;
	}
	
	public void getInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
}
