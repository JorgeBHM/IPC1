/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacirculardoble;

import javax.swing.JOptionPane;

/**
 *
 * @author Marrojor3
 */
public class Lista {
    NodoPersona Inicio;
    int tamano;
    
    public Lista(){
        this.Inicio = null;
        this.tamano = 0;
    }
    
    public boolean Vacia(){
        boolean vacia = false;
        if(tamano == 0){
            vacia = true;
        }
        return vacia;
    }
    
    public int tamano(){
        return tamano;
    }
    
    public void Insertar_Inicio(Persona persona){
        NodoPersona nuevo = new NodoPersona(persona);
        if(Vacia()){
            Inicio = nuevo;
            nuevo.siguiente = nuevo;
            nuevo.anterior = nuevo;
            tamano++;
        }
        else{
            Inicio.anterior.siguiente = nuevo;
            nuevo.anterior = Inicio.anterior;
            nuevo.siguiente = Inicio;
            Inicio.anterior = nuevo;
            Inicio = nuevo;
            tamano++;
        }
    }
    
    public void Insertar_Final(Persona persona){
        NodoPersona nuevo = new NodoPersona(persona);
        if(Vacia()){
            Inicio = nuevo;
            nuevo.siguiente = nuevo;
            nuevo.anterior = nuevo;
            tamano++;
        }
        else{
            Inicio.anterior.siguiente = nuevo;
            nuevo.anterior = Inicio.anterior;
            nuevo.siguiente = Inicio;
            Inicio.anterior = nuevo;
            tamano++;
        }
    }
    public NodoPersona Buscar (int id){
        NodoPersona nodo = null;
        NodoPersona aux = Inicio;
        for(int i=0;i<tamano;i++){
            if(aux.persona.getId() == id){
                nodo = aux;
                break;
            }
            aux = aux.siguiente;
        }
        return nodo;
    }
    public void Modificar(int id, Persona persona){
        NodoPersona busqueda = Buscar(id);
        if(busqueda!=null){
            busqueda.persona = persona;
            JOptionPane.showMessageDialog(null,"Modificacion realizada");
        }
        else{
            JOptionPane.showMessageDialog(null,"Error");
        }
    }
    public void Eliminar(int id){
        NodoPersona busqueda = Buscar(id);
        if(busqueda!=null){
            busqueda.anterior.siguiente = busqueda.siguiente;
            busqueda.siguiente.anterior = busqueda.anterior;
            if(busqueda == Inicio){
                Inicio = busqueda.siguiente;
            }
            tamano--;
            JOptionPane.showMessageDialog(null,"Eliminacion realizada");
        }
        else{
            JOptionPane.showMessageDialog(null,"Error");
        }
    }
}
