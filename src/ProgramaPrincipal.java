import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Scanner tecla = new Scanner (System.in);
		System.out.println("------------PINTXO POTE------------");
		System.out.println("----------MENU PRINCIPAL------------");
		System.out.println("\ta) Cargar Pintxos (desde fichero pintxos.txt)");
		System.out.println("\tb) Cargar Potes (desde fichero potes.txt)");
		System.out.println("\tc) Cargar Bares (desde fichero bares.txt)");
		System.out.println("\td) Asignar pintxos y potes a cada bar manualmente");
		System.out.println("\td) Visualizar la cuenta, con los pintxos y bebidas consumidas y el importe total de cada ronda.");
		System.out.println("\tx) Salir");

		String opcion = " ";
		opcion = tecla.next();
		
		switch (opcion) {
			case "a":
				System.out.println("Leer fichero 'pintxos.txt' y guardar en un ArrayList");

				try {
					// crear fichero
					File archivo1 = new File("/home/zubiri/ProyectosJava/java2_pintxoPote/src","pintxos.txt");

					if (archivo1.createNewFile()) {
						System.out.println("Se ha creado el archivo 'pintxos.txt' correctamente");
					} else {
						System.out.println("Ya existe el archivo 'pintxos.txt'");
					}
					
					// Leer fichero y mostrar	
								
					Scanner leerFichero1 = new Scanner (archivo1);
					ArrayList <Pintxo> listaPintxos = new ArrayList <Pintxo>();

					while (leerFichero1.hasNextLine()) {

						String fila = leerFichero1.nextLine();//lerro bat irakurri fitxategitik eta string moduan gorde
						String [] atribPintxo = fila.split(";");//atributuak koma eta hutsuneaz bereiztu eta string motako array batean gorde 
						Pintxo pintxo1 = new Pintxo ();
						pintxo1.setIdPintxo(Integer.parseInt(atribPintxo[0]));
						pintxo1.setNombrePintxo(atribPintxo[1]);
						String [] ingredientesPintxo = atribPintxo[2].split(",");
						pintxo1.setIngredientes(ingredientesPintxo);
						pintxo1.setTipoPintxo(Integer.parseInt(atribPintxo[3]));
						
						listaPintxos.add(pintxo1);
					
					}
					leerFichero1.close();

					for (int i=0; i<listaPintxos.size(); i++) {
						
						System.out.println("Pintxo "+(i+1)+":");
						System.out.println("\tId: "+listaPintxos.get(i).getIdPintxo());
						System.out.println("\tNombre: "+listaPintxos.get(i).getNombrePintxo());
						System.out.println("\tIngredientes: ");
						String [] ingredientesPintxo = listaPintxos.get(i).getIngredientes();
						for (int j=0; j<ingredientesPintxo.length; j++) {
							System.out.print(ingredientesPintxo[j]+", ");
						}
						String tipo = "";
						if (listaPintxos.get(i).getTipoPintxo() == 1) {
							tipo = "Basico";
						}
						if (listaPintxos.get(i).getTipoPintxo() == 2) {
							tipo = "Selecto";
						}
						System.out.println("\tTipo de pintxo: "+tipo);
						
					}
				} catch (Exception e) {
					System.out.println("Error");
				}
				break;
			case "b":
				break;

			case "x":
				System.out.println("Salir");
				break;
			default:
				break;

		}
		

	}
}