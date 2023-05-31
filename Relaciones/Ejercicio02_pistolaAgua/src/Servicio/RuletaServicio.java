/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Jugador;
import Entidad.Revolver;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author iacon
 */
public class RuletaServicio {
    public void llenarRevolver(Revolver revolver) {
        Random random = new Random();
        revolver.setPosActual(random.nextInt(6)+1);
        revolver.setPosAgua(random.nextInt(6)+1);
    }
    
    public boolean mojar(Revolver revolver) {
        boolean corchazo = false;
        if (revolver.getPosActual() == revolver.getPosAgua()) {
            corchazo = true;
        }
        return corchazo;
    }
    
    public void sigChorro(Revolver revolver) {
      if ( revolver.getPosActual() < 6 ) {
          revolver.setPosActual(revolver.getPosActual() + 1);
      } else {
          revolver.setPosActual(1);
      }
    }
    
    public boolean disparo(Jugador jugador, Revolver revolver) {
        boolean seMojo = false;
        if(mojar(revolver)) {
            jugador.setMojado(true);
            seMojo = true;
        }
        return seMojo;
    }
    
    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver revolver) {
        for (int i = 0; i < 6; i++) {
            Jugador player = new Jugador();
            //player.setId(i+1);
            player.setNombre("Jugador ".concat(String.valueOf(player.getId())) );
            jugadores.add(player);
        }
        llenarRevolver(revolver);
    }
    
    public boolean ronda(Jugador jugador, Revolver revolver) {
        boolean continua = true;
        if (disparo(jugador, revolver)) {
            continua = false;
        }
        return continua;
    }
}
