public class Pote {
	private int idPote;
	private String nombrePote;
	private int tipoPote; //1.Basico 2.Selecto

	//1:agua, zurito, vino
	//2: caña, refrescos, ardo berezia


	// getters

	public int getIdPote() {
		return this.idPote;
	}

	public String getNombrePote() {
		return this.nombrePote;
	}

	public int geTipoPote() {
		return this.geTipoPote;
	}

	//setters

	public void setIdPote(int id) {
		this.idPote = id;
	}

	public void setNombrePote(int nombre) {
		this.nombrePote = nombre;
	}

	public void setTIpoPote(int tipo) {
		this.tipoPote = tipo;
	}
}