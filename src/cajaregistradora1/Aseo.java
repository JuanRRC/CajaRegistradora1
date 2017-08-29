/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajaregistradora1;

/**
 *
 * @author Clint
 */
public class Aseo extends Producto implements Facturable {

    public Aseo(String nombre, float precio, int stock, String caractericas) {
        super(nombre, precio, stock, caractericas);
    }
    
    
 @Override
    public void imprimirDetalles() {
        
        System.out.println("nombre: "+this.getNombre());
        System.out.println("precio: "+this.getPrecio());
        System.out.println("stock: "+this.getStock());
        System.out.println("Caracteristicas: "+this.getCaractericas());
    }
/**
 * obtinene el stock actual del producto
 * @return 
 */
    @Override
    public int obtenerStock() {
        return this.getStock();
        
    }
    
/**
 * actualiza el stock operandolo con la cantidad recibida como parametro
 * @param cantidad 
 */
    @Override
    public void actualizarStok(int cantidad) {
        super.setStock(super.getStock()-cantidad);
    }
/**
 * calcula el valor facturado operando el valor del producto con la cantidad
 * @param cantidad
 * @return 
 */
    @Override
    public int facturar(int cantidad) {
        return (int) this.getPrecio()*cantidad;
    }
   
   
    
}
