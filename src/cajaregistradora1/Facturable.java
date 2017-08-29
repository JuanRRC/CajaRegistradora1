package cajaregistradora1;

/**
 * Interfaz Facturable con los metodos a implementar
 * @author Juan Ricardo Rodriguez Campos
 * @author Juan David Reyes
 * @verion 1.0.0
 * @since Caja Registradora 1.0.0
 */

public interface Facturable {
   
   public void imprimirDetalles();
   public int obtenerStock();
   public void actualizarStok(int cantidad);
   public int facturar(int cantidad); // retorna el total 
}
