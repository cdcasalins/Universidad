package poo;

import java.util.ArrayList;

public class Curso {

    public int nrc;
    private Profesor profesor;
    ArrayList<Estudiante> EstudiantesC;

    public Curso(int nrc) {
        this.nrc = nrc;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        if (this.profesor == null) {
            this.profesor = profesor;
        }

    }

    public int getNrc() {
        return nrc;
    }

}
