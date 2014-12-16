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
	public String inprimirCuenta(ArrayList <PintxoPote> cuenta) {
		for (int i=0; i<cuenta.size(); i++) {
			System.out.println("Pintxo: "+cuenta.get(i).getPincho());
			System.out.println("Pote: "+cuenta.get(i).getPote());
			System.out.println("Precio: "+cuenta.get(i).getPrecio());
		}
	}

}