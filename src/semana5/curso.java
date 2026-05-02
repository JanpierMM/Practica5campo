/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ingenieria
 */
public class curso {
    private String nrc;
    private String Nombre;
    private int credito;
    private ArrayList<alumno> alumnos;
    
    public curso (String nrc,String Nombre,int creditos){
        this.Nombre = Nombre;
        this.nrc = nrc;
        this.credito = creditos;
        alumnos = new ArrayList<>();
    }
    public void AsignarEstudiante(alumno e){
        if(!algo(e.GetCodigo())){
            if (e.GetEdad()>0){
                alumnos.add(e);
            }
            else
                System.out.print("La EDAD debe ser mayor a 0");
        }else
            System.out.println("Ya registrado");
    }
     public void AsignarEstudiante(int codigo, String Nombre,int edad){
        if(!algo(codigo)){
            if (edad>0){
            alumnos.add(new alumno(codigo,Nombre,edad));
            }
            else
                System.out.println("La EDAD debe ser mayor a 0");
        }else
            System.out.println("ya registrado");
    }
    public boolean algo(int codogo){
        for (alumno e: alumnos){
            if (e.GetCodigo()==codogo)
                return true;
        }
        return false;
        
    }
    public boolean buscar(int codigo,int edad)
    {
        for(alumno e:alumnos){
            if(e.GetCodigo()== codigo)
           e.setEdad(edad);
            return true;
        }
        return false;
    }
    
    public String ListadoEstudiantes(){
        StringBuilder sb = new StringBuilder();
        int indice=0;
        sb.append("NRC: ").append(this.nrc).append(" ").append(this.Nombre).append("\n");
        sb.append("Listado\n");
        for(alumno e:alumnos){
            indice++;
            sb.append(indice).append(e.GetEstudiante()).append("\n");
        }
        return sb.toString();
    }
    
}
