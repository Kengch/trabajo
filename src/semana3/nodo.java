/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana3;

/**
 *
 * @author kengc
 */
public class nodo {
    private persona value;
    private nodo next;
    
    public nodo(){
        this.next = null;
    }

    public persona getValue() {
        return value;
    }

    public void setValue(persona value) {
        this.value = value;
    }

    public nodo getNext() {
        return next;
    }

    public void setNext(nodo next) {
        this.next = next;
    }
}
