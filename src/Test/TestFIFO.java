/*------------------------- Algoritmo FIFO ------------------------*/
//  Planificador de corto alcance (PCA)
//
// Es el principal planificador del Sistema Operativo, está continuamente 
// funcionando, es quien decide que proceso pasa a ejecutado, usa distintas 
// políticas o algoritmos, brinda cierta equidad.
// v1.2
// Autor: José Victor Ibáñez
/*------------------------- ------------- -------------------------*/

package Test;

import Model.admProcesamiento;
import Model.admTablaProcesos;
import Model.Prioridad;

public class TestFIFO {

	public static void main(String[] args) {

		admProcesamiento admP1 = new admProcesamiento(20, 38);

		admP1.agregarProceso("P1", 4, 2, 2, 6, Prioridad.Alta);
		admP1.agregarProceso("P2", 4, 3, 3, 2, Prioridad.Baja);
		admP1.agregarProceso("P3", 2, 2, 2, 5, Prioridad.Media);
		admP1.agregarProceso("P4", 3, 3, 5, 2, Prioridad.Baja);
		admP1.agregarProceso("P5", 5, 5, 4, 1, Prioridad.Media);
		admP1.agregarProceso("P6", 1, 1, 4, 5, Prioridad.Alta);
		admP1.agregarProceso("P7", 4, 4, 5, 2, Prioridad.Alta);


		System.out.println("----------- Planificador FIFO -----------");
		System.out.println(admP1.mostrarPlanificador(admP1.planificarFIFO()));
		System.out.println(admP1.mostrarProcesos() + "\n-> hay 1 procesador" + "\n-> E/S Se realiza en paralelo\n");
		
		System.out.println("----------- Resultados FIFO -----------");
		admTablaProcesos admTP = new admTablaProcesos(admP1);
		System.out.println(admTP.mostrarResultados(admP1.planificarFIFO()));

	}

}
