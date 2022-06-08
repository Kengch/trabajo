/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana3;

import javax.swing.JOptionPane;

/**
 *
 * @author kengc
 */
public class pila {
    private nodo nodo;
    
    public pila(){
        this.nodo = null;
    }
    
    public boolean esVacia(){
        if(nodo == null){
            return true;
        }
        return false;
    }
    
    public void apilar(){
        persona p = new persona();
        p.setNombre(JOptionPane.showInputDialog(null, "Digite su nombre"));
        p.setCedula(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite su numero de cedula")));
        nodo nuevo = new nodo();
        nuevo.setValue(p);
        if (esVacia()) {
            nodo = nuevo;
        }
        else{
            nuevo.setNext(nodo);
            nodo = nuevo;
        }
    }
    
    public void desapilar(){
        if (!esVacia()) {
            nodo = nodo.getNext();
            JOptionPane.showMessageDialog(null, "El elemento fue extraido");
        }
        else{
            JOptionPane.showMessageDialog(null, "El elemento no se pudo ser extraido");
        }
    }
    
    public String mostrar(){
        String s = "";
        if (!esVacia()) {
            nodo aux = this.nodo;
            while (aux != null){
                s = s + aux + "\n";
                aux = aux.getNext();
            }
        }
        return s;
    }
}
