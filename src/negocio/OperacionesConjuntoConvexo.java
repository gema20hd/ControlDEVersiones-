package negocio;

import datos.Matriz;
import datos.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author GemaUce
 */
public class OperacionesConjuntoConvexo {

    public static Matriz matrizC;
    //public static Matriz MatrizAInversa;

    public static Matriz inversa(Matriz matrizA) {
        Integer nroFilas = matrizA.getNroFilas();
        Integer nroColumnas = matrizA.getNroColumnas();

        Matriz MatrizAInversa = new Matriz(nroFilas, nroColumnas);

        return matrizC;

    }

    public String determinante(Matriz matrizA) {
        String solucion = "";
        Integer nroFilas = matrizA.getNroFilas();
        Integer nroColumnas = matrizA.getNroFilas();
        double copiaMatrizA[][] = new double[nroFilas][nroFilas];

        //  Vector solucion = new Vector(nroFilas);// almacena la soluciones del sistema
        if (nroFilas == 2 && nroColumnas == 2) {
            double deter = (matrizA.getValor(0, 0) * matrizA.getValor(1, 1)
                    - matrizA.getValor(0, 1) * matrizA.getValor(1, 0));
        } else {
            for (int i = 0; i < nroFilas; i++) {
                for (int j = 0; j < nroColumnas; j++) {
                 copiaMatrizA[i][j]=   

                }

            }

    
        }

        return solucion;

    }

    public static Matriz multiplicacionMatrices(Matriz matrizA, Matriz matrizB) {

        return matrizC;

    }

    public Vector gausJordan(Matriz matrizA) {
        Integer nroFilas = matrizA.getNroFilas();

        Vector solucion = new Vector(nroFilas);// almacena la soluciones del sistema

        return solucion;
    }

    public Vector PuntosExtremos(Matriz matrizA) {

        Integer nroFilas = matrizA.getNroFilas();
        Vector solucion = new Vector(nroFilas);// almacena la soluciones del sistema

        return solucion;

    }

    public Vector DireecionesExtremas(Matriz matrizA) {

        Integer nroFilas = matrizA.getNroFilas();
        Vector solucion = new Vector(nroFilas);// almacena la soluciones del sistema

        return solucion;

    }

}
