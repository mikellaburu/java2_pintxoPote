public class PintxoPote {
	private Pintxo pintxo;
	private Pote pote;
	private double precio;

	//getters
	public Pintxo getPintxo() {
		return this.pintxo;
	}

	public Pote getPote() {
		return this.pote;
	}

	public double getPrecio() {
		return this.precio;
	}

	//setters
	public void setPintxo(Pintxo pintxo){
		this.pintxo = pintxo;
	}

	public void setPote(Pote pote){
		this.pote = pote;
	}

	public void setPintxo(double euros){
		this.precio = euros;
	}

}