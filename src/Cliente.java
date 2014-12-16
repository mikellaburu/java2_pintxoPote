public class Cliente {
	private int idCliente;
	private String nombreCliente;
	private Cartilla cartilla;

	// getters
	public int getIdCliente() {
		return this.idCliente;
	}

	public String getNombreCliente() {
		return this.nombreCliente;
	}

	public Cartilla getCartilla() {
		return this.cartilla;
	}

	//setters
	public void setIdCliente(int id) {
		this.idCliente = id;
	}

	public void setNombreCliente(int nombre) {
		this.nombreCliente = nombre;
	}

	public void setCartilla(Cartilla cartilla) {
		this.cartilla = cartilla;
	}

}