/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana3;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author kengc
 */
public class lista {
    private node<persona> cabeza;

    public lista(){
        cabeza = null;
    }

    //agrega al final de la lista
    public void insertar (persona value){
        if (validar(value.getId()) == false) {
            node<persona> node = new node<persona>();
            node.setValue(value);
        
        //si esta vacio
        if (cabeza == null) {
            cabeza = node;
        }
        else{
            node<persona> aux = cabeza;
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(node);
        }
        
        /*if (cabeza == null){
            cabeza = node;
        }
        else{
            cabeza.setNext(node);
            cabeza = node;
        }*/
        /*else if (cabeza.getValue().getId() > value.getId()) {
            node<persona> node = new node<persona>(value);
            cabeza.setNext(node);
            cabeza = node;
        }
        else if (cabeza.getValue().getId() < value.getId()) {
            node<persona> aux = new node<persona>(value);
            cabeza.setNext(aux);
        }
        else{
            node<persona> aux = cabeza;
            while(aux.getNext() != null &&
                aux.getNext().getValue().getId() < value.getId()){
                aux = aux.getNext();
            }
            node<persona> Temp = new node<persona>(value);
            Temp.setNext(aux.getNext());
            aux.setNext(Temp);
        }*/
        }
        else{
            System.out.println("El id " + value.getId() + " ya existe");
        }
    }

    public void imprimirLista(){
        node<persona> aux = cabeza;
        while(aux != null){
            System.out.println(aux.getValue().getId() +"\n"+ aux.getValue().getNombre() +"\n"+
                aux.getValue().getCedula());
            aux = aux.getNext();
        }
    }

    public boolean validar(int id){
        if (cabeza == null) {
            return false;
        }
        else{
            node<persona> aux = cabeza;
        while (aux != null){
            if (aux.getValue().getId() == id) {
                return true;
            }
            aux = aux.getNext();
        }
        return false;
        }
    }
}