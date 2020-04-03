/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import exceptions.AlumnoExistenteException;
import exceptions.AlumnoInexistenteException;
import java.util.ArrayList;
import objects.Alumno;

/**
 *
 * @author Maryt
 */
public class Controlador {
   
    private ArrayList<Alumno> alumnos;
    
    public Controlador(){
        alumnos=new ArrayList<>();
    }
    
    public void addAlumno(Alumno alumno) throws AlumnoExistenteException{
        if(alumnos.contains(alumno)){
        throw new AlumnoExistenteException();
        }else{              
        alumnos.add(alumno);
        }
    }
        
    public ArrayList<Alumno> getAlumnos(){
        return alumnos;
    }
    
    public Alumno getAlumno( String matricula) throws AlumnoInexistenteException{
        int index=alumnos.indexOf(new Alumno(matricula));
        if(index<0){
            throw new AlumnoInexistenteException();
        }
        return alumnos.get(index);
    
    }
    
    public Alumno getAlumno(int index){
        return alumnos.get(index);
    }
    
    public int getAlumnosCount(){
    return alumnos.size();
    }
    /*
    public static void main(String[] args) {
        Controlador controlador= new Controlador();
        Alumno a = new Alumno("a");
        Alumno b= new Alumno("b");
        Alumno c= new Alumno("c"); 
        c.setNombre("Mtt");
    try{
        controlador.addAlumno(a);
        controlador.addAlumno(b);
        controlador.addAlumno(c);
        System.out.println("fine");
        Alumno tmp=controlador.getAlumno("c");
        System.out.println(tmp.getNombre());
    }catch(AlumnoExistenteException ex){
        ex.printStackTrace();
    }catch(AlumnoInexistenteException ex){
        ex.printStackTrace();
    }   
    }*/


}
