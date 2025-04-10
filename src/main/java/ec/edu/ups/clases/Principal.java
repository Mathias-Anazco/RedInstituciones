package ec.edu.ups.clases;

import ec.edu.ups.enums.Rol;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Principal {
    public static void main(String[] args) {

        Institucion institucion1 = new Institucion(1, "Universidad Politecnica Salesiana");
        institucion1.getSedes().add("Campus Sede Cuenca");
        institucion1.addDireccion("C. Vieja", "Av. Elia Luit", "001", "Ecuador", "Azuay", "Cuenca", "INSTITUCION");

        Institucion institucion2 = new Institucion(2, "Universidad San Francisco");
        institucion2.getSedes().add("Campus Cumbayá");
        institucion2.addDireccion("Diego de Robles", "Interoceánica", "210", "Ecuador", "Pichincha", "Quito", "INSTITUCION");

        Estudiante estudiante = new Estudiante("0102030405", "Pedro", "Pesantez", "0987654321", "Pedro@mail.com", "Ingeniería en Sistemas");
        Docente docente = new Docente("0203040506", "Ana", "Martínez", "0998765432", "ana@mail.com");
        docente.getTitulosAcademicos().add("Magíster en Matemáticas");
        docente.getAreasDeEspecializacion().add("Cálculo Integral");

        Administrativo administrativo = new Administrativo("0304050607", "Carlos", "López", "0976543210", "carlos@mail.com");
        administrativo.getCargos().add("Coordinador de Recursos");
        administrativo.getResponsabilidades().add("Gestión Administrativa");

        Visitante visitante = new Visitante("0405060708", "María", "Ramos", "0965432109", "maria@mail.com", "Charla sobre Innovación Educativa",
                new GregorianCalendar(2024, 4, 10), new GregorianCalendar(2024, 4, 12));

        GregorianCalendar fechaEstudiante = new GregorianCalendar(2024, 4, 10);
        Asignacion asignacionEstudiante = new Asignacion(estudiante, fechaEstudiante, Rol.ESTUDIANTE);
        institucion1.getAsignaciones().add(asignacionEstudiante);

        GregorianCalendar fechaDocente = new GregorianCalendar(2024, 4, 10);
        Asignacion asignacionDocente = new Asignacion(docente, fechaDocente, Rol.DOCENTE);
        institucion1.getAsignaciones().add(asignacionDocente);

        GregorianCalendar fechaAdministrativo = new GregorianCalendar(2024, 4, 10);
        Asignacion asignacionAdministrativo = new Asignacion(administrativo, fechaAdministrativo, Rol.ADMINISTRATIVO);
        institucion2.getAsignaciones().add(asignacionAdministrativo);

        GregorianCalendar fechaVisitante = new GregorianCalendar(2024, 4, 10);
        Asignacion asignacionVisitante = new Asignacion(visitante, fechaVisitante, Rol.VISITANTE);
        institucion2.getAsignaciones().add(asignacionVisitante);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("----- INSTITUCIÓN 1 -----");
        System.out.println("Nombre: " + institucion1.getNombreInstitucion());
        System.out.println("Sedes: " + institucion1.getSedes());
        System.out.println("Dirección:");
        System.out.println("  " + institucion1.getDireccion());

        System.out.println("\n----- ESTUDIANTE -----");
        System.out.println(estudiante);

        System.out.println("\n----- DOCENTE -----");
        System.out.println(docente);

        System.out.println("\n----- ASIGNACIONES INSTITUCIÓN 1 -----");
        System.out.println("Estudiante: " + asignacionEstudiante.getRol() + ", Fecha de inicio: " + sdf.format(asignacionEstudiante.getFechaInicio().getTime()));
        System.out.println("Docente: " + asignacionDocente.getRol() + ", Fecha de inicio: " + sdf.format(asignacionDocente.getFechaInicio().getTime()));

        System.out.println("\n----- INSTITUCIÓN 2 -----");
        System.out.println("Nombre: " + institucion2.getNombreInstitucion());
        System.out.println("Sedes: " + institucion2.getSedes());
        System.out.println("Dirección:");
        System.out.println("  " + institucion2.getDireccion());

        System.out.println("\n----- ADMINISTRATIVO -----");
        System.out.println(administrativo);

        System.out.println("\n----- VISITANTE -----");
        System.out.println(visitante);

        System.out.println("\n----- ASIGNACIONES INSTITUCIÓN 2 -----");
        System.out.println("Administrativo: " + asignacionAdministrativo.getRol() + ", Fecha de inicio: " + sdf.format(asignacionAdministrativo.getFechaInicio().getTime()));
        System.out.println("Visitante: " + asignacionVisitante.getRol() + ", Fecha de entrada: " + sdf.format(asignacionVisitante.getFechaInicio().getTime()));
    }
}
