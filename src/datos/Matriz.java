
package datos;

/**
 * @author GemaUce
 * @version 1.0
 */
/* Creacion de la clase objeto matriz*/
public class Matriz {

    private Double matriz[][];
    private Integer nroFilas;
    private Integer nroColumnas;

    /*Constructor por defecto  */
    public Matriz() {

        /*para inicializar los valores*/
        matriz = new Double[2][2];
    }

    /**
     * Constructor con parametros
     *
     * @param args nroFilas,nroColumnas
     */
    public Matriz(Integer nroFilas, Integer nroColumnas) {
        matriz = new Double[nroFilas][nroColumnas];
        this.nroFilas = nroFilas;
        this.nroColumnas = nroColumnas;
    }

    /**
     * set es para recibir los datos
     *
     * @param args fila,columna
     * @return sin valor de retorno
     */
    public void setValor(Integer fila, Integer columna, double valor) {
        matriz[fila][columna] = valor;
    }

    /**
     * get es para obtener los datos
     *
     * @param args fila,columna
     * @return con valor de retorno Integer
     */
    public Double getValor(Integer fila, Integer columna) {
        return matriz[fila][columna];
    }

    /**
     * para obtener los datos de las filas
     *
     * @return con valor de retorno
     */
    public Integer getNroFilas() {
        return nroFilas;
    }

    /**
     * set es para recibir los datos
     *
     * @param args nroFilas
     * @return sin valor de retorno
     */
    public void setNroFilas(Integer nroFilas) {
        this.nroFilas = nroFilas;
    }

    /**
     * para obtener los datos de las columnas
     *
     * @return con valor de retorno
     */
    public Integer getNroColumnas() {
        return nroColumnas;
    }

    /**
     * set es para recibir los datos
     *
     * @param args nroColumnas
     * @return sin valor de retorno
     */
    public void setNroColumnas(Integer nroColumnas) {
        this.nroColumnas = nroColumnas;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}

