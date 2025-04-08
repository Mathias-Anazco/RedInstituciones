package ec.edu.ups.clases;

import java.util.ArrayList;
import java.util.List;

public class Administrativo extends Persona{

    private List<String> cargos;
    private List<String> responsabilidades;

    public Administrativo(){
        this.cargos = new ArrayList<>();
        this.responsabilidades = new ArrayList<>();
    }
    public Administrativo(String cedula, String nombre, String apellido, String telefono, String correo){
        super(cedula, nombre, apellido, telefono, correo);
        this.cargos = new ArrayList<>();
        this.responsabilidades = new ArrayList<>();
    }

    public List<String> getCargos() {
        return cargos;
    }

    public void setCargos(List<String> cargos) {
        this.cargos = cargos;
    }

    public List<String> getResponsabilidades() {
        return responsabilidades;
    }

    public void setResponsabilidades(List<String> responsabilidades) {
        this.responsabilidades = responsabilidades;
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "cargos=" + cargos +
                ", responsabilidades=" + responsabilidades +
                '}';
    }
}
