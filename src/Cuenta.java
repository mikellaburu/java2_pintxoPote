import java.util.ArrayList;

public class Cuenta {
	
	// atributos
	private ArrayList <PintxoPote> cuenta; // array de 10posiciones, para guardar sellos,cada item sera un bar

	// getter
	public ArrayList <PintxoPote> getCuenta() {
		return this.cuenta;
	}

	// setter
	public void setCuenta(ArrayList <PintxoPote> cuenta) {
		this.cuenta = cuenta;
	}

	// metodo imprimir en pantalla
	public void inprimirCuenta() {
		for (int i=0; i<this.cuenta.size(); i++) {
			System.out.println("Pintxo: "+this.cuenta.get(i).getPincho());
			System.out.println("Pote: "+this.cuenta.get(i).getPote());
			System.out.println("Precio: "+this.cuenta.get(i).getPrecio());
		}
	}

}