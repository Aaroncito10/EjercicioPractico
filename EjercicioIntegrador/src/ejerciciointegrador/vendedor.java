/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciointegrador;

import java.util.Scanner;


/**
 *
 * @author aaron
 */
public class vendedor {

    //Arreglo para guardar los productos
    String produc[];

    public void ventas() {
        Scanner scanner = new Scanner(System.in);
        int cantidadProduc;
        System.out.println("Bienvenido, ingrese por favor los productos que desea ingresar: ");
        cantidadProduc = scanner.nextInt();
        produc = new String[cantidadProduc]; //Donde se van a guardar los productos

    }
    
    public void totalVentas(){
    
        
    
    }
}
