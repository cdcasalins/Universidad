package poo;

import java.util.Scanner;

public class POO {
    
    public static void main(String[] args) {
        Universidad U=new Universidad();
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Crear curso ");
        System.out.println(" Digite NRC ");
        int nrc = leer.nextInt();
        Curso c = new Curso(nrc);
        U.cursos.add(c);
        System.out.println("Crear profesor");
        System.out.println("Digite el codigo del pofesor");
        int id = leer.nextInt();
        Profesor nuevop = new Profesor(id);
        
        U.profesores.add(nuevop);
        U.cursos.get(nrc).setProfesor(nuevop);
        System.out.println(U.cursos.get(nrc).getProfesor());
    }
    
}
        
