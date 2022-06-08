/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana3;

/**
 *
 * @author kengc
 */
public class queue<T> {
    private node<T> head;
    private node<T> tail;
    
    public void enqueue(T value){
        node<T> newNode = new node<T> (value);
        
        if (head == null) {
            head = newNode;
            tail = newNode;
        }
        else{
            tail.setNext(newNode);
            tail = newNode;
        }
    }
}
