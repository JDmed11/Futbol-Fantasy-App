package model;

import java.util.ArrayList;

public class EquipoReal extends Equipo{
    private ArrayList<JugadorReal> jugadoresEquipo = new ArrayList<>();
    
    /**
     * Constructor 
     * @param pNombreEquipo
     */
    public EquipoReal(String pNombreEquipo){
        super(pNombreEquipo);
    }
    /**
     * Agrega un jugador a la lista de jugadores del equipo
     * @param pNuevoJugador
     */
    public void agregarJugador(JugadorReal pNuevoJugador){
        this.jugadoresEquipo.add(pNuevoJugador);
    }  

    /**
     * Crea una lista con los jugadores que tiene la posicion buscada
     * @param pPosicion
     * @return
     */
    public ArrayList<Jugador> getJugadoresPorPosicion(Posicion pPosicion) {
        ArrayList<Jugador> jugadores = new ArrayList<>();
        for(JugadorReal jugador: this.jugadoresEquipo){
            if(jugador.getPosicionJugador().equals(pPosicion)){
                jugadores.add(jugador);
            }
        }
        return jugadores;
    }

    @Override
    public String getNombreEquipo() {
        return super.getNombreEquipo();
    }
}
