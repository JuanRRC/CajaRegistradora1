
package cajaregistradora1;

import java.util.Scanner;
/**
 * Este proyecto simula la compra en un supermercado con su respectivo inventario
 * @author Juan Ricardo Rodriguez Campos
 * @author Juan David Reyes
 * @verion 1.0.0
 * @since Caja Registradora 1.0.0
 */
public class CajaRegistradora {

    /**
     * Metodo main que contiene la creacion de objetos,menus y logica general del programa 
     * @param args 
     */
    public static void main(String[] args) {
        
        double precioFinal=0; //variable precio final de compra
        
        //Creacion de objetos con sus datos parametros 
        Alimentos a = new Alimentos("Arroz",1500,20,"500 gramos");
        Alimentos f = new Alimentos("Frijoles",2000 ,30,"500 gramos");
        
        Tecnologia tablet = new Tecnologia("Tablet",500000,50,"32 GB,2 GB RAM, 10.5 PULGADAS");
        Tecnologia celular = new Tecnologia("Celular",700000,50,"16 GB,4 GB RAM ,5.5 PULGADAS");
        
        Hogar jb = new Hogar("Jabon de baño",2000,20,"Barra Mediana");
        Hogar jr = new Hogar("Jabon de Ropa",3000,20,"Barra Grande");
        
        Aseo cepillo = new Aseo("Cepillo Dental",2000,50,"Cerdas Ultra Duras y limpiador de lengua");
        Aseo Shampoo = new Aseo("Shampoo ",3000,20,"Prevencion caida de cabello");
        // Objeto scanner para la lectura de datos por consola.
        Scanner t = new Scanner(System.in);
        OUTER:
        while (true) {
            
            // Menu Inicial del programa
            
            System.out.println("----------Caja Registradora--------------");
            System.out.println("-----------------------------------------");
            System.out.println("Valor Facturado :           "+precioFinal);
            System.out.println("-----------------------------------------");
            System.out.println("1.Arroz                     "+a.getStock());
            System.out.println("2.Frijoles                  "+f.getStock());
            System.out.println("3.Tablet                    "+jb.getStock());
            System.out.println("4.Celular                   "+jr.getStock());
            System.out.println("5.Jabon de manos            "+celular.getStock());
            System.out.println("6.Jabon de ropa             "+tablet.getStock());
            System.out.println("7.Cepillo dental            "+cepillo.getStock());
            System.out.println("8.Shampoo                   "+Shampoo.getStock());
            System.out.println("7.Salir                                    ");
            System.out.println("-----------------------------------------");
            System.out.println("-----------------------------------------");
            
            System.out.println(" Digite la opcion con el producto deseado : ");
            
            //Sentencia Switch para la eleccion de opciones.
            
            byte opcion =  t.nextByte();
            switch (opcion) {
                case 1:
                    iniciar();
                    byte op =  t.nextByte();
                    switch(op){
                        
                        case 1: 
                                a.imprimirDetalles();
                                System.out.println("Digite la cantiad:");
                                int valor = t.nextInt();                                
                                a.actualizarStok(valor);
                                precioFinal=precioFinal+a.facturar(valor);
                                System.out.println(+valor+" Unidades de arroz : "+a.facturar(valor));
                            break;
                        
                        case 2:
                                System.out.println("Digite la cantidad a remover");
                                int valor1 = t.nextInt();
                                a.actualizarStok(valor1*-1);
                                precioFinal=precioFinal-a.facturar(valor1);
                                System.out.println(+valor1+" Unidades de arroz : "+a.facturar(valor1));
                            break;
                            
                        case 3:
                            break;
                    }
                    
                    break;
                    
                case 2:
                    iniciar();
                    byte op1 =  t.nextByte();
                    switch(op1){
                        
                        case 1: 
                                f.imprimirDetalles();
                                System.out.println("Digite la cantiad:");
                                int valor = t.nextInt();                                
                                f.actualizarStok(valor);
                                precioFinal=precioFinal+f.facturar(valor);
                                System.out.println(+valor+" Unidades de Frijol : "+f.facturar(valor));
                            break;
                        
                        case 2:
                                System.out.println("Digite la cantidad a remover");
                                int valor1 = t.nextInt();
                                f.actualizarStok(valor1*-1);                                
                                precioFinal=precioFinal-f.facturar(valor1);
                                System.out.println(+valor1+" Unidades de Frijol : "+f.facturar(valor1));
                            break;
                            
                        case 3:
                            break;
                    }          
                    break;
                    
                    
                    
                case 3:
                    iniciar();
                    byte op3 =  t.nextByte();
                    switch(op3){
                        
                        case 1: 
                                tablet.imprimirDetalles();
                                System.out.println("Digite la cantiad:");
                                int valor = t.nextInt();                                
                                tablet.actualizarStok(valor);
                                precioFinal=precioFinal+tablet.facturar(valor);
                                System.out.println(+valor+" Unidades de tablet : "+tablet.facturar(valor));
                            break;
                        
                        case 2:
                                System.out.println("Digite la cantidad a remover");
                                int valor1 = t.nextInt();
                                tablet.actualizarStok(valor1*-1);
                                
                                precioFinal=precioFinal-tablet.facturar(valor1);
                                System.out.println(+valor1+" Unidades de tablet : "+tablet.facturar(valor1));
                            break;
                            
                        case 3:
                            break;
                    }
                    
                    
                    break;
                    
                case 4:
                    iniciar();
                    byte op4 =  t.nextByte();
                    switch(op4){
                        
                        case 1: 
                                celular.imprimirDetalles();
                                System.out.println("Digite la cantiad:");
                                int valor = t.nextInt();                                
                                celular.actualizarStok(valor);                               
                                precioFinal=precioFinal+celular.facturar(valor);
                                System.out.println(+valor+" Unidades de celulares : "+celular.facturar(valor));
                            break;
                        
                        case 2:
                                System.out.println("Digite la cantidad a remover");
                                int valor1 = t.nextInt();
                                celular.actualizarStok(valor1*-1);                               
                                precioFinal=precioFinal-celular.facturar(valor1);
                                System.out.println(+valor1+" Unidades de celulares : "+celular.facturar(valor1));
                            break;
                            
                        case 3:
                            break;
                    }
                      
                    break;
                    
                case 5:
                    iniciar();
                    byte op5 =  t.nextByte();
                    switch(op5){
                        
                       case 1: 
                                jb.imprimirDetalles();
                                System.out.println("Digite la cantiad:");
                                int valor = t.nextInt();                                
                                jb.actualizarStok(valor);                               
                                precioFinal=precioFinal+jb.facturar(valor);
                                System.out.println(+valor+" Unidades de arroz : "+jb.facturar(valor));
                            break;
                        
                        case 2:
                                System.out.println("Digite la cantidad a remover");
                                int valor1 = t.nextInt();
                                jb.actualizarStok(valor1*-1);
                                precioFinal=precioFinal-jb.facturar(valor1);
                                System.out.println(+valor1+" Unidades de arroz : "+jb.facturar(valor1));
                            break;
                            
                        case 3:
                            break;
                    }
                 
                    break;
                    
                case 6:
                    iniciar();
                    byte op6 =  t.nextByte();
                    switch(op6){
                        
                        case 1: 
                                jr.imprimirDetalles();
                                System.out.println("Digite la cantiad:");
                                int valor = t.nextInt();                                
                                jr.actualizarStok(valor);
                                precioFinal=precioFinal+jr.facturar(valor);
                                System.out.println(+valor+" Unidades de arroz : "+jr.facturar(valor));
                            break;
                        
                        case 2:
                                System.out.println("Digite la cantidad a remover");
                                int valor1 = t.nextInt();
                                jr.actualizarStok(valor1*-1);
                                precioFinal=precioFinal-jr.facturar(valor1);
                                System.out.println(+valor1+" Unidades de arroz : "+jr.facturar(valor1));
                            break;
                            
                        case 3:
                            break;
                    }
                
                    break;
                    
                    
                case 7:
                    iniciar();
                    byte op7 =  t.nextByte();
                    switch(op7){
                        
                        case 1: 
                                cepillo.imprimirDetalles();
                                System.out.println("Digite la cantiad:");
                                int valor = t.nextInt();                                
                                cepillo.actualizarStok(valor);
                                precioFinal=precioFinal+cepillo.facturar(valor);
                                System.out.println(+valor+" Unidades de Cepillos dentales : "+cepillo.facturar(valor));
                            break;
                        
                        case 2:
                                System.out.println("Digite la cantidad a remover");
                                int valor1 = t.nextInt();
                                cepillo.actualizarStok(valor1*-1);
                                precioFinal=precioFinal-cepillo.facturar(valor1);
                                System.out.println(+valor1+" Unidades de Cepillos dentales : "+cepillo.facturar(valor1));
                            break;
                            
                        case 3:
                            break;
                    }
                    
                    break;
                
                case 8:
                    iniciar();
                    byte op8 =  t.nextByte();
                    switch(op8){
                        
                        case 1: 
                                Shampoo.imprimirDetalles();
                                System.out.println("Digite la cantiad:");
                                int valor = t.nextInt();                                
                                Shampoo.actualizarStok(valor);
                                precioFinal=precioFinal+Shampoo.facturar(valor);
                                System.out.println(+valor+" Unidades de Shampoo : "+Shampoo.facturar(valor));
                            break;
                        
                        case 2:
                                System.out.println("Digite la cantidad a remover");
                                int valor1 = t.nextInt();
                                Shampoo.actualizarStok(valor1*-1);
                                precioFinal=precioFinal-Shampoo.facturar(valor1);
                                System.out.println(+valor1+" Unidades de Shampoo : "+Shampoo.facturar(valor1));
                            break;
                            
                        case 3:
                            break;
                    }
                    
                    break;
                    
                case 9:
                    
                    break OUTER;
                default:
                    System.out.println("Numero no valido");
                    break;
            }
            
            //Fin del ciclo Switch
            
            
        }
        
        //Fin de la clase main
    }
    
    /**
     * Menu secundario del programa
     */
    public static void iniciar() {        
        
            System.out.println("--------Operaciones--------");
            System.out.println("1. Agregar al carrito      ");
            System.out.println("2. Remover del carrito     ");
            System.out.println("3. Volver                  ");
            System.out.println("---------------------------");
            
    }
    
}
