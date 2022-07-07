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
        //stack <String> Pila = new stack<String>();
        //Pila.push("Jose");
        //Pila.push("Maria");
        //Pila.push("Pablo");
        //System.out.println(Pila.pop());
        //System.out.println(Pila.pop());
        //System.out.println(Pila.pop());
        //System.out.println(Pila.pop());
        
        //-------------Colas-------------
//        queue<Integer> cola = new queue<Integer>();
//        cola.enqueue(1);
//        cola.enqueue(2);
//        cola.enqueue(3);
//        System.out.println(cola.dequeue());
//        System.out.println(cola.dequeue().getValue());


        //-----------lista---------
        lista lista = new lista();
        lista.insertar(new persona(5, "Juan", 1111));
        lista.insertar(new persona(5, "Pedro", 2222));
        lista.insertar(new persona(15, "Pepe", 3333));
        lista.insertar(new persona(25, "Marco", 4444));
        lista.insertar(new persona(20, "Luis", 5555));

        lista.imprimirLista();
    }
    
}
