public class Pintxo{
	private int idPintxo;
	private String nombrePintxo;
	private String [] ingredientes;
	private int tipoPintxo; //1.Basico 2.Selecto

	//1: tortillas...
	//2: Foie...

	// getters

	public int getIdPintxo() {
		return this.idPintxo;
	}

	public String getNombrePintxo() {
		return this.nombrePintxo;
	}

	public String [] getIngredientes() {
		return this.ingredientes;
	}

	public int getTipoPintxo() {
		return this.tipoPintxo;
	}

	//setters

	public void setIdPintxo(int id) {
		this.idPintxo = id;
	}

	public void setNombrePintxo(String nombre) {
		this.nombrePintxo = nombre;
	}

	public void setIngredientes(String [] ingrs) {
		this.ingredientes = ingrs;
	}	

	public void setTipoPintxo(int tipo) {
		this.tipoPintxo = tipo;
	}
}