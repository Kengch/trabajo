/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana3;

/**
 *
 * @author kengc
 */
public class Semana3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // int[] arr = {12, 34, 64, 2, 3};
        //-----RECURSIVIDAD-------
        //System.out.println(recursion.factorial(3));
        //System.out.println(recursion.encontrarMax(arr, 1, arr[0]));
        //System.out.println(recursion.buscarElemento(arr, 0, 5, arr.lenght));
        
        
        //----------PILAS----------
        stack <String> Pila = new stack<String>();
        Pila.push("Jose");
        Pila.push("Maria");
        Pila.push("Pablo");
        System.out.println(Pila.pop());
        System.out.println(Pila.pop());
        System.out.println(Pila.pop());
        System.out.println(Pila.pop());
    }
    
}
