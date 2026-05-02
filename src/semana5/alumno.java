/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana5;

/**
 *
 * @author Ingenieria
 */
public class alumno {
    private int codigo;
    private String nombre;
    private int edad;
    
    public alumno(int codigo, String nombre,int edad){
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
    }
    public alumno(int codigo, String nombre){
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = 0;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int GetEdad(){
        return this.edad;
    }
    public int GetCodigo(){
        return this.codigo;
    }
    public String GetEstudiante(){
        return this.codigo+"Nombre: "+this.nombre;
    }
}
