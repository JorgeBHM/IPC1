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
public class Persona {
    private int id;
    private String Nombre;
    private int edad;

    public Persona(int id, String Nombre, int edad) {
        this.id = id;
        this.Nombre = Nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return edad;
    }
        
}
/*Lista lista = new Lista();
        
        lista.Insertar_Final(new Persona(1,"Bryan1",21));
        lista.Insertar_Final(new Persona(2,"Bryan2",21));
        lista.Insertar_Final(new Persona(3,"Bryan3",21));
        lista.Insertar_Final(new Persona(4,"Bryan4",21));
        
        
        
        lista.Mostrar();
        
        NodoPersona busqueda= lista.Buscar(3);
        if(busqueda!=null){
            System.out.println("se encontro");
            System.out.println(busqueda.persona.getNombre());
        }
        else{
            System.out.println("no encontrado");
        }
        
        System.out.println("prueba eliminiar");
        
        lista.Eliminar(2);
        lista.Mostrar();
        
        System.out.println("prueba modificar");
        
        lista.Modificar(3, new Persona(5,"bryan5",21));
        lista.Mostrar();*/