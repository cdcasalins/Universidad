package poo;

import java.util.ArrayList;

public class Universidad {

    ArrayList<Curso> cursos;
    ArrayList<Profesor> profesores;

    public Universidad() {
        cursos = new ArrayList();
        profesores = new ArrayList();

    }

    public void agregarProfesor(int id) {
        Profesor p1 = new Profesor(id);
        profesores.add(p1);
        

    }
    
    Profesor p;
    
    public void AgregarCurso(int nrc) {
        Curso c = new Curso(nrc);
        cursos.add(c);

    }

    public void RegistrarProfesorCurso(Profesor p, Curso c) {
        p.cursos.add(c);
        c.setProfesor(p);

    }

}
