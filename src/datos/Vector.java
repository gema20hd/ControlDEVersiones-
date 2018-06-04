package datos;

/**
 *
 * @author GemaUce
 */
public class Vector {

    private Double vector[];
    private Integer nroFilas;

    public Vector() {
        vector = new Double[2];
    }

    public Vector(Integer nroFilas) {
        vector = new Double[nroFilas];
        this.nroFilas = nroFilas;
    }
    
    
     /**
     * set es para recibir los datos
     *
     * @param args fila,column
     * @return sin valor de retorno
     */
    public void setValor(Integer fila, double valor) {
        vector[fila] = valor;
    }

    /**
     * get es para obtener los datos
     *
     * @param args fila
     * @return con valor de retorno Integer
     */
    public Double getValor(Integer fila) {
        return vector[fila];
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

 

  

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }



}
