package Service;

import Entidad.Curso;
import java.util.Scanner;

public class CursoService {

    Scanner sc = new Scanner(System.in);

    public Curso crearCurso() {
        System.out.println("Ingrese el nombre del curso");
        String nombreCurso = sc.next();
        System.out.println("Ingrese la cantidad horas por dia");
        double cantidadHoraPorDia = sc.nextDouble();
        System.out.println("Ingrese la cantidad de dias por semana");
        int cantidadDiasPorSemana = sc.nextInt();
        System.out.println("Ingrese el precio por hora");
        double precioPorHora = sc.nextDouble();
        System.out.println("Ingrese el turno");
        String turno = sc.next();
        
        Curso curso1 = new Curso(nombreCurso, cantidadHoraPorDia, cantidadDiasPorSemana, turno, precioPorHora);
        
        String[] alumnos = cargarAlumnos(curso1);
        curso1.setAlumnos(alumnos);
        
        return curso1;
    }

    public String[] cargarAlumnos(Curso curso1) {
        
        String[] alumnos = new String[curso1.getAlumnos().length];
        for (int i = 0; i < curso1.getAlumnos().length; i++) {
            System.out.println("Ingrese el alumno: " + i + 1);
            alumnos[i] = sc.next();
        }
        return alumnos;
    }
    
    public void calcularGananciaSemanal(Curso curso1){
        
        System.out.println("La ganancia semanal es: " + (curso1.getCantidadHorasPorDia()*curso1.getPrecioPorHora()*curso1.getAlumnos().length)*curso1.getCantidadDiasPorSemana());
    }

}
