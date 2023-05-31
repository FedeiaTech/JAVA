/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author iacon
 */
public class Cuota {
    private int numeroCuota;
    private double monto;
    private String formaPago;
    private boolean pagada;
    private LocalDate vencimiento;

    public Cuota() {
    }

    public Cuota(int numeroCuota, double monto, String formaPago, boolean pagada, LocalDate vencimiento) {
        this.numeroCuota = numeroCuota;
        this.monto = monto;
        this.formaPago = formaPago;
        this.pagada = pagada;
        this.vencimiento = vencimiento;
    }
    
    public void crearListaCuotas() {
        ArrayList<Cuota> listaCuotas = new ArrayList<>();
        
        System.out.println("");
    }
    
//    private Cuota crearCadaCuota(int numcuot) {
//        for (int i = 0; i < numcuot; i++) {
//            
//        }
//    }
}
