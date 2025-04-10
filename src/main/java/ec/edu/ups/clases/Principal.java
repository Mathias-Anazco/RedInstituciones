package ec.edu.ups.clases;

import ec.edu.ups.enums.Rol;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Principal {
    public static void main(String[] args) {

        Institucion institucion = new Institucion(1, "Universidad Politecnica Salesiana");
        institucion.getSedes().add("Campus Sede Cuenca");
        institucion.addDireccion("C. Vieja", "Av. Elia Luit", "001", "Ecuador", "Azuay", "Cuenca", "INSTITUCION");

        Estudiante estudiante = new Estudiante("0102030405", "Pedro", "Pesantez", "0987654321", "Pedro@mail.com", "Ingeniería en Sistemas");
        estudiante.addDireccion(new Direccion("Barrial Blanco", "Del Artesano", "123", "Ecuador", "Azuay", "Cuenca", "CASA"));

        GregorianCalendar fecha = new GregorianCalendar(2024, 4, 10);
        Asignacion asignacion = new Asignacion(estudiante, fecha, Rol.ESTUDIANTE);
        institucion.getAsignaciones().add(asignacion);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.println("----- INSTITUCIÓN -----");
        System.out.println("Nombre: " + institucion.getNombreInstitucion());
        System.out.println("Sedes: " + institucion.getSedes());
        System.out.println("Dirección:");
        System.out.println("  " + institucion.getDireccion());

        System.out.println("\n----- ESTUDIANTE -----");
        System.out.println(estudiante);

        System.out.println("\n----- ASIGNACIÓN -----");
        System.out.println("Rol: " + asignacion.getRol());
        System.out.println("Fecha de inicio: " + sdf.format(asignacion.getFechaInicio().getTime()));
    }
}