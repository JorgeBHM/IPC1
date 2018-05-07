/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listacirculardoble;

/**
 *
 * @author Marrojor3
 */
public class NodoPersona {
    NodoPersona anterior;
    NodoPersona siguiente;
    Persona persona;

    public NodoPersona(Persona persona) {
        this.anterior = null;
        this.siguiente = null;
        this.persona = persona;
    }
        

}
