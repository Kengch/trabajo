/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana3;

/**
 *
 * @author kengc
 */
public class stack<T> {
    private node<T> top;
    private int cantidad;
    
    public void push(T value){
        node<T> newNode = new node<T>(value);
        
        if (top == null) {
            top = newNode;
            this.cantidad = this.cantidad + 1;
        }
        else{
            newNode.setNext(top);
            top = newNode;
        }
    }
    
    public T pop(){
        node<T> aux = top;
        if (top != null) {
            top = top.getNext();
            return aux.getValue();
        }
        else{
            return null;
        }
    }
}
