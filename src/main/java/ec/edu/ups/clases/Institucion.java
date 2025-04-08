package ec.edu.ups.clases;

import java.util.List;

public class Institucion {

    private int id;
    private String nombreInstitucion;
    private List<String> sedes;
    private Direccion direccion;
    private List<Asignacion> asignaciones;

    public Institucion(){}

    public Institucion(int id, String nombreInstitucion, List<String> sedes, Direccion direccion, List<Asignacion> asignaciones){
        this.id = id;
        this.nombreInstitucion = nombreInstitucion;
        this.sedes = sedes;
        this.direccion = direccion;
        this.asignaciones = asignaciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreInstitucion() {
        return nombreInstitucion;
    }

    public void setNombreInstitucion(String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }

    public List<String> getSedes() {
        return sedes;
    }

    public void setSedes(List<String> sedes) {
        this.sedes = sedes;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public List<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(List<Asignacion> asignaciones) {
        this.asignaciones = asignaciones;
    }

    @Override
    public String toString() {
        return "Institucion{" +
                "id=" + id +
                ", nombreInstitucion='" + nombreInstitucion + '\'' +
                ", sedes=" + sedes +
                ", direccion=" + direccion +
                ", asignaciones=" + asignaciones +
                '}';
    }
}
