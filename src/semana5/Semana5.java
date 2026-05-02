/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana5;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Ingenieria
 */
public class Semana5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op;
        
        curso c = new curso("5435","sdjclh",5);
        Scanner sc = new Scanner(System.in);
        
        
        do{
            System.out.println("Eliga una opcion");
            System.out.println("1. Registro");
            System.out.println("2. listado");
            System.out.println("3. Buscar");
            System.out.println("4. salir");
            op=sc.nextInt();
          switch(op){
              
              case 1:
                  try
                  {
                      System.out.println("Ingrese el Codigo");
                        int Codigo = sc.nextInt();
                      System.out.println("Ingrese el Nombre");
                        String Nombre = sc.next();
                      System.out.println("Ingrese su edad");
                        int edad = sc.nextInt();
                      alumno p1 = new alumno(Codigo,Nombre,edad);
                        c.AsignarEstudiante(p1);
                  }catch(InputMismatchException e){
                  System.out.println("Error: Rellene bien los campos "+ e);
                  sc.next();
                  }
                  break;
              case 2:
                  System.out.println(c.ListadoEstudiantes());
                  break;
              case 3:
                  try
                  {
                  System.out.println("Codigo del alumno: ");
                  int CodigoBuscar = sc.nextInt();
                  System.out.println("Ingrese su edad");
                  int edadb = sc.nextInt();
                  boolean rep =c.buscar(CodigoBuscar, edadb);
                  }catch(InputMismatchException e){
                      System.out.println("Error: Rellene bien los campos "+ e);
                        sc.next();
                  }
                  break;
              case 4:
                  System.out.println("Saliendo.......");
                  break;
              default:
                  System.out.println("Ingrese una opcion valida");
                  break;
          }  
        }while(op!=4);
    }
    
}
