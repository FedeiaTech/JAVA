/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import Enum.Coberturas;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Poliza {
    
//    LocalDate fecha2 = LocalDate.parse("yyyy-MM-dd");

    private int numero;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private int cuotas;
    private String formaPago;
    private Coberturas cobertura;
    private Cliente cliente;
    private Auto auto;
    private Cuota cuota;

    public Poliza() {
    }

    public Poliza(int numero, LocalDate fechaInicio, int cuotas, String formaPago, Coberturas cobertura) {
        this.numero = numero;
        this.fechaInicio = fechaInicio;
        this.cuotas = cuotas;
        this.formaPago = formaPago;
        this.cobertura = cobertura;
    }

    public Poliza(int numero, LocalDate fechaInicio, int cuotas, String formaPago, Coberturas cobertura, Cliente cliente, Auto auto) {
        this.numero = numero;
        this.fechaInicio = fechaInicio;
        this.cuotas = cuotas;
        this.formaPago = formaPago;
        this.cobertura = cobertura;
        this.cliente = cliente;
        this.auto = auto;
    }
    
    public Poliza crearPoliza() {
        Scanner ingrese = new Scanner(System.in).useDelimiter("\n");

        //Periodo poliza
        System.out.println("La cobertura empieza hoy? s/n");
        String opcion = ingrese.nextLine();

        LocalDate fechaI = LocalDate.now();

        if (opcion.equalsIgnoreCase("n")) {
            System.out.println("Ingrese la fecha de inicio con guiones (dd-mm-aaaa)");
            fechaI = LocalDate.parse(ingrese.nextLine());
        }

        System.out.println("La poliza tendra una duracion de 6 meses");
        LocalDate fechaFin = fechaI.plusMonths(6);

        //Tipo de cobertura
        System.out.println("Seleccione el tipo de cobertura (Total, Parcial, Terceros)");
        String tipo = ingrese.nextLine();

        switch (tipo.toLowerCase()) {
            case "total": {
                Coberturas cobertura = Coberturas.TOTAL;
                break;
            }
            case "parcial": {
                Coberturas cobertura = Coberturas.PARCIAL;
                break;
            }
            case "terceros": {
                Coberturas cobertura = Coberturas.TERCEROS;
                break;
            }
        }
        
        //Cliente
        Cliente cliente = new Cliente();
        
        cliente.crearClienteAuto();
        
        //Auto
        Auto auto = new Auto();
        
        auto.crearAutoAuto();
        
        //verificador
        System.out.println(numero );
        System.out.println(fechaInicio );
        System.out.println(cuotas );
        System.out.println(formaPago );
        System.out.println(cobertura );
        System.out.println(cliente );
        System.out.println(auto );
        
        return new Poliza(numero, fechaInicio, cuotas, formaPago, cobertura, cliente, auto);
        
    }
    
    public void agregarPoliza() {
        
    }

    
    @Override
    public String toString() {
        return "Poliza{" + ", numero=" + numero + ", fechaInicio=" +
                fechaInicio + ", fechaFin=" + fechaFin + ", cuotas=" + cuotas + ", formaPago=" +
                formaPago + ", cobertura=" + cobertura;
//                + ", cliente=" + cliente + ", auto=" + auto.toString() + ", cuota=" + cuota.toString() + '}';
    }
    
    
}
