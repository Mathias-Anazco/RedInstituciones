package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

public class Docente extends Persona{

    private List<String> titulosAcademicos;
    private List<String> areasDeEspecializacion;

    public Docente(){
        this.titulosAcademicos = new ArrayList<>();
        this.areasDeEspecializacion = new ArrayList<>();
    }
    public Docente(String cedula, String nombre, String apellido, String telefono, String correo){
        super(cedula, nombre, apellido, telefono, correo);
        this.titulosAcademicos = new ArrayList<>();
        this.areasDeEspecializacion = new ArrayList<>();
    }

    public List<String> getTitulosAcademicos() {
        return titulosAcademicos;
    }

    public void setTitulosAcademicos(List<String> titulosAcademicos) {
        this.titulosAcademicos = titulosAcademicos;
    }

    public List<String> getAreasDeEspecializacion() {
        return areasDeEspecializacion;
    }

    public void setAreasDeEspecializacion(List<String> areasDeEspecializacion) {
        this.areasDeEspecializacion = areasDeEspecializacion;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "titulosAcademicos=" + titulosAcademicos +
                ", areasDeEspecializacion=" + areasDeEspecializacion +
                '}';
    }
}
