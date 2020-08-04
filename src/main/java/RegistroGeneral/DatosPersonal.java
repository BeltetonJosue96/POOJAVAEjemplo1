/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegistroGeneral;

/**
 *
 * @author beltetonjosue96
 */
public class DatosPersonal {
    private String Nombre;
    private String Apellido;
    private String Especialidad;
    
    public DatosPersonal (String Nombre, String Apellido, String Especialidad){
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Especialidad = Especialidad;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public String getApellido(){
        return Apellido;
    }
    
    public String getEspecialidad(){
        return Especialidad;
    }
}
