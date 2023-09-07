/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos.modelos;

import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Producto {
    String descripcion;
    ArrayList<Integer> vector = new ArrayList<>();
    
    void mostrar (){
        System.out.println(descripcion);
    }
    
    public static void main(String[] args) {
        Producto unProducto = new Producto();
        unProducto.descripcion = "luquitas";
        System.out.println(unProducto.descripcion);
        System.out.println(unProducto.vector.size());
        unProducto.vector.add(1);
        unProducto.vector.add(2);
        unProducto.vector.add(3);
        unProducto.vector.add(4);
        System.out.println(unProducto.vector.size());
//        for (int i=0; i < unProducto.vector.size(); i++){
//            System.out.println(unProducto.vector.get(i));
//        }
//Otra forma de hacer el for:
        for(int i: unProducto.vector){
            System.out.println(i);
        }
        
        unProducto.mostrar();

    }
}
