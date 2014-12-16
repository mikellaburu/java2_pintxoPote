import java.util.ArrayList;

public class Bar {
	private int idBar;
	private String nombreBar;
	private String direccion;
	private ArrayList <Pintxo> pintxos;
	private ArrayList <Pote> potes;


	// getters

	public int getIdBar() {
		return this.idBar;
	}

	public String getNombreBar() {
		return this.nombreBar;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public ArrayList <Pintxo> getPintxos() {
		return this.pintxos;
	}

	public ArrayList <Pote> getPotes() {
		return this.potes;
	}

	//setters

	public void setIdBar(int id) {
		this.idBar = id;
	}

	public void setNombreBar(String nombre) {
		this.nombreBar = nombre;
	}

	public void setIngredientes(String dir) {
		this.direccion = dir;
	}	

	public void setPintxos(ArrayList <Pintxo> listaPintxos) {
		this.pintxos = listaPintxos;
	}

	public void setPintxos(ArrayList <Pote> listaPotes) {
		this.potes = listaPotes;
	}
}