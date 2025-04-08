package ec.edu.ups.clases;

public class Estudiante extends Persona{

    private String carrera;

    public Estudiante(){}

    public Estudiante(String cedula, String nombre, String apellido, String telefono, String correo, String carrera){
        super(cedula, nombre, apellido, telefono, correo);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "carrera='" + carrera + '\'' +
                '}';
    }
}
